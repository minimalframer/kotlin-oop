package me.mjhasan.kotlin.oop.dataClass

fun main() {
    val robi = Student("Robi", 33)
    println(robi.getInfo())
    println(robi)

    val robin = Employee("Robbin", 25000)
    println(robin.name)
    println(robin.salary)
    println(robin)
}

class Student(private var name: String, private var roll: Int) {
    fun getInfo(): String {
        return "Name: $name, Roll: $roll"
    }

    override fun toString(): String {
        return "Student(name='$name', roll=$roll)"
    }
}

data class Employee(var name: String, var salary: Int)