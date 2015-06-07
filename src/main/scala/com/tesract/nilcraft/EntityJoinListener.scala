package com.tesract.nilcaft;

import net.minecraft.init._;
import net.minecraftforge.fml.common._;
import net.minecraftforge.fml.common.Mod._;
import net.minecraftforge.fml.common.event._;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity._;

class EntityJoinListener
{
  @EventHandler
  def onJoin(event:EntityJoinWorldEvent){
    java.lang.System.out.println("joined >> "+event);
  }
}
