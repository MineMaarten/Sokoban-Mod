package sokobanMod.common.gen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.ReflectionHelper;

public class Generator{

    public Generator(World world, int baseX, int baseY, int baseZ, String resourceLocation, Class classInput){
        List<String> txtInput = readFile(resourceLocation);

        String[] maxBounds = txtInput.get(0).split(",");
        int maxX = Integer.parseInt(maxBounds[0]) + baseX;
        int maxY = Integer.parseInt(maxBounds[1]) + baseY;
        int maxZ = Integer.parseInt(maxBounds[2]) + baseZ;

        boolean start = false;
        for(int i = 0; i < txtInput.size(); i++) {
            String line = txtInput.get(i);
            if(start && !line.startsWith("//") && !line.equals("")) {
                if(Character.isDigit(line.charAt(0))) {
                    String[] lineParts = line.split(",");
                    int x = Integer.parseInt(lineParts[0]) + baseX;
                    int y = Integer.parseInt(lineParts[1]) + baseY;
                    int z = Integer.parseInt(lineParts[2]) + baseZ;
                    int metadata = Integer.parseInt(lineParts[4]);
                    GenUtils.setBlock(world, lineParts[3], x, y, z, metadata);
                    if(lineParts.length > 5) {
                        handleFunctions(world, x, y, z, classInput, lineParts[5]);//TE function
                    }
                } else {
                    handleFunctions(world, baseX, baseY, baseZ, classInput, line);//custom function
                }
            } else if(line.startsWith("START")) {
                start = true;
                CustomGenerationGenerateEvent event = new CustomGenerationGenerateEvent(world, baseX, baseY, baseZ, maxX, maxY, maxZ, txtInput.subList(0, i));
                MinecraftForge.EVENT_BUS.post(event);
                if(event.isCanceled) break;
                for(int x = baseX; x <= maxX; x++) {
                    for(int y = baseY; y <= maxY; y++) {
                        for(int z = baseZ; z <= maxZ; z++) {
                            world.setBlock(x, y, z, Blocks.air, 0, 2);//TODO check flag.
                        }
                    }
                }
            }
        }
    }

    private List<String> readFile(String resourceLocation){
        try {
            IResourceManager manager = FMLClientHandler.instance().getClient().getResourceManager();
            ResourceLocation location = new ResourceLocation(resourceLocation);
            IResource resource;

            resource = manager.getResource(location);

            InputStream stream = resource.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
            List<String> textList = new ArrayList<String>();
            String line = br.readLine();
            while(line != null) {
                textList.add(line);
                line = br.readLine();
            }
            br.close();
            return textList;
        } catch(IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("[Sokoban] Error while reading file");
        }
    }

    private void handleFunctions(World world, int x, int y, int z, Class target, String functionName){
        try {
            Method method = ReflectionHelper.findMethod(target, null, new String[]{functionName}, World.class, int.class, int.class, int.class);
            method.invoke(null, world, x, y, z);
        } catch(Exception e) {
            throw new IllegalArgumentException("Every world gen function needs the following parms: World, int, int, int. Name: " + functionName);
        }
    }
}
