package me.mjhasan.kotlin.oop.scopeFunctions

fun main() {
    println("Scope Functions")

    Student().also {
        println(it.name)
        println(it.age)
        println(it.roll)

        it.name = "Muhammed Hasan"
        println(it)
    }

    Student().apply {
        name = "mjhasan"
        println(name)
    }

    var name: String = Student().let {
        it.name
    }
    println(name.uppercase())

    Student().run {
        name = "Muhammed Hasan"
        println(name)
        true
    }
}


class Student {
    var name: String = "Hasan"
    val age: Int = 20
    val roll: Int = 8119114

    override fun toString(): String {
        return "Student(name='$name', age=$age, roll=$roll)"
    }
}