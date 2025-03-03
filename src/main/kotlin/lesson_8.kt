package org.example
fun main() {

//    val ingredient1 = "яйцо"
//    val ingredient2 = "помидор"
//    val ingredient3 = "зелень"
//    val ingredient4 = "соль"
//    val ingredient5 = "перец"

    val arrayOfIngredient: Array<String> = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

//    val intArray1: IntArray = intArrayOf(4, 4, 2)
//    val charArray1: CharArray = charArrayOf('4', '4', '2')
//
////    val intArray2 = arrayOf()
//
//    var intArray3 = intArrayOf(1, 2, 3, 4, 5)
//    intArray3 = intArrayOf(1, 2, 3, 4, 5)
////    println("Размер массива с ингредиентами: ${arrayOfIngredient.size}")
//
////    println(arrayOfIngredient.indexOf("помидор"))
////    println(arrayOfIngredient[1])
////    println(arrayOfIngredient[2])
//    println(arrayOfIngredient[5]) // error

//    arrayOfIngredient[4] = "паприка"
//    println(arrayOfIngredient[4])

//        arrayOfIngredient.set(1, "капуста") ////???????what
//        arrayOfIngredient[1]
//        println(arrayOfIngredient)

    for(i in arrayOfIngredient) {
        println("Ингредиент ${arrayOfIngredient.indexOf(i) + 1}: $i")
    }



}