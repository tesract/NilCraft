package com.tesract;

import org.apache.logging.log4j.LogManager
import com.tesract.nilcraft.actors.PlayerTracker
import akka.actor._


package object nilcraft {
    final val modId = "NilCraft"
    final val modName = "Nil Craft"
    final val modVersion = "@VERSION@"
//    final val dependencies = "required-after:LibCorestrike"
    final val modLanguage = "scala"
    
    final val log = LogManager.getLogger(modId);
    
    final val actorSystem:ActorSystem = ActorSystem("NilCraftSystem")
    final val playerTracker:ActorRef = actorSystem.actorOf(Props[PlayerTracker], name="playerTracker")
}

