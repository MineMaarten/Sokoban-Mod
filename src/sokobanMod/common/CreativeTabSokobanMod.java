package sokobanMod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class CreativeTabSokobanMod extends CreativeTabs{

    public CreativeTabSokobanMod(String par2Str){
        super(par2Str);
    }

	@Override
	public Item getTabIconItem()
	{
		return Item.getItemFromBlock(SokobanMod.BlockTargetBox);
	}
}
