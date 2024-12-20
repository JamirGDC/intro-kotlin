import exercises.arrays.ExerciseArray
import exercises.arrays_and_objects.ArraysAndObjects

import exercises.numbers.ExerciseNumbers
import exercises.strings.ExerciseStrings

fun main() {
    //region Enteros
    println("Enteros")
    println("------------------------------")

    val exerciseInteger = ExerciseNumbers()
    exerciseInteger.executeAllExercises()
    println("------------------------------")

    //endregion

    //region Strings
    println("Strings")
    println("------------------------------")
    val exerciseStrings = ExerciseStrings()
    exerciseStrings.executeAllExercises()
    println("------------------------------")

    //endregion

    //region Arrays
    println("Arrays")
    println("------------------------------")
    val exerciseArray = ExerciseArray()
    exerciseArray.executeAllExercises()
    println("------------------------------")

    //endregion

    //region Arrays and Objects
    val arraysAndObjectsMethods = ArraysAndObjects()
    //endregion


}
