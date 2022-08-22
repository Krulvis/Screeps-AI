package org.krulvis.screeps

import screeps.api.Game
import screeps.api.values

fun drawGeneralInfo() {
    val x = 10.0
    var y = 10.0
    Game.rooms.values.forEach {
        val spawn = Game.spawns.values.firstOrNull { spawn -> spawn.room == it }
        if (spawn != null)
            it.visual.text(
                "${it.energyAvailable}/${it.energyCapacityAvailable}",
                spawn.pos.x.toDouble(),
                spawn.pos.y.toDouble()
            )
    }
}