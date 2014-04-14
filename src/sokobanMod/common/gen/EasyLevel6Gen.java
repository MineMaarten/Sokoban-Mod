package sokobanMod.common.gen;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;

public class EasyLevel6Gen{

    public static void Sign_0_0_0(World world, int x, int y, int z){
        TileEntity te = world.getTileEntity(x, y, z);

        NBTTagCompound tag1 = new NBTTagCompound();
        tag1.setString("id", "Sign");
        tag1.setString("Text1", "easy level");
        tag1.setString("Text2", "#6");
        tag1.setString("Text3", "blabla");
        tag1.setString("Text4", "bll");

        tag1.setInteger("x", x);
        tag1.setInteger("y", y);
        tag1.setInteger("z", z);
        te.readFromNBT(tag1);
    }

    public static void TileEntityAirCompressor_1_0_0(World world, int x, int y, int z){
        TileEntity te = world.getTileEntity(x, y, z);

        NBTTagCompound tag1 = new NBTTagCompound();

        NBTTagList tagList1 = new NBTTagList();
        NBTTagCompound tag2 = new NBTTagCompound();
        new ItemStack(GameRegistry.findItem("PneumaticCraft", "drone"), 1, 0).writeToNBT(tag2);

        NBTTagCompound tag3 = new NBTTagCompound();

        NBTTagList tagList2 = new NBTTagList();
        NBTTagCompound tag4 = new NBTTagCompound();
        tag4.setString("name", "start");
        tag4.setInteger("y", 46);
        tag4.setInteger("x", 49);
        tagList2.appendTag(tag4);
        NBTTagCompound tag5 = new NBTTagCompound();
        tag5.setString("name", "start");
        tag5.setInteger("y", 63);
        tag5.setInteger("x", 48);
        tagList2.appendTag(tag5);
        NBTTagCompound tag6 = new NBTTagCompound();
        tag6.setString("name", "start");
        tag6.setInteger("y", 82);
        tag6.setInteger("x", 49);
        tagList2.appendTag(tag6);
        NBTTagCompound tag7 = new NBTTagCompound();
        tag7.setString("name", "start");
        tag7.setInteger("y", 100);
        tag7.setInteger("x", 50);
        tagList2.appendTag(tag7);
        tag3.setTag("widgets", tagList2);
        tag3.setFloat("currentAir", 0.0F);
        tag3.setFloat("volume", 12000.0F);

        tag3.setTag("Inventory", tag4);

        tag2.setTag("tag", tag3);

        tag2.setByte("Slot", (byte)0);
        tagList1.appendTag(tag2);
        NBTTagCompound tag9 = new NBTTagCompound();
        new ItemStack(GameRegistry.findItem("PneumaticCraft", "machineUpgrade"), 1, 9).writeToNBT(tag9);
        tag9.setByte("Slot", (byte)1);
        tagList1.appendTag(tag9);
        tag1.setTag("Items", tagList1);
        tag1.setString("id", "TileEntityAirCompressor");
        tag1.setInteger("maxBurn", 1600);
        tag1.setInteger("burnTime", 1381);
        tag1.setFloat("currentAir", 9030.0F);
        tag1.setFloat("volume", 5000.0F);
        tag1.setInteger("redstoneMode", 0);
        tag1.setFloat("maxPressure", 5.873584F);

        tag1.setInteger("x", x);
        tag1.setInteger("y", y);
        tag1.setInteger("z", z);
        te.readFromNBT(tag1);
    }

    public static void TileEntityUniversalSensor_1_0_1(World world, int x, int y, int z){
        TileEntity te = world.getTileEntity(x, y, z);

        NBTTagCompound tag1 = new NBTTagCompound();

        NBTTagList tagList1 = new NBTTagList();
        NBTTagCompound tag2 = new NBTTagCompound();
        new ItemStack(GameRegistry.findItem("PneumaticCraft", "machineUpgrade"), 1, 1).readFromNBT(tag2);
        tag2.setByte("Slot", (byte)0);
        tagList1.appendTag(tag2);
        tag1.setTag("Items", tagList1);
        tag1.setByte("isSensorActive", (byte)1);
        tag1.setFloat("maxPressure", 5.3168945F);
        tag1.setString("id", "TileEntityUniversalSensor");
        tag1.setByte("invertedRedstone", (byte)0);
        tag1.setFloat("currentAir", 9028.154F);
        tag1.setString("sensorText", "");
        tag1.setString("sensorSetting", "dispenser/World/Weather Forecast");
        tag1.setFloat("dishSpeed", 10.0F);
        tag1.setFloat("volume", 5000.0F);

        tag1.setInteger("x", x);
        tag1.setInteger("y", y);
        tag1.setInteger("z", z);
        te.readFromNBT(tag1);
    }

}
