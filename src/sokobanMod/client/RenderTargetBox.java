package sokobanMod.client;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import sokobanMod.common.EntityTargetBox;
import sokobanMod.common.ModelTargetBox;

public class RenderTargetBox extends Render
{
	private ModelTargetBox model;
	
	public RenderTargetBox()
	{
		model = new ModelTargetBox();
		shadowSize = 0.5F;
	}
	
	
	private static final ResourceLocation texture = new ResourceLocation("Minemaarten_Sokoban Mod", "textures/models/moveBlock.png");
	
	public void renderTargetBox(EntityTargetBox targetBox, double x, double y, double z, float yaw, float partialTickTime)
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);
		GL11.glScalef(-1F, -1F, 1F);
		
		bindEntityTexture(targetBox);
		
		//(entity, ?, ?, ?, ?, ?, size)
		model.render(targetBox, 0F, 0F, 0F, 0F, 0F, 0.0625F);
		
		GL11.glPopMatrix();
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity var1)
	{
		return texture;
	}

	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTickTime)
	{
		renderTargetBox((EntityTargetBox)entity, x, y, z, yaw, partialTickTime);
	}
}