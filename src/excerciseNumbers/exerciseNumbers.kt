package excerciseNumbers

fun main() {
    val exercisesNumbers = ExerciseNumbersMethods()

    val exerciseNumbers = ExerciseNumbersMethods()

    val exercise1: Int = exerciseNumbers.sum(2, 3)
    println("The sum is: $exercise1")

    val exercise2: Int = exerciseNumbers.multiply(2, 3)
    println("The multiplication result is: $exercise2")

    val exercise3: Double? = exerciseNumbers.divide(2.4, 3)
    println("The division result is: $exercise3")

    val exercise4: Int? = exerciseNumbers.divide(2, 3)
    println("The division result is: $exercise4")

    val exercise5: String? = exerciseNumbers.percentage(99, 7)
    println("The percentage is: $exercise5")

    val exercise6: Int = exerciseNumbers.largestNumber(2, 3)
    println("The largest number is: $exercise6")

    val exercise7: Int = exerciseNumbers.volume(2, 3, 3)
    println("The volume is: $exercise7")

    val exercise8: List<Int> = exerciseNumbers.primeNumber(5)
    println("The prime numbers are: $exercise8")


}