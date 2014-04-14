package sokobanMod.common.gen;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class GenUtils{

    public static void setBlock(World world, String blockName, int x, int y, int z, int metadata){
        String[] nameParts = blockName.split(":");
        Block block = GameRegistry.findBlock(nameParts[0], nameParts[1]);
        if(block == null) {
            System.err.println("[Sokoban] Not able to set the block " + blockName);
        } else {
            world.setBlock(x, y, z, block, metadata, 2);//TODO check flag.'
        }
    }

    public static boolean isInstableBlock(Block block){

        return true;
    }

    public static void writeFile(List<String> text, String fileLocation){
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileLocation)));
            for(String line : text) {
                bw.write(line + System.getProperty("line.separator"));
            }
            bw.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
