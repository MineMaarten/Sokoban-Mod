package sokobanMod.common;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityTargetBox extends TileEntity{
    public int minX;
    public int minY;
    public int minZ;
    public int maxX;
    public int maxY;
    public int maxZ;
    public int levelDropped; // the metadata of the level generator that should be dropped.

    public void setLevelBounds(int miniX, int miniY, int miniZ, int maxiX, int maxiY, int maxiZ){
        minX = miniX;
        minY = miniY;
        minZ = miniZ;
        maxX = maxiX;
        maxY = maxiY;
        maxZ = maxiZ;
    }

    /**
     * Writes a tile entity to NBT.
     */
    @Override
    public void writeToNBT(NBTTagCompound compound){
        super.writeToNBT(compound);
        compound.setInteger("minX", minX);
        compound.setInteger("minY", minY);
        compound.setInteger("minZ", minZ);
        compound.setInteger("maxX", maxX);
        compound.setInteger("maxY", maxY);
        compound.setInteger("maxZ", maxZ);
        compound.setInteger("levelDropped", levelDropped);
    }

    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(NBTTagCompound compound){
        super.readFromNBT(compound);
        minX = compound.getInteger("minX");
        minY = compound.getInteger("minY");
        minZ = compound.getInteger("minZ");
        maxX = compound.getInteger("maxX");
        maxY = compound.getInteger("maxY");
        maxZ = compound.getInteger("maxZ");
        levelDropped = compound.getInteger("levelDropped");
    }

}
