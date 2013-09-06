package sokobanMod.common;

import net.minecraft.entity.item.EntityFallingSand;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.PacketDispatcher;

/**
 * Sokoban Mod
 * @author MineMaarten
 * www.minemaarten.com
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class EntityFallingTargetBox extends EntityFallingSand{
    public int minX;
    public int minY;
    public int minZ;
    public int maxX;
    public int maxY;
    public int maxZ;
    public int levelNumber;

    public EntityFallingTargetBox(World par1World, double par2, double par4, double par6, int par8){
        super(par1World, par2, par4, par6, par8);
        shouldDropItem = false;
    }

    // Params: world, x, y, z, blockID, blockMetadata
    public EntityFallingTargetBox(World par1World, double par2, double par4, double par6, int par8, int par9){
        super(par1World, par2, par4, par6, par8, par9);
        shouldDropItem = false;
    }

    // Params: world, x, y, z, blockID, blockMetadata, minX, minY, minZ, maxX,
    // maxY, maxZ
    public EntityFallingTargetBox(World par1World, double par2, double par4, double par6, int par8, int par9,
            int miniX, int miniY, int miniZ, int maxiX, int maxiY, int maxiZ, int level){
        super(par1World, par2, par4, par6, par8, par9);
        minX = miniX;
        minY = miniY;
        minZ = miniZ;
        maxX = maxiX;
        maxY = maxiY;
        maxZ = maxiZ;
        levelNumber = level;
        shouldDropItem = false;
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound){
        super.writeEntityToNBT(compound);
        compound.setInteger("minX", minX);
        compound.setInteger("minY", minY);
        compound.setInteger("minZ", minZ);
        compound.setInteger("maxX", maxX);
        compound.setInteger("maxY", maxY);
        compound.setInteger("maxZ", maxZ);
        compound.setInteger("levelNumber", levelNumber);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound){
        super.readFromNBT(compound);
        minX = compound.getInteger("minX");
        minY = compound.getInteger("minY");
        minZ = compound.getInteger("minZ");
        maxX = compound.getInteger("maxX");
        maxY = compound.getInteger("maxY");
        maxZ = compound.getInteger("maxZ");
        levelNumber = compound.getInteger("levelNumber");
    }

    @Override
    public void onUpdate(){
        super.onUpdate();
        int x = MathHelper.floor_double(posX);
        int y = MathHelper.floor_double(posY);
        int z = MathHelper.floor_double(posZ);
        if(isDead == true && worldObj.getBlockId(x, y, z) == SokobanMod.BlockTargetBox.blockID) {
            TileEntity te = worldObj.getBlockTileEntity(x, y, z);
            if(te instanceof TileEntityTargetBox) {
                TileEntityTargetBox teTb = (TileEntityTargetBox)te;
                teTb.setLevelBounds(minX, minY, minZ, maxX, maxY, maxZ);// copy the data to the new TE.
                teTb.levelDropped = levelNumber;
                if(minX != 0 && minY != 0 && minZ != 0 && // when we are checking an already known level
                (x < minX || x > maxX || y < minY || y > maxY || z < minZ || z > maxZ)) { // and the block is outside the level boundaries
                    worldObj.setBlock(x, y, z, 0);
                    if(SokobanUtils.removeLevel(worldObj, minX, minY, minZ, maxX, maxY, maxZ, rand)) {
                        entityDropItem(new ItemStack(SokobanMod.ItemLevelGeneratorTutorial, 1, levelNumber), 1.0F);
                    }
                }
            }
        } else if(isDead == true) { // when the box gets broken by a torch or something like that.
            spawnParticle("explode", posX, posY, posZ, 0.0D, 0.0D, 0.0D);
            entityDropItem(new ItemStack(SokobanMod.ItemLevelGeneratorTutorial, 1, levelNumber), 1.0F);
            SokobanUtils.removeLevel(worldObj, minX, minY, minZ, maxX, maxY, maxZ, rand);
        }
    }

    private void spawnParticle(String string, double g, double h, double i, double d, double e, double f){
        PacketDispatcher.sendPacketToAllPlayers(PacketHandlerSokoban.spawnParticle(string, g, h, i, d, e, f));
    }

}
