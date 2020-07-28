package com.kotlin.ariftarpicikotlin.typesystem

fun typeSystem() {
    // ALL REFERENCE AND PRIMITIVE TYPE INHERITED BY ANY IN KOTLIN.
    // BUT ANY AFTER COMPILE CONVERT TO OBJECT AS IN JAVA OBJECT
//    var i: Any = 2
//    var ı = 3
//    var s: Any = "Hello"
    //var f: Float = ı.toFloat()

    // Throw exception
    //var f: Float = (s as Int).toFloat()

//    var ii: Int? = null
//    if (ii != null){
//       var result = ii.rangeTo(10)
//    }

    //throw exception because ii if null return nullable
    //var result: IntRange = ii?.rangeTo(10)

    //var result: IntRange? = ii?.rangeTo(10)
//    var result: IntRange = ii!!.rangeTo(10)

//    var i = true
//    println(i.toString())
    //var ii: Long = 1234567
//    var ii = 1234567896L //long
//    var iii = 1_234_567_896L //long
//    var k = 45f //float

    var i: Any = 5
    /*when(i){
        is Int -> println(i)
        is Float -> println(i)
        is String -> println(i)
    }*/
    //var result: Boolean = i is String //false
    var result: Boolean = i !is String //true
    println(result)
}



