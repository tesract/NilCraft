package com.tesract.nilcraft;

import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.common.config.Configuration
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event._
import com.tesract.nilcraft.proxy._
import net.minecraftforge.fml.common.SidedProxy

@Mod(modid = modId,
    name = modName,
    version = modVersion,
//    dependencies = dependencies,
    modLanguage = modLanguage)
object NilCraft
{
    val MODID = modId;  
  
    @SidedProxy(clientSide="com.tesract.nilcraft.proxy.ClientProxy", serverSide="com.tesract.nilcraft.ServerProxy")
    var proxy:CommonProxy = null;

    @EventHandler
    def preInit(event:FMLPreInitializationEvent)
    {
      log.info("preinit:"+proxy)

      MinecraftForge.EVENT_BUS.register(new EntityJoinListener());

      proxy.preInit(event)
    }
    
    @EventHandler
    def init(event:FMLInitializationEvent) = proxy.init(event)
    
    @EventHandler
    def postInit(event:FMLPostInitializationEvent) = proxy.postInit(event)
}
