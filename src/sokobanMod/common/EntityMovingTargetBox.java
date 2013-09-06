package sokobanMod.common;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class EntityMovingTargetBox extends EntityFallingTargetBox{
    public int age;
    public int direction;
    public double startX;
    public double startY;
    public double startZ;
    public static final float SPEED = 0.05F; // determines how fast the box moves.

    // Params: world, x, y, z, direction, minX, minY, minZ, maxX, maxY, maxZ
    public EntityMovingTargetBox(World par1World, double par2, double par4, double par6, int dir, int miniX, int miniY,
            int miniZ, int maxiX, int maxiY, int maxiZ, int level){
        super(par1World, par2, par4, par6, SokobanMod.BlockTargetBox.blockID, 0, miniX, miniY, miniZ, maxiX, maxiY, maxiZ, level);

        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        direction = dir;
        startX = par2;
        startY = par4;
        startZ = par6;
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound){
        super.writeEntityToNBT(compound);
        compound.setDouble("startX", startX);
        compound.setDouble("startY", startY);
        compound.setDouble("startZ", startZ);
        compound.setInteger("direction", direction);
        compound.setInteger("age", age);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound){
        super.readFromNBT(compound);
        startX = compound.getDouble("startX");
        startY = compound.getDouble("startY");
        startZ = compound.getDouble("startZ");
        direction = compound.getInteger("direction");
        age = compound.getInteger("age");
    }

    @Override
    public void onUpdate(){
        int blockX = MathHelper.floor_double(posX);
        int blockY = MathHelper.floor_double(posY);
        int blockZ = MathHelper.floor_double(posZ);

        if(worldObj.getBlockId(blockX, blockY - 1, blockZ) != Block.glass.blockID) {
            age++;
            if(age > (int)(1F / SPEED)) setDead(); // when the box traveled one block (t = s/v)
        }

        switch(direction){
            case 0:
                motionY = SPEED;
                // if(startY <= this.posY - 1.0D) this.setDead();
                break;
            case 1:
                motionY = -SPEED;
                // if(startY >= this.posY + 1.0D) this.setDead();
                break;
            case 2:
                motionZ = SPEED;
                // if(startZ <= this.posZ - 1.0D) this.setDead();
                break;
            case 3:
                motionZ = -SPEED;
                // if(startZ >= this.posZ + 1.0D) this.setDead();
                break;
            case 4:
                motionX = SPEED;
                // if(startX <= this.posX - 1.0D) this.setDead();
                break;
            default:
                motionX = -SPEED;
                // if(startX >= this.posX + 1.0D) this.setDead();

        }
        moveEntity(motionX, motionY, motionZ);
    }

    @Override
    public void setDead(){
        int blockX = MathHelper.floor_double(posX);
        int blockY = MathHelper.floor_double(posY);
        int blockZ = MathHelper.floor_double(posZ);

        if(minX != 0 && minY != 0 && minZ != 0 && // when we are checking an already known level
        (blockX < minX || blockX > maxX || blockY < minY || blockY > maxY || blockZ < minZ || blockZ > maxZ)) { // and the block is outside the level boundaries
            if(SokobanUtils.removeLevel(worldObj, minX, minY, minZ, maxX, maxY, maxZ, rand)) {
                entityDropItem(new ItemStack(SokobanMod.ItemLevelGeneratorTutorial, 1, levelNumber), 1.0F);
            }
        } else {
            worldObj.setBlock(blockX, blockY, blockZ, SokobanMod.BlockTargetBox.blockID);
            TileEntity TE = worldObj.getBlockTileEntity(blockX, blockY, blockZ);
            if(TE instanceof TileEntityTargetBox) {
                TileEntityTargetBox tbTE = (TileEntityTargetBox)TE;

                tbTE.setLevelBounds(minX, minY, minZ, maxX, maxY, maxZ);// copy the data to the new TileEntity
                tbTE.levelDropped = levelNumber;
            }
        }
        super.setDead();
    }

}
