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

    val house = House("White", 3, 5, false)
    println("${house.color}, ${house.doors}, ${house.windows}, ${house.isForSale}")

    house.updateColor("Green")
    house.putOnSale(true)
    house.updateDoors(5)
    house.updateWindows(7)

    println("${house.color}, ${house.doors}, ${house.windows}, ${house.isForSale}")

    val student = Student("Muhammed", "Hasan", "Philosophy", 8119114)
    println(student.getFullName())
    student.info()

    student.updateName("Uzzal", "Rowshon")
    println(student.getFullName())

    student.updateId(7112024)
    println(student.getId())

    student.updateDepartment("English")
    println(student.getDepartment())

    student.info()
}

class Calculator(private val a: Int, private val b: Int) {
    fun addition(): Int = a + b

    fun subtraction(): Int = a - b

    fun multiplication(): Int = a * b

    fun division(): Int? {
        return try {
            a / b
        } catch (e: ArithmeticException) {
            println("Division by zero is not allowed!")
            null
        }
    }
}

class House(
    var color: String, var doors: Int, var windows: Int, var isForSale: Boolean
) {
    fun updateColor(newColor: String) {
        color = newColor
    }

    fun putOnSale(saleStatus: Boolean) {
        isForSale = saleStatus
    }

    fun updateWindows(newWindows: Int) {
        windows = newWindows
    }

    fun updateDoors(newDoors: Int) {
        doors = newDoors
    }
}

class Student(
    private var firstName: String, private var lastName: String, private var department: String, private var id: Int
) {
    fun updateName(newFirstName: String, newLastName: String) {
        firstName = newFirstName
        lastName = newLastName
    }

    fun updateDepartment(newDepartment: String) {
        department = newDepartment
    }

    fun updateId(newId: Int) {
        id = newId
    }

    fun getFullName(): String = "$firstName $lastName"
    fun getFirstName(): String = firstName
    fun getLastName(): String = lastName
    fun getDepartment(): String = department
    fun getId(): Int = id

    fun info() {
        println("Name: $firstName $lastName")
        println("Department: $department")
        println("ID: $id")
    }
}