package org.example

fun main() {

    val userAge = readln().toInt()

//                                              Draft_1

//    if (userAge >= AGE_OF_MAJORITY) {
//        println("Show spesial content")
//    } else if (userAge == 16 || userAge ==17) {
//        println("Show limited content")
//    }
//    else {
//        println("Back to main screen")
//    }

//                                              Draft_2

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Show spesial content"
    } else if (userAge == 16 || userAge ==17) {
        "Show limited content"
    }
    else {
        "Back to main screen"
    }
//  println(resultText)

//                                             Draft_3
//    when(userAge) {
//        10 -> println("Your namber is 10")
//        20 -> println("Your namber is 20")
//        42 -> println("Your namber is 42")
//        else -> println("Another number")
//    }

//                                              draft_4

    val consoleNumber = when(userAge) {
        10 -> {
            println("Additional action")
            "Your namber is 10"
        }
        20 -> "Your namber is 20"
        42 -> "Your namber is 42"
        else -> "Another number"
    }
println(consoleNumber)


}

const val AGE_OF_MAJORITY = 18
