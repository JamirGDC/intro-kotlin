package exercises.arrays

class ExerciseArray {

    private val exerciseArray = ArrayMethods()

    fun executeAllExercises() {

        //region Exercise 1
        val array : IntArray = intArrayOf(1, 2, 3, 4)
        val newArray: IntArray = exerciseArray.insertArray(array, 33, 2)
        println(newArray.joinToString())

        //endregion

        //region Exercise 2
        val array2 : IntArray = intArrayOf(1, 2, 3, 4)
        val response: Boolean = exerciseArray.findValArray(array2,  2)
        println(response)

        //endregion

        //region Exercise 3
        val array3: IntArray = intArrayOf(1, 2, 3, 4, 2, 2, 5)
        val countVal = 2
        val result = exerciseArray.countOccurrencesArray(array3, countVal)

        println("El número $countVal se $result veces.")

        //endregion

        //region Exercise 4

        val array4: IntArray = intArrayOf(4, 1, 3, 9, 2)
        val resultarray = exerciseArray.noSortDescending(array4)
        println(resultarray.joinToString(", "))

        //endregion

        //region Exercise 5
        val array5: Array<String> = arrayOf("cuatro", "uno", "tres", "nueve", "dos")

        val resultex5 = exerciseArray.insertStringArray(array5, "text")
        println(resultex5.joinToString(","))


        //endregion

        //region Exercise 6
        val array6: IntArray = intArrayOf(4, 1, 3, 9, 2)
        val resultMissingNumber = exerciseArray.findMissingInt(array6)
        println(resultMissingNumber)

        //endregion

    }
}



