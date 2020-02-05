package net.aridia.aridiacarts.init;

import net.aridia.aridiacarts.AridiaCarts;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(AridiaCarts.MODID)
public class ModItems{

        public static final Item LOGO = null;
        public static final Item MANGO = null;
        public static final Item GOLDEN_HEART = null;
        public static final Item BLUE_HEART = null;

        @EventBusSubscriber(modid = AridiaCarts.MODID)
        public static class RegistrationHandler{

            @SubscribeEvent
            public static void registerItems(RegistryEvent.Register<Item> event){
                final Item[] items = {
                        new Item().setRegistryName(AridiaCarts.MODID, "logo").setTranslationKey(AridiaCarts.MODID + "." + "logo").setCreativeTab(AridiaCarts.ARIDIACRAFTTAB),
                        new Item().setRegistryName(AridiaCarts.MODID, "mango").setTranslationKey(AridiaCarts.MODID + "." + "mango").setCreativeTab(AridiaCarts.ARIDIACRAFTTAB),
                        new Item().setRegistryName(AridiaCarts.MODID, "golden_heart").setTranslationKey(AridiaCarts.MODID + "." + "golden_heart").setCreativeTab(AridiaCarts.ARIDIACRAFTTAB),
                        new Item().setRegistryName(AridiaCarts.MODID, "blue_heart").setTranslationKey(AridiaCarts.MODID + "." + "blue_heart").setCreativeTab(AridiaCarts.ARIDIACRAFTTAB)
                };

                event.getRegistry().registerAll(items);
            }

        }

}
