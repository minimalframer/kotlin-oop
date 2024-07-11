package me.mjhasan.kotlin.oop.abstractClassMethod

fun main() {
    val firstName: String = "Muhammed"
    val lastName: String = "Hasan"

    val bse = BaseSalariedEmployee(firstName, lastName, 25000)
    println(bse.getFullInfo())

    val hse = HourlySalariedEmployee("Robin", "Hossein", 100, 300)
    println(hse.getFullInfo())

    val employees: List<Employee> = listOf(bse, hse)

//    runtime Polymorphism
    for (employee in employees) {
        println(employee.getFullInfo())
    }
}

abstract class Employee(val firstName: String, val lastName: String) {
    abstract fun getFullInfo(): String
}

class BaseSalariedEmployee(firstName: String, lastName: String, var salary: Int) : Employee(firstName, lastName) {
    override fun getFullInfo() = "$firstName $lastName draws $salary BDT per month."
}

class HourlySalariedEmployee(firstName: String, lastName: String, var hourlyRate: Int, var totalHour: Int) :
    Employee(firstName, lastName) {
    override fun getFullInfo() = "$firstName $lastName draws $hourlyRate BDT per hour."
}


abstract class Somthing() {
    abstract fun somThing(): Unit
    fun nothing(): Int {
        return 0
    }
}