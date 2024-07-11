package me.mjhasan.kotlin.oop.inheritance

fun main() {
    println("Hello World")

    val employee = Employee("Muhammed", "Hasan")
    println(employee.getFullName())
}

class Employee(val firstName: String, val lastName: String) {
    fun getFullName() = "$firstName $lastName"
}