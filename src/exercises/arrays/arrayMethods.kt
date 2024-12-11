package exercises.arrays

class ArrayMethods {

    //region Exercise 1
    fun insertArray(requestArray: IntArray, requestInsertVal: Int, requestIndex : Int): IntArray
    {
        val responseArray: IntArray = IntArray(requestArray.size + 1) {0}

        System.arraycopy(requestArray, 0, responseArray, 0, requestIndex)

        responseArray[requestIndex] = requestInsertVal

        System.arraycopy(requestArray, requestIndex, responseArray, requestIndex + 1, requestArray.size - requestIndex)

        return responseArray
    }
    //endregion

    //region Exercise 2
    fun findValArray(requestArray: IntArray, requestFindVal : Int) : Boolean
    {
        return requestFindVal in requestArray
    }
    //endregion

    //region Exercise 3
    fun countOccurrencesArray(requestArray: IntArray, requestCountVal: Int): Int {
        return requestArray.count { x -> x == requestCountVal }
    }
    //endregion

    //region Exercise 4
    fun noSortDescending(array: IntArray) : IntArray {

        if (array.isEmpty()) return array
        if (array.size == 1) return array

        val result = array.copyOf()
        val n = result.size

        for (i in 0..< n - 1) {
            for (j in 0..< n - i - 1) {
                if (result[j] > result[j + 1]) {
                    val temp = result[j]
                    result[j] = result[j + 1]
                    result[j + 1] = temp
                }
            }
        }
        return result
    }
    //endregion

    //region Exercise 5
    fun insertStringArray(requestArray: Array<String>, requestInsertVal: String): Array<String?>
    {
        val result = requestArray.copyOf(requestArray.size + 1)
        result[requestArray.size] = requestInsertVal
        return result
    }
    //endregion

    //region Exercise 6
    fun findMissingInt(requestArray: IntArray): Int
    {
        for (i in 1..1_000_000)
        {
            if (!requestArray.contains(i))
            {
                return i
            }
        }
        return -1
    }
    //endregion









}