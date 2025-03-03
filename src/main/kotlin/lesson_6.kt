package org.example

fun main() {
//    wile, do wile
   var counter = 5

//    while (counter > 0) {
//        println("реклама закончится через ${counter--}")
//        Thread.sleep(1000)
//    }


do {
    println("реклама закончится через ${counter--}")
    Thread.sleep(1000)
}while (counter > 0)







}