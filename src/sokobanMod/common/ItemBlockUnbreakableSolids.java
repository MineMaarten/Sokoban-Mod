package sokobanMod.common;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class ItemBlockUnbreakableSolids extends ItemBlock{

    public ItemBlockUnbreakableSolids(int par1){
        super(par1);
        setHasSubtypes(true);
    }

    @Override
    public String getItemDisplayName(ItemStack is){
        String name = "";
        switch(is.getItemDamage()){
            case 0:
                name = "Concrete Stone";
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
