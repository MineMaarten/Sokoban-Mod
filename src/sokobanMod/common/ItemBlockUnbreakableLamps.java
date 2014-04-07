package sokobanMod.common;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class ItemBlockUnbreakableLamps extends ItemBlock{

    private final static String[] SUBNAMES = {"White", "Orange", "Magenta", "Lightblue", "Yellow", "Lightgreen", "Pink", "Darkgrey", "Lightgrey", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};

    public ItemBlockUnbreakableLamps(Block block){
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getItemStackDisplayName(ItemStack is){
        return SUBNAMES[is.getItemDamage()] + " Unbreakable Lamp";
    }

    @Override
    public int getMetadata(int meta){
        return meta;
    }

}
