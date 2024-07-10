package me.mjhasan.kotlin.oop

fun main() {
    val a: Int = 20
    val b: Int = 0

    val calculator = Calculator(a, b)
    val add = calculator.addition()
    val sub = calculator.subtraction()
    val multiply = calculator.multiplication()
    val divide = calculator.division()

    println("$add, $sub, $multiply, ${divide ?: "Divide by zero not allowed!"}")
}

class Calculator(val a: Int, val b: Int) {
    fun addition(): Int = a + b

    fun subtraction(): Int = a - b

    fun multiplication(): Int = a * b

    fun division(): Int? {
        return try {
            a / b
        } catch (e: ArithmeticException) {
            println("${e.message} not allowed!")
            null
        }
    }
}