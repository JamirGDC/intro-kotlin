package excerciseNumbers

class exercisesNumbers {

    fun sum(firstNumber: Int, secondNumber: Int): Int
    {
        return firstNumber + secondNumber;
    }

    fun multiply(firstNumber: Int, secondNumber: Int): Int
    {
        return firstNumber * secondNumber;
    }
    fun divide(dividend: Double, divider: Int): Double? {
        return if (divider != 0) dividend / divider else null
    }
    fun divide(dividend: Int, divider: Int): Int?
    {
        return if(dividend != 0) divider else null
    }
    fun percentage(playedMatch: Int, wonMatches: Int): String?
    {
        if (playedMatch < wonMatches) return null
        val result = playedMatch * 100 / wonMatches;
        return "$result%";
    }
    fun largestNumber(firstNumber: Int, secondNumber: Int): Int
    {
        return maxOf(firstNumber, secondNumber);
    }
    fun volume(with: Int, volume: Int, height: Int): Int
    {
        return with * volume * height;
    }
    fun primeNumber(primeCount: Int): List<Int>
    {
        val numbers: MutableList<Int> = mutableListOf()
        var firstPrimeNumber = 2;

        while (numbers.size < primeCount)
        {
            if (isPrimeNumber(firstPrimeNumber)) numbers.add(firstPrimeNumber)
            firstPrimeNumber++
        }
        return numbers;
    }

    private fun isPrimeNumber(checkNumber: Int): Boolean
    {
        if(checkNumber == 0 || checkNumber == 1 || checkNumber == 4) return false;
        for (i in 2..<checkNumber)
        {
            if(checkNumber % i == 0)
                return false;
        }
        return true;
    }


}