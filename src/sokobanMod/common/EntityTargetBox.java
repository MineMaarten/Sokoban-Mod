package sokobanMod.common;

import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
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

public class EntityTargetBox extends Entity{
    public int minX;
    public int minY;
    public int minZ;
    public int maxX;
    public int maxY;
    public int maxZ;
    public int levelNumber;
    
    public int age;
    public int direction;
    public double startX;
    public double startY;
    public double startZ;
    public static final float SPEED = 0.05F;

    public EntityTargetBox(World world)
    {
        super(world);
    }

    // Parameters: world, x, y, z, direction
    public EntityTargetBox(World world, double x, double y, double z, int dir)
    {
        this(world);
        
        // shouldDropItem = false;
    }

    // Parameters: world, x, y, z, direction, minX, minY, minZ, maxX, maxY, maxZ, level
    public EntityTargetBox(World world, double x, double y, double z, int dir, int miniX,
    					int miniY, int miniZ, int maxiX, int maxiY, int maxiZ, int level)
    {
        this(world);
        minX = miniX;
        minY = miniY;
        minZ = miniZ;
        maxX = maxiX;
        maxY = maxiY;
        maxZ = maxiZ;
        levelNumber = level;
        
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        direction = dir;
        startX = x;
        startY = y;
        startZ = z;
        
        // shouldDropItem = false;
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound){
        compound.setInteger("minX", minX);
        compound.setInteger("minY", minY);
        compound.setInteger("minZ", minZ);
        compound.setInteger("maxX", maxX);
        compound.setInteger("maxY", maxY);
        compound.setInteger("maxZ", maxZ);
        compound.setInteger("levelNumber", levelNumber);
        
        compound.setDouble("startX", startX);
        compound.setDouble("startY", startY);
        compound.setDouble("startZ", startZ);
        compound.setInteger("direction", direction);
        compound.setInteger("age", age);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound){
        minX = compound.getInteger("minX");
        minY = compound.getInteger("minY");
        minZ = compound.getInteger("minZ");
        maxX = compound.getInteger("maxX");
        maxY = compound.getInteger("maxY");
        maxZ = compound.getInteger("maxZ");
        levelNumber = compound.getInteger("levelNumber");
        
        startX = compound.getDouble("startX");
        startY = compound.getDouble("startY");
        startZ = compound.getDouble("startZ");
        direction = compound.getInteger("direction");
        age = compound.getInteger("age");
    }

    @Override
    public void onUpdate()
    {
    	super.onUpdate();
		
		int blockX = MathHelper.floor_double(posX);
        int blockY = MathHelper.floor_double(posY);
        int blockZ = MathHelper.floor_double(posZ);

        if(worldObj.getBlock(blockX, blockY - 1, blockZ) != Blocks.glass)
        {
            age++;
            if(age > (int)(1F / SPEED)) setDead(); // when the box traveled one block (t = s/v)
        }
		
		switch(direction)
        {
            case 0:
                motionY = SPEED;
                break;
            case 1:
                motionY = -SPEED;
                break;
            case 2:
                motionZ = SPEED;
                break;
            case 3:
                motionZ = -SPEED;
                break;
            case 4:
                motionX = SPEED;
                break;
            default:
                motionX = -SPEED;
        }
		
		setPosition(posX + motionX, posY + 0, posZ + motionZ);
        
		
		
        if(isDead == true && worldObj.getBlock(blockX, blockY, blockZ) == SokobanMod.BlockTargetBox)
        {
            TileEntity te = worldObj.getTileEntity(blockX, blockY, blockZ);
            if(te instanceof TileEntityTargetBox)
            {
                TileEntityTargetBox teTb = (TileEntityTargetBox)te;
                teTb.setLevelBounds(minX, minY, minZ, maxX, maxY, maxZ);// copy the data to the new TE.
                teTb.levelDropped = levelNumber;
                if(minX != 0 && minY != 0 && minZ != 0 && // when we are checking an already known level
                (blockX < minX || blockX > maxX || blockY < minY || blockY > maxY
                		|| blockZ < minZ || blockZ > maxZ))
                { // and the block is outside the level boundaries
                	worldObj.setBlock(blockX, blockY, blockZ, Blocks.air);
                    if(SokobanUtils.removeLevel(worldObj, minX, minY, minZ, maxX, maxY, maxZ, rand))
                    {
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
            worldObj.setBlock(blockX, blockY, blockZ, SokobanMod.BlockTargetBox);
            TileEntity TE = worldObj.getTileEntity(blockX, blockY, blockZ);
            if(TE instanceof TileEntityTargetBox) {
                TileEntityTargetBox tbTE = (TileEntityTargetBox)TE;

                tbTE.setLevelBounds(minX, minY, minZ, maxX, maxY, maxZ);// copy the data to the new TileEntity
                tbTE.levelDropped = levelNumber;
            }
        }
        super.setDead();
    }
    
    // TODO
    private void spawnParticle(String string, double g, double h, double i, double d, double e, double f){
        // PacketDispatcher.sendPacketToAllPlayers(PacketHandlerSokoban.spawnParticle(string, g, h, i, d, e, f));
    }

	@Override
	protected void entityInit()
	{
		// required method that really is not needed to work. -EliteCreature	
	}

}
