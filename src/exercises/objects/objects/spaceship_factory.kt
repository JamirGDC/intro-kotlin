package exercises.objects.objects

import exercises.objects.`class`.Fighter
import exercises.objects.`class`.FighterCarrier
import exercises.objects.`class`.Spaceship

object SpaceshipFactory {

    fun createSpaceship(name: String, health: Double, crew: String): Spaceship {
        return Spaceship(name, health, crew)
    }

    fun createFighter(name: String, health: Double, crew: String, shots: Int): Fighter {
        return Fighter(name, health, crew, shots)
    }

    fun createFighterCarrier(name: String, health: Double, crew: String, fighters: Int, shots: Int): FighterCarrier {
        return FighterCarrier(name, health, crew, fighters, shots)
    }
}
