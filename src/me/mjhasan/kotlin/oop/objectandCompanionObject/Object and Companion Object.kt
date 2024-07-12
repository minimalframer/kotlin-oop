package me.mjhasan.kotlin.oop.objectandCompanionObject

fun main() {
    println("Object and Companion Object")
    Database.connect()

    println(Calculator.PI)
    println(Calculator.RADIAN)

    val car: Car = object : Car("BMW") {
        override fun getInfo(): String {
            return brandName
        }
    }

    println(car.getInfo())
}

object Database {
    fun connect() {}
}

class Calculator {
    companion object Constants {
        const val PI: Double = 3.14
        const val RADIAN: Double = 0.0174
    }
}

abstract class Car(val brandName: String) {
    abstract fun getInfo(): String
}