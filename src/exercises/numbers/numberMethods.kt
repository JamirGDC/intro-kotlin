package exercises.numbers

class NumberMethods {

    //region exercise 1
    fun sum(firstNumber: Int, secondNumber: Int): Int
    {
        return firstNumber + secondNumber
    }
    // endregion

    //region exercise 2

    fun multiply(firstNumber: Int, secondNumber: Int): Int
    {
        return firstNumber * secondNumber
    }
    // endregion

    //region exercise 3

    fun divide(dividend: Double, divider: Int): Double? {
        return if (divider != 0) dividend / divider else null
    }
    // endregion

    //region exercise 4

    fun divide(dividend: Int, divider: Int): Int?
    {
        return if(dividend != 0) divider else null
    }
    // endregion

    //region exercise 5

    fun percentage(playedMatches: Int, wonMatches: Int): String?
    {
        if (playedMatches < wonMatches) return null
        val result : Float = wonMatches * 100f / playedMatches
        return "$result%"
    }
    // endregion

    //region exercise 6

    fun largestNumber(firstNumber: Int, secondNumber: Int): Int
    {
        return maxOf(firstNumber, secondNumber)
    }
    // endregion

    //region exercise 7

    fun volume(with: Int, volume: Int, height: Int): Int
    {
        return with * volume * height
    }
    // endregion

    //region exercise 8

    fun primeNumber(primeCount: Int): List<Int>
    {
        val numbers: MutableList<Int> = mutableListOf()
        var firstPrimeNumber = 2

        while (numbers.size < primeCount)
        {
            if (isPrimeNumber(firstPrimeNumber)) numbers.add(firstPrimeNumber)
            firstPrimeNumber++
        }
        return numbers
    }
    // endregion

    //region exercise 9

    private fun isPrimeNumber(checkNumber: Int): Boolean
    {
        if(checkNumber == 0 || checkNumber == 1 || checkNumber == 4) return false
        for (i in 2..<checkNumber)
        {
            if(checkNumber % i == 0)
                return false
        }
        return true
    }

    // endregion


}