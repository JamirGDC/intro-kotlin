package exercises.objects.`class`

import exercises.objects.enums.raceEnum.Race

data class Character
    (
    val name : String,
    var health : Double,
    var attackPower : Double,
    var defensePower : Double,
    val race : Race,

    )