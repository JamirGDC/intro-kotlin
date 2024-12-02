class exercises1 {

    fun sumar(firstNumber: Int, secondNumber: Int): Int
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
    fun percentage(playedMatch: Int, wonMatches: Int): String
    {
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
//    fun primeNumber(primeNumber: Int): Int
//    {
//    }


}