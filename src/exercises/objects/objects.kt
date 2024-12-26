package exercises.objects

import exercises.objects.`class`.Animal.Bird
import exercises.objects.`class`.Animal.Dog
import exercises.objects.`class`.Animal.Whale
import exercises.objects.`class`.App.User
import exercises.objects.`class`.Brand
import exercises.objects.enums.raceEnum.Race
import exercises.objects.enums.raceEnum.Role
import exercises.objects.objects.BrandFactory.createNewBrand
import exercises.objects.objects.CarFactory
import exercises.objects.objects.CharacterFactory.createCharacter
import exercises.objects.objects.CharacterFactory.processAttack
import exercises.objects.objects.SpaceshipFactory
import java.time.LocalDate

class Objects {

    // Variable inicializada directamente
    private var brandBmw: Brand = createNewBrand()

    //region Exercise 1
    fun createBrand() {
        println("Exercise 1")
        println("Se ha creado la Marca $brandBmw")
    }
    //endregion

    //region Exercise 2
    fun createCar() {
        println("Exercise 2")
        val createCar = CarFactory.createCar("325", LocalDate.of(2007, 1, 1), 250.0, brandBmw)
        println("Se ha creado  $createCar")
    }
    //endregion

    //region Exercise 3
    fun createNewCharacter() {
        println("Exercise 3")
        val character = createCharacter("Dash", 100.0, 58.0, 30.0, Race.BLOOD_ELF)
        println(character)
    }
    //endregion

    //region Exercise 4
    fun createGame() {
        println("Exercise 4")
        val char1 = createCharacter("char1", 100.0, 67.9, 20.0, Race.HUMAN)
        val char2 = createCharacter("char2", 100.0, 87.3, 40.2, Race.ORC)

        val damagePoints = processAttack(char1, char2)
        char2.health = (char2.health - damagePoints).coerceAtLeast(0.0)

        println("${char1.name} ataca a ${char2.name} y reduce la vida de ${char2.name} en ${damagePoints} puntos.")
        println("${char2.name} ahora tiene ${char2.health} puntos de vida.")
    }
    //endregion

    //region Exercise 5
    fun createNewSpaceShip() {
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

    //region Exercise 6
    fun createAnimals() {
        println("Exercise 6")
        val dog = Dog(name = "Buddy", breed = "Golden Retriever")
        val bird = Bird(name = "Parrot", canFly = true)
        val whale = Whale(name = "Blue Whale", size = "Enormous")

        println("${dog}, \n ${bird}, \n ${whale}")

    }
    //endregion

    //region Exercise 7
    fun createUsers() {
        println("Exercise 7")
        val admin = User("Jaime", "jaimeduente@gmail.com", "Duente", Role.Admin)
        val employee = User("Employee", "employee@gmail.com", "Duke", Role.Employee)
        val client = User("Client", "client@gmail.com", "Duke", Role.Client)

        println("${admin}, \n ${employee}, \n ${client}")

    }
    //endregion
}
