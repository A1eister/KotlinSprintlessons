package org.example
fun main() {
    //List
    //Set
    //Map

    //фиксированный размер у массива
    //Array,<T>, List<T>
    //массивы оптимизированы для примитивов
    //отличается процесс сравнения элементов

    val list: List<Int> = listOf(4, 4, 2)
    val list2: MutableList<Int> = mutableListOf(1, 2, 3)

    val mutableList = mutableListOf(11, 15, 20, 12, 9, 14)
//    println(mutableList)

    mutableList.add(42)
//    println(mutableList)

    mutableList.add(0, 42)
//    println(mutableList)

//    println(mutableList.contains(42))

//    println(mutableList.isEmpty())
//    println(mutableList.isNotEmpty())

//    println(mutableList.indexOf(42))
//    println(mutableList.lastIndexOf(42))

    mutableList.sort()
    mutableList.sortDescending()
//    mutableList.reverse()
    println(mutableList)

    mutableList.forEach{

    }



}