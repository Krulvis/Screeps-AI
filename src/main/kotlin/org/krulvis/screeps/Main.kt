import org.krulvis.screeps.drawGeneralInfo
import screeps.api.Game
import screeps.api.component1
import screeps.api.component2
import screeps.api.iterator

/**
 * Entry point
 * is called by screeps
 *
 * must not be removed by DCE
 */
@Suppress("unused")
fun loop() {
    drawGeneralInfo()

    for ((_, creep) in Game.creeps) {
        when (creep.memory.role) {
            Role.HARVESTER -> creep.harvest()
            Role.BUILDER -> creep.build()
            Role.UPGRADER -> creep.upgrade(mainSpawn.room.controller!!)
            else -> creep.pause()
        }
    }
}