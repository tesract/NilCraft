package com.tesract.nilcraft;

import net.minecraftforge.event.entity.EntityJoinWorldEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraft.entity.player.EntityPlayer
import org.apache.logging.log4j.LogManager
import net.minecraft.client.entity.EntityPlayerSP
import net.minecraft.entity.player.EntityPlayerMP
import com.tesract.nilcraft.events.PlayerJoin

class EntityJoinListener
{
  @SubscribeEvent
  def onJoin(event:EntityJoinWorldEvent){
    
    if (classOf[EntityPlayer].isAssignableFrom(event.entity.getClass)  && !event.world.isRemote )
    {
      log.info("joined >> "+event.entity.getName()+" "+event.world.isRemote)
      playerTracker ! new PlayerJoin(event.entity.asInstanceOf[EntityPlayer], event.world)
    }
  }
}
