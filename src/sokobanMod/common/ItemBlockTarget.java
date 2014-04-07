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

public class ItemBlockTarget extends ItemBlock{

    public ItemBlockTarget(Block block){
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getItemStackDisplayName(ItemStack is){
        String name = "";
        switch(is.getItemDamage()){
            case 0:
                name = "Connected Target";
                break;
            case 2:
                name = "Target";
                break;
            default:
                name = "?????";
        }
        return name;
    }

    @Override
    public int getMetadata(int meta){
        return meta;
    }

}
