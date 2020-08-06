package com.dayanidhi.calculator

class CalculateFactorial {
    val MAX = 1000

    private var res_size = 0
    private val res = IntArray(MAX)

    fun CalculateFactorial() {
        res_size = 1
    }

    fun getRes(): Int {
        return res_size
    }

    // This function finds factorial of large numbers and prints them
    fun factorial(n: Int): IntArray? {
        // Initialize result
        res[0] = 1

        // Apply simple factorial formula n! = 1 * 2 * 3 * 4...*n
        for (x in 2..n) res_size = multiply(x, res_size)
        return res
    }

    // This function multiplies x with the number represented by res[].
    // res_size is size of res[] or number of digits in the number represented
    // by res[]. This function uses simple school mathematics for multiplication.
    // This function may value of res_size and returns the new value of res_size
    private fun multiply(x: Int, r: Int): Int {
        var r = r
        var carry = 0 // Initialize carry

        // One by one multiply n with individual digits of res[]
        for (i in 0 until r) {
            val prod = res[i] * x + carry
            res[i] = prod % 10 // Store last digit of 'prod' in res[]
            carry = prod / 10 // Put rest in carry
        }

        // Put carry in res and increase result size
        while (carry != 0) {
            res[r] = carry % 10
            carry = carry / 10
            r++
        }
        return r
    }
}