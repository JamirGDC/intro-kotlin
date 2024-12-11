package exercises.numbers

class ExerciseNumbers {
    private val exercisesNumbers = NumberMethods()

    fun executeAllExercises() {
        val exercise1: Int = exercisesNumbers.sum(2, 3)
        println("The sum is: $exercise1")

        val exercise2: Int = exercisesNumbers.multiply(2, 3)
        println("The multiplication result is: $exercise2")

        val exercise3: Double? = exercisesNumbers.divide(2.4, 3)
        println("The division result is: $exercise3")

        val exercise4: Int? = exercisesNumbers.divide(2, 3)
        println("The division result is: $exercise4")

        val exercise5: String? = exercisesNumbers.percentage(99, 7)
        println("The percentage is: $exercise5")

        val exercise6: Int = exercisesNumbers.largestNumber(2, 3)
        println("The largest number is: $exercise6")

        val exercise7: Int = exercisesNumbers.volume(2, 3, 3)
        println("The volume is: $exercise7")

        val exercise8: List<Int> = exercisesNumbers.primeNumber(5)
        println("The prime numbers are: $exercise8")

    }
}

