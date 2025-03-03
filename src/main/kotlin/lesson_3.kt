package org.example

fun main() {


    val greeting = "Hello"
    val space = ' '
    val userName = "Barbashka"

//    конкатенация строк
//      println(greeting + ", " + userName + "!" + space + "Whats is your main question?")

//    иитерполяция строк
//    println("$greeting, $userName! Whats is your main question?")
//    println("To wtich you can respond ${40 + 2}")

    val multiString = """
        |aaaaaaa
    |bbbbbbb
        |cccccc
""".trimMargin()
//println(multiString)

    val phrase = "And he said - \"it is magnificent!\""
    println(phrase)
}