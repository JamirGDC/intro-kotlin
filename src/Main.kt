import exercises.arrays.ExerciseArray
import exercises.arrays_and_objects.ArraysAndObjects

import exercises.numbers.ExerciseNumbers
import exercises.objects.Objects
import exercises.strings.ExerciseStrings

fun main() {
    val  lines = "------------------------------"

    //region Enteros
    println("Enteros")
    println(lines)

    val exerciseInteger = ExerciseNumbers()
    exerciseInteger.executeAllExercises()
    println(lines)

    //endregion

    //region Strings
    println("Strings")
    println(lines)
    val exerciseStrings = ExerciseStrings()
    exerciseStrings.executeAllExercises()
    println(lines)

    //endregion

    //region Arrays
    println("Arrays")
    println(lines)
    val exerciseArray = ExerciseArray()
    exerciseArray.executeAllExercises()
    println(lines)

    //endregion

    //region Arrays and Objects
    ArraysAndObjects()
    //endregion

    //region Objects
    val objects = Objects()

    println("--------- Ejercicios Objectos ---------")
    objects.createBrand()
    objects.createCar()
    objects.createNewCharacter()
    objects.createGame()
    objects.createNewSpaceShip()
    objects.createAnimals()
    objects.createUsers()
    //endregion


}
