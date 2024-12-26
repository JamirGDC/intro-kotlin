package exercises.objects

import exercises.objects.`class`.Brand
import exercises.objects.enums.raceEnum.Race
import exercises.objects.objects.BrandFactory.createNewBrand
import exercises.objects.objects.CarFactory
import exercises.objects.objects.CharacterFactory.createCharacter
import exercises.objects.objects.CharacterFactory.processAttack
import exercises.objects.objects.SpaceshipFactory
import java.time.LocalDate


class Objects {
    lateinit var brandBmw : Brand

    //region Exercise 1
    fun createBrand()
    {
        println("Exercise 1")
        brandBmw = createNewBrand()
        println("Se ha creado la Marca $brandBmw")
    }
    //endregion


    //region Exercise 2
    fun createCar()
    {
        println("Exercise 2")
        val createCar = CarFactory.createCar("325", LocalDate.of(2007, 0, 0) , 250.0, brandBmw)
        println("Se ha creado  $createCar")
    }
    //endregion

    //region Exercise 3
    fun createNewCharacter()
    {
        println("Exercise 3")
        println(createCharacter("Dash", 100.0, 58.0, 30.0, Race.BLOOD_ELF ))

    }
    //endregion

    //region Exercise 4
    fun createGame()
    {
        println("Exercise 4")
        var char1 = createCharacter("char1", 100.0, 67.9, 20.0, Race.HUMAN)
        var char2 = createCharacter("char2", 100.0, 87.3, 40.2, Race.ORC)

        val damagePoints = processAttack(char1, char2)

        char2.health -= damagePoints

        println("${char1.name} ataca a ${char2.name} y reduce reduce la vida de ${char2.name} en ${damagePoints} puntos \n ${char2.name} ahora tiene ${char2.health}")
    }
    //endregion

    //region Exercise 5
    fun createNewSpaceShip()
    {
        println("Exercise 5")

        val spaceship = SpaceshipFactory.createSpaceship("Explorer", 100.0, "1")
        println(spaceship.status())

        val fighter = SpaceshipFactory.createFighter("Interceptor", 75.0, "1", 5)
        println(fighter.status())
        fighter.shoot()
        println(fighter.status())

        val carrier = SpaceshipFactory.createFighterCarrier("Warrior", 100.0, "1", 10, 50)
        println(carrier.status())
        carrier.launchFighter()
        carrier.shoot()
        println(carrier.status())

    }
    //endregion


}