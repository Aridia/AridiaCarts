package net.aridia.aridiacarts.client;

import net.aridia.aridiacarts.AridiaCarts;
import net.aridia.aridiacarts.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = AridiaCarts.MODID)
public class ModelRegistrationHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        registerModel(ModItems.LOGO, 0);
        registerModel(ModItems.MANGO, 0);
        registerModel(ModItems.GOLDEN_HEART, 0);
        registerModel(ModItems.BLUE_HEART, 0);
    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
