package net.aridia.aridiacarts.tabs;

import net.aridia.aridiacarts.AridiaCarts;
import net.aridia.aridiacarts.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AridiaCartsTab extends CreativeTabs {

    public AridiaCartsTab(){
        super(AridiaCarts.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.LOGO);
    }
}
