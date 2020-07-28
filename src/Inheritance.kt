package com.kotlin.ariftarpicikotlin.inheritance


// if does not declare with open keyword, you can not inheritance
// if use open keyword before class keyword, we can use overridable function with again open keyword before fun keyword
open class inheritanceClassBase(name: String) {
    constructor(name: String, age: Int) : this(name) {

    }

    open fun helloWorld() {
        println("hello")
    }
}


// even there is not ctor, there is default ctor in inheritanceClassBase
class inheritanceClass(name: String) : inheritanceClassBase(name, 21) {
    override fun helloWorld() {
        println("new hello")
        super.helloWorld()
    }
}

class inheritanceClass2 : inheritanceClassBase {
    constructor(name: String, age: Int, address: String) : super(name, age) {

    }
}

// **********************************************************************************

abstract class inheritanceClassBase2(name: String) {
    constructor(name: String, age: Int) : this(name) {

    }

    //must be open keyword for override
    open fun helloWorld() {
        println("hello")
    }
}

class inheritanceClass21 : inheritanceClassBase2 {
    constructor(name: String, age: Int, address: String) : super(name, age) {

    }

    override fun helloWorld() {
        println("new hello")
        super.helloWorld()
    }
}

// **********************************************************************************

// automatic open keyword
interface IInterface {
    fun helloWorld()

    // no obligation override
    fun helloMars() {
        println("Mars")
    }

    val name: String
}

class inheritanceClass3 : IInterface {
    override fun helloWorld() {
        TODO("Not yet implemented")
    }

    override val name: String
        get() = TODO("Not yet implemented")

}

interface IInterface2 {
    fun helloWorld(){
        println("iinterface2")
    }
}

interface IInterface3 {
    fun helloWorld(){
        println("iinterface3")
    }
}

class inheritanceClass4 : IInterface2 , IInterface3 {
    override fun helloWorld() {
        println("hello world")
        super<IInterface3>.helloWorld()
    }
}