package sokobanMod.common;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class ItemBlockUnbreakableGlasses extends ItemBlock{

    public ItemBlockUnbreakableGlasses(int par1){
        super(par1);
        setHasSubtypes(true);
    }

    @Override
    public String getItemDisplayName(ItemStack is){
        String name = "";
        switch(is.getItemDamage()){
            case 0:
                name = "Concrete Glass";
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
