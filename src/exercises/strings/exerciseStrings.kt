package exercises.strings

class ExerciseStrings {
    private val exercisesString = stringMethods()
    private val text1 : String = "Test Text 1 a e i o u";
    private val text2 : String = "Test Text 2 a e i o u";
    private val char1 : Char = 'a';
    private val char2 : Char = 'o';

    fun executeAllExercises() {

        val exercise1 : String =  exercisesString.concatenate(text1, text2)
        println(exercise1);

        val exercise2 : String = exercisesString.replaceWith(text1, char1, char2)
        println(exercise2);

        val exercise3 : String = exercisesString.trimStringStartEnd(" ala ", 'a')
        println(exercise3);

        val exercise4 : String = exercisesString.firstTwoChar(text1)
        println(exercise4);

        val exercise5 : Boolean = exercisesString.checkIfEqual("holaho")
        println(exercise5);

        val exercise6 : Boolean = exercisesString.checkIfEqual("text1", "text1")
        println(exercise6);
    }
}
