package com.tesract.nilcraft.actors

import net.minecraft.entity.player.EntityPlayer
import akka.actor.Actor
import net.minecraft.world.World
import com.tesract.nilcraft.events.PlayerJoin
import com.tesract.nilcraft.log;

/**
 * @author eb3843
 */
class PlayerTracker extends Actor
{
  def receive = {
    case PlayerJoin(player:EntityPlayer, world:World) => {
      System.out.println("player joined:" + player.getName + " " + world.getWorldInfo.getWorldName);
    }
  } 
}