package org.krulvis.screeps.roles

import screeps.api.ActiveBodyPartConstant
import screeps.api.CARRY
import screeps.api.MOVE
import screeps.api.WORK

enum class Roles(val components: Array<ActiveBodyPartConstant>) {
    MINER(arrayOf(WORK, WORK, MOVE)),
    MOVER(arrayOf(CARRY, CARRY, MOVE, MOVE)),
    BUILDER(arrayOf(WORK, CARRY, MOVE)),
    UPGRADER(arrayOf(WORK, CARRY, MOVE));
}