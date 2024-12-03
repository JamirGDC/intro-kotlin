package excerciseStrings

import java.util.*

class ExerciseStringsMethods {

    fun concatenate(firstString: String, secondString: String): String
    {
        return "$firstString $secondString";
    }

    fun replaceWith(stringReplaced : String, charReplaced: Char, charToReplace : Char): String
    {
        return stringReplaced.replace(charReplaced, charToReplace);
    }

    fun trimStringStartEnd(stringToTrim: String, charToTrim: Char): String
    {
        val result = when {
            stringToTrim.startsWith(charToTrim) -> stringToTrim.substring(1)
            stringToTrim.endsWith(charToTrim) -> stringToTrim.substring(0, stringToTrim.length - 1)
            else -> stringToTrim
        }
        return result

    }

    fun firstTwoChar(stringToEdit : String) : String
    {
        return stringToEdit.substring(0, 2)
    }

    fun checkIfEqual(stringToCheck : String) : Boolean
    {
        return stringToCheck.substring(0) == stringToCheck.substring(1)
    }

    fun checkIfEqual(firstStringToCheck : String, secondStringToCheck : String) : Boolean
    {
        return firstStringToCheck.lowercase() == secondStringToCheck.lowercase()
    }





}