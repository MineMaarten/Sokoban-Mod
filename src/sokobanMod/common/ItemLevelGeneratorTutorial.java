package sokobanMod.common;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import sokobanMod.common.gen.levelGenBase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class ItemLevelGeneratorTutorial extends Item{

    public ItemLevelGeneratorTutorial(int par1){
        super(par1);
        setHasSubtypes(true);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister){
        itemIcon = par1IconRegister.registerIcon("sokobanMod:ItemLevelGenerator");
    }

    @Override
    public String getItemDisplayName(ItemStack is){
        if(is.getItemDamage() < 1000) return "Tutorial Level #" + (is.getItemDamage() + 1) + " Generator";
        if(is.getItemDamage() < 2000) return "Easy Level #" + (is.getItemDamage() - 999) + " Generator";
        return "Hard Level #" + (is.getItemDamage() - 2999) + " Generator";
    }

    @Override
    public int getMetadata(int meta){
        return meta;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs tab, List subItems){
        for(int ix = 0; ix < SokobanMod.TUTORIAL_LEVEL_AMOUNT; ix++) {
            subItems.add(new ItemStack(this, 1, ix));
        }
        for(int ix = 0; ix < SokobanMod.EASY_LEVEL_AMOUNT; ix++) {
            subItems.add(new ItemStack(this, 1, ix + 1000));
        }
        for(int ix = 0; ix < SokobanMod.HARD_LEVEL_AMOUNT; ix++) {
            subItems.add(new ItemStack(this, 1, ix + 3000));
        }
    }

    @Override
    public boolean onItemUse(ItemStack iStack, EntityPlayer player, World world, int x, int y, int z, int side, float par8, float par9, float par10){
        if(!world.isRemote) {
            int baseX = x;
            int baseY = y + 1;
            int baseZ = z;
            int levelX = SokobanUtils.getLevelBounds(iStack.getItemDamage())[0];
            // int levelY =
            // SokobanUtils.getLevelBounds(iStack.getItemDamage())[1];
            int levelZ = SokobanUtils.getLevelBounds(iStack.getItemDamage())[2];
            switch(SokobanUtils.determineOrientation(player)){
                case 0:
                    // baseZ += 2;
                    baseX -= levelX / 2;
                    break;
                case 1:
                    baseX -= levelX;// +2
                    baseZ -= levelZ / 2;
                    break;
                case 2:
                    baseZ -= levelZ;// +2
                    baseX -= levelX / 2;
                    break;
                case 3:
                    // baseX += 2;
                    baseZ -= levelZ / 2;
            }
            boolean succesfullySpawned = SokobanMod.worldGenerator.generateSokobanLevel(world, levelGenBase.generateItem, player, baseX, baseY, baseZ, iStack.getItemDamage() + 1);
            if(succesfullySpawned) iStack.stackSize--;
        }

        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List infoList, boolean par4){
        String name = "";
        String author = "";
        switch(stack.getItemDamage()){
            case 0:
                name = "The Basics";
                break;
            case 1:
                name = "Double Trouble";
                break;
            case 2:
                name = "Doors";
                break;
            case 3:
                name = "The Other Side Of The Door";
                break;
            case 4:
                name = "Care";
                break;
            case 5:
                name = "Vaporizers";
                break;

            case 1000:
                name = "Vaporizing Loot";
                break;
            case 1001:
                name = "Overview";
                break;
            case 1002:
                name = "A Race Against The Clock";
                break;
            case 1003:
                name = "Warehouse";
                author = "Simon Q";
                break;
            case 1004:
                name = "Companion";
                break;
            case 1005:
                name = "The Maze";
                author = "Lego_World_7307";
                break;
            case 3000:
                name = "Colours";
                author = "Emiiitje";
                break;
        }

        if(name.length() != 0) {
            infoList.add("\u00a72'" + name + "'");
        } else {
            infoList.add("\u00a7C-Not Implemented Yet-");
        }
        if(author.length() != 0) {
            infoList.add("Made by " + author);
        }
    }

}
