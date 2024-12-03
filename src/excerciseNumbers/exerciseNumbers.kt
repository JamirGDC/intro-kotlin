package excerciseNumbers

fun main() {
    val exercisesNumbers = ExerciseNumbersMethods();

    val exercise1 : Int =  exercisesNumbers.sum(2, 3)
    println("La suma es $exercise1")

    val exercise2 : Int =  exercisesNumbers.multiply(2, 3)
    println("La multiplicacion es $exercise2")

    val exercise3 : Double? =  exercisesNumbers.divide(2.4, 3)
    println("La division es $exercise3")

    val exercise4 : Int? =  exercisesNumbers.divide(2, 3)
    println("El divisor es $exercise4")

    val exercise5 : String? =  exercisesNumbers.percentage(4, 3)
    println("El porcentaje es $exercise5")

    val exercise6 : Int =  exercisesNumbers.largestNumber(2, 3)
    println("El numero mas grande es $exercise6")

    val exercise7 : Int =  exercisesNumbers.volume(2, 3, 3)
    println("El volumen es $exercise7")

    val exercise8 : List<Int> =  exercisesNumbers.primeNumber(5)
    println("Los numeros primos son $exercise8")


}