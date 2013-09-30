package sokobanMod.client;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.event.ForgeSubscribe;

import org.lwjgl.opengl.GL11;

import sokobanMod.common.LevelRegistrator;
import sokobanMod.common.SokobanMod;
import sokobanMod.common.SokobanUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 * This class is derived from Equivalent Exchange 3's DrawBlockHighlightHandler, found at https://github.com/pahimar/Equivalent-Exchange-3/blob/master/common/com/pahimar/ee3/core/handlers/DrawBlockHighlightHandler.java
 */

@SideOnly(Side.CLIENT)
public class HandlerLevelPreviewRenderer{

    private static float time = 0;
    private static boolean colliding = false;

    @ForgeSubscribe
    public void onDrawBlockHighlightEvent(DrawBlockHighlightEvent event){
        if(event.currentItem != null && (event.currentItem.itemID == SokobanMod.ItemLevelGeneratorTutorial.itemID || event.currentItem.itemID == SokobanMod.ItemLevelConverter.itemID)) {
            renderPreview(event);
        }
    }

    private void renderPreview(DrawBlockHighlightEvent event){

        double x = event.target.blockX + 0.5F;
        double y = event.target.blockY + 0.5F;
        double z = event.target.blockZ + 0.5F;
        double iPX = event.player.prevPosX + (event.player.posX - event.player.prevPosX) * event.partialTicks;
        double iPY = event.player.prevPosY + (event.player.posY - event.player.prevPosY) * event.partialTicks;
        double iPZ = event.player.prevPosZ + (event.player.posZ - event.player.prevPosZ) * event.partialTicks;

        int baseX = event.target.blockX;
        int baseY = event.target.blockY + 1;
        int baseZ = event.target.blockZ;

        float xScale = 0.1F;
        float yScale = 0.1F;
        float zScale = 0.1F;
        float xShift = 0.0F;
        float yShift = 1.0F;
        float zShift = 0.0F;
        // determine the line color

        int[] levelBounds;
        int[] rawLevelBounds;
        ForgeDirection sideHit = ForgeDirection.UP;
        if(event.currentItem.itemID == SokobanMod.ItemLevelGeneratorTutorial.itemID) {
            rawLevelBounds = LevelRegistrator.getLevelBounds(event.currentItem.getItemDamage());
            levelBounds = rawLevelBounds.clone();
            levelBounds[0]++;
            levelBounds[1]++;
            levelBounds[2]++;
            yShift += levelBounds[1] / 2;

            int orientation = SokobanUtils.determineOrientation(event.player);
            switch(orientation){
                case 0:
                    orientation = 3;
                    break;
                case 3:
                    orientation = 5;
                    break;
                case 1:
                    orientation = 4;
                    break;
            }
            sideHit = ForgeDirection.getOrientation(orientation);

            xShift += (1 - levelBounds[0] % 2) / 2F;
            yShift -= (1 - levelBounds[1] % 2) / 2F;
            zShift += (1 - levelBounds[2] % 2) / 2F;

        } else {
            colliding = false; // always render the wireframe green.
            NBTTagCompound nbt = event.player.getCurrentEquippedItem().stackTagCompound;
            if(nbt != null && nbt.hasKey("x")) {
                int startX = nbt.getInteger("x");
                int startY = nbt.getInteger("y");
                int startZ = nbt.getInteger("z");
                int endX = event.target.blockX;
                int endY = event.target.blockY;
                int endZ = event.target.blockZ;

                rawLevelBounds = new int[]{Math.abs(endX - startX), Math.abs(endY - startY), Math.abs(endZ - startZ)};
                levelBounds = new int[]{rawLevelBounds[0] + 1, rawLevelBounds[1] + 1, rawLevelBounds[2] + 1};

                xShift -= (endX - startX) / 2F;
                yShift -= (endY - startY) / 2F + 1F;
                zShift -= (endZ - startZ) / 2F;
            } else {
                rawLevelBounds = new int[]{1, 1, 1};
                levelBounds = new int[]{1, 1, 1};
                yShift = 0F;
            }

        }
        switch(sideHit){
            case NORTH:
                zShift += levelBounds[2] / 2;
                zShift -= 1 - levelBounds[2] % 2;
                zShift = -zShift;

                baseZ -= rawLevelBounds[2];// +2
                baseX -= rawLevelBounds[0] / 2;
                break;
            case SOUTH:
                zShift += levelBounds[2] / 2;
                zShift -= 1 - levelBounds[2] % 2;

                baseX -= rawLevelBounds[0] / 2;
                break;
            case EAST:
                // zShift = 0;
                xShift += levelBounds[0] / 2;
                xShift -= 1 - levelBounds[0] % 2;
                baseZ -= rawLevelBounds[2] / 2;
                break;
            case WEST:
                xShift += levelBounds[0] / 2;
                xShift -= 1 - levelBounds[0] % 2;
                xShift = -xShift;

                baseX -= rawLevelBounds[0];
                baseZ -= rawLevelBounds[2] / 2;
                break;
            default:
        }

        colliding = SokobanUtils.isCollidingWithLevel(event.player.worldObj, baseX, baseY, baseZ, baseX + rawLevelBounds[0], baseY + rawLevelBounds[1], baseZ + rawLevelBounds[2]);

        GL11.glDepthMask(false);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        // GL11.glDisable(GL11.GL_CULL_FACE);

        for(int i = 0; i < 6; i++) {
            ForgeDirection forgeDir = ForgeDirection.getOrientation(i);
            int zCorrection = i == 2 ? -1 : 1;
            GL11.glPushMatrix();
            GL11.glTranslated(-iPX + x + xShift, -iPY + y + yShift, -iPZ + z + zShift);
            GL11.glScalef(levelBounds[0] + xScale, levelBounds[1] + yScale, levelBounds[2] + zScale);
            GL11.glRotatef(90, forgeDir.offsetX, forgeDir.offsetY, forgeDir.offsetZ);
            GL11.glTranslated(0, 0, 0.5f * zCorrection);
            GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
            renderPulsingQuad();
            GL11.glPopMatrix();
        }

        GL11.glDepthMask(true);
        GL11.glEnable(GL11.GL_TEXTURE_2D);

    }

    public static void renderPulsingQuad(){
        time += 0.001;
        if(time > 2 * Math.PI) time = 0;
        float quadPosX = (float)Math.sin(time) * 0.2F;
        float quadPosY = (float)Math.cos(time) * 0.2F;

        GL11.glColor4f(colliding ? 1F : 0F, colliding ? 0F : 1F, 0F, 1F);

        GL11.glLineWidth(3.0F);
        GL11.glBegin(GL11.GL_LINES);

        // the lines around the whole level
        GL11.glVertex3f(-0.5F, 0.5F, 0F);
        GL11.glVertex3f(0.5F, 0.5F, 0F);
        GL11.glVertex3f(0.5F, -0.5F, 0F);
        GL11.glVertex3f(-0.5F, -0.5F, 0F);

        // draw the lines from the bigger quad's corner to the small quad's
        // corner
        float quadSize = 0.1F;
        GL11.glVertex3f(-0.5F, 0.5F, 0F);
        GL11.glVertex3f(-quadSize + quadPosX, quadSize + quadPosY, 0F);
        GL11.glVertex3f(0.5F, 0.5F, 0F);
        GL11.glVertex3f(quadSize + quadPosX, quadSize + quadPosY, 0F);
        GL11.glVertex3f(0.5F, -0.5F, 0F);
        GL11.glVertex3f(quadSize + quadPosX, -quadSize + quadPosY, 0F);
        GL11.glVertex3f(-0.5F, -0.5F, 0F);
        GL11.glVertex3f(-quadSize + quadPosX, -quadSize + quadPosY, 0F);
        GL11.glEnd();

        // draw the quad inside the big quad
        GL11.glBegin(GL11.GL_LINE_LOOP);
        GL11.glVertex3f(-quadSize + quadPosX, quadSize + quadPosY, 0F);
        GL11.glVertex3f(quadSize + quadPosX, quadSize + quadPosY, 0F);
        GL11.glVertex3f(quadSize + quadPosX, -quadSize + quadPosY, 0F);
        GL11.glVertex3f(-quadSize + quadPosX, -quadSize + quadPosY, 0F);
        GL11.glEnd();
    }

}
