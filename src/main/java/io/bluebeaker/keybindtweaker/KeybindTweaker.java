package io.bluebeaker.keybindtweaker;

import org.apache.logging.log4j.Logger;

import net.minecraft.server.MinecraftServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = KeybindTweaker.MODID, name = KeybindTweaker.NAME, version = KeybindTweaker.VERSION)
public class KeybindTweaker
{
    public static final String MODID = "keybindtweaker";
    public static final String NAME = "KeybindTweaker";
    public static final String VERSION = "1.0";
    
    public MinecraftServer server;

    private static Logger logger;
    
    public KeybindTweaker() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }
    @EventHandler
    public void onServerStart(FMLServerStartingEvent event){
        this.server=event.getServer();
    }

    public void logInfo(String log){
        logger.info(log);
    }
}
