package net.aridia.aridiacarts;

import net.aridia.aridiacarts.tabs.AridiaCartsTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = AridiaCarts.MODID, name = AridiaCarts.NAME, version = AridiaCarts.VERSION, acceptedMinecraftVersions = AridiaCarts.MC_VERSION)
public class AridiaCarts {

    public static final String MODID = "aridiacarts";
    public static final String NAME = "AridiaCarts";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";

    public static final CreativeTabs ARIDIACRAFTTAB = new AridiaCartsTab();

    public static final Logger LOGGER = LogManager.getLogger(AridiaCarts.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(AridiaCarts.NAME + " says hi!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}