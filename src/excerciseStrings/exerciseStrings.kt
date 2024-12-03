package excerciseStrings

fun main() {
    val exercisesString = ExerciseStringsMethods();
    val text1 : String = "Test Text 1 a e i o u";
    val text2 : String = "Test Text 2 a e i o u";
    val char1 : Char = 'a';
    val char2 : Char = 'o';

    val exercise1 : String =  exercisesString.concatenate(text1, text2)
    println(exercise1);

    val exercise2 : String = exercisesString.replaceWith(text1, char1, char2)
    println(exercise2);

    val exercise3 : String = exercisesString.trimStringStartEnd(text1, char1)
    println(exercise3);

    val exercise4 : String = exercisesString.firstTwoChar(text1)
    println(exercise4);

    val exercise5 : Boolean = exercisesString.checkIfEqual(text1)
    println(exercise5);

    val exercise6 : Boolean = exercisesString.checkIfEqual(text1, text2)
    println(exercise6);




}