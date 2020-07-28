package com.kotlin.ariftarpicikotlin.classes

//class Profile
// primary constructor
//class Profile constructor(firstName: String) or another syntax class Profile constructor(firstName: String){}
// or another syntax class Profile(firstName: String)

// secondary constructor example with primary constructor
class ClassProfile constructor(firstName: String){

    var mFirstName: String = firstName

    // WORK LİNE --> 1.primary ctor 2.init block 3.secondary ctor
    init {
        println("First Name In init block: $firstName")
    }

    //secondary ctor
    constructor(firstName: String, lastName: String): this(firstName){
        println("First Name In secondary ctor: $firstName")
    }

    // WORK LİNE --> 1.this ctor calls secondary ctor 2.secondary ctor calls primary ctor
    // 3.primary ctor works 4.init block works 5.secondary ctor works 6.this ctor works
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName){
        println("2. First Name In 2.Constructor: $firstName")
    }

    /*// multiple init block. and always work by work line in 13.line this page
    init {
        println("First Name In init block two: $firstName")
    }*/

    // this func does not access primary ctor's params. read more below ClassProfileTwo
    fun writeSomething(){
        println("$mFirstName from write something")
    }
}

class ClassProfileTwo constructor(val firstName: String){ //best practise val keyword. or can use var keyword

    constructor(firstName: String, lastName: String): this(firstName){
        println("2. First Name: $firstName")
    }

    // this func does access primary ctor's params because var keyword
    fun writeSomething(){
        println("$firstName from write something")
    }

}

data class ClassProfileThree(val firstName: String){ // after data keywords, references equals is true in Main.kt 27.line

}

// nested class example
class ClassProfileFour(val firstName: String, val lastName: String){
    private var mFirstName: String = firstName
    /*
    //nested class
    class Account{
        fun writeFirstName(){
            // println(mFirstName) does not access mFirstName property
            println("Hello From Nested Class")
        }
    }*/
    //inner class in nested classes
    inner class Account{
        fun writeFirstName(){
            println("Hello From Nested Class: $mFirstName")
        }
    }
}