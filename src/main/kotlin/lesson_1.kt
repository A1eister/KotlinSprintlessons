package org.example

fun main() {

    var numberOfOrder: Int = 42
    val welcomeMessage: String = "Welcome to our app"

//    println(numberOfOrder)
    println(welcomeMessage)

    numberOfOrder = 52
    println(numberOfOrder)

//    const val - константа

//целочисленные
    val intNum1: Int = -2147483648 // 32 bit
    val intNum2: Int = 2147483647 // 32 bit
    val longNum: Long // 64 bit
    val shortNum: Short // 16 bit
    val byteNum: Byte // 8 bit
    val unsignedNum: UInt = 2147483647u // 32 bit

//вещественные
    val doubleNum: Double = 233.36 // 64 bit
    val floatNum: Float = 654.3f // 32 bit

//строковые
    val stringValue: String = "this is barabashka"
    val charValue: Char = '1'
//логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false


}