package sokobanMod.common;

import java.util.ArrayList;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// NOTE: For all I know this class might as well be redundant, but until I know better, this is it.

public class ModelTargetBox extends ModelBase
{
	private ArrayList<ModelRenderer> parts;
	
	public static int blockCount;
	
	public ModelTargetBox()
	{
		parts = new ArrayList<ModelRenderer>();
			ModelRenderer main = new ModelRenderer(this, 0, 0);
			main.addBox(-8, -8, -8,
					     16, 16, 16);
			main.setRotationPoint(0, 0, 0);
			parts.add(main);
	}
	
	@Override
	public void render(Entity entity, float val1, float val2, float val3, float val4, float val5, float mult)
	{
		for(ModelRenderer part : parts)
		{
			part.render(mult);
		}
	}
}
