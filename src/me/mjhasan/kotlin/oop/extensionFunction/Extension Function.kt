package me.mjhasan.kotlin.oop.extensionFunction

fun main() {
    println("Extension Function")
    println(100.isEven())
    println(11.isOdd())

    val a = 25
    println(a.isEven())

    println(true.reverse())
    println(false.reverse())
}

fun Int.isOdd(): Boolean {
    return this % 2 != 0
}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun Boolean.reverse(): Boolean {
    return !this
}