package com.kotlin.ariftarpicikotlin.collections

fun collections(){

   /* var a = ArrayList<String>()
    a.add("Hello")*/

   /*var a = listOf(1, 2, 3) // kotlin infer as List<Int>. IMMUTABLE
    var a = mutableListOf(1, 2, 3)
    a.add(5)*/

    /*var a = mapOf(1 to "one", 2 to "two") // IMMUTABLE
    var a = mutableMapOf(1 to "one", 2 to "two")
    a.put(3, "three")*/

    /*var myList = listOf("one","two", "three")
    //for (i in myList.indices){
        //println(myList[i])
    //}
    for (i in myList){
        println(i)
    }*/

    var myMaps = mapOf(1 to "one", 2 to "two")
    //for (item in myMaps){ // or myMaps.keys
        //println("Key: " + item.key + "  Value: " + item.value)
    //}
    for ((key,value) in myMaps){
        println("Key: $key  Value: $value")
    }
}