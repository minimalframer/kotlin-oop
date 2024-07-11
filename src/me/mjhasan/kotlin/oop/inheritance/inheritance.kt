package me.mjhasan.kotlin.oop.inheritance

fun main() {
    println("Hello World")

    val employee = Employee("Muhammed", "Hasan")
    println(employee.getFullInfo())

    val bse = BaseSalariedEmployee(30000, "Muhammed", "Hasan")
    println(bse.getFullInfo())


}

open class Employee(val firstName: String, val lastName: String) {
    open fun getFullInfo() = "$firstName $lastName"
}

class BaseSalariedEmployee(var salary: Int, firstName: String, lastName: String): Employee(firstName, lastName) {
    override fun getFullInfo() = "$firstName $lastName draws $salary taka per month."
}