package me.mjhasan.kotlin.oop.interfaceKT

fun main() {
    val circle = Circle(5.0)
    println(circle.area())
    println(circle.perimeter())

    val car = Car("BMW")
    println(car.start())
    println(car.stop())
    println(car.getFullInfo())

    val bicycle = Bicycle("Akij Bicycle")
    println(bicycle.getFullInfo())

    val bike = Bike("TVS")
    println(bike.getFullInfo())
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


interface Vehicle {
    val maxSpeed: Double

    fun start()
    fun stop()
    fun getFullInfo(): String
}

class Car(val brandName: String) : Vehicle {
    override val maxSpeed: Double = 200.0
    override fun start() {
        println("Car is starting")
    }

    override fun stop() {
        println("Car is stopping")
    }

    override fun getFullInfo(): String {
        return "Name: $brandName, MaxSpeed: $maxSpeed"
    }
}

class Bicycle(val brandName: String) : Vehicle {
    override val maxSpeed: Double = 78.0
    override fun start() {
        println("Bicycle is starting")
    }

    override fun stop() {
        println("Bicycle is stopping")
    }

    override fun getFullInfo(): String {
        return "Name: $brandName, MaxSpeed: $maxSpeed"
    }
}

class Bike(val brandName: String) : Vehicle {
    override val maxSpeed: Double = 98.0
    override fun start() {
        println("Bike is starting")
    }

    override fun stop() {
        println("Bike is stopping")
    }

    override fun getFullInfo(): String {
        return "Name: $brandName, MaxSpeed: $maxSpeed"
    }
}