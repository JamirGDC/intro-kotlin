package exercises.objects.objects

import exercises.objects.`class`.Character
import exercises.objects.enums.raceEnum.Race

object CharacterFactory {

    fun createCharacter(name: String, health : Double, attackPower : Double, defensePower: Double, race : Race) : Character
    {
        return Character(name, health, attackPower, defensePower, race)
    }

    fun  processAttack (attackerCharacter: Character, defenderCharacter: Character) : Double
    {
        return calculateDamage(attackerCharacter.attackPower, defenderCharacter.defensePower)
    }
    fun calculateDamage(attackerAttackPower : Double, defenderDefensePower : Double) : Double {
        val rawDamage = attackerAttackPower - defenderDefensePower
        val minimunDamage : Double = 1.0
        return  maxOf(rawDamage, minimunDamage)
    }
}