package exercises.strings

class stringMethods {

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
        var result = stringToTrim.trim();
        if (result.startsWith(charToTrim)) {
            result = result.substring(1)
        }

        if (result.endsWith(charToTrim)) {
            result = result.substring(0, result.length - 1)
        }

        return result;
    }

    fun firstTwoChar(stringToEdit : String) : String
    {
        return stringToEdit.substring(0, 2)
    }

    fun checkIfEqual(stringToCheck : String) : Boolean
    {
        return stringToCheck.substring(0,2) == stringToCheck.takeLast(2)
    }



    fun checkIfEqual(firstStringToCheck : String, secondStringToCheck : String) : Boolean
    {
        return firstStringToCheck.lowercase() == secondStringToCheck.lowercase()
    }





}