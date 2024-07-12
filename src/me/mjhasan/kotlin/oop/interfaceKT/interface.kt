package me.mjhasan.kotlin.oop.interfaceKT

fun main() {
    val circle = Circle(5.0)
    println(circle.area())
    println(circle.perimeter())
}

interface Shape {
    fun area(): Double
    fun perimeter(): Double
}

class Circle(private val radius: Double) : Shape {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

