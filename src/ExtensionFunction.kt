package com.kotlin.ariftarpicikotlin.extensionfunction

open class ProfileNine{
    fun writeMyName(firstName: String): String{
        return "Mr. $firstName"
    }
}

// extension func resolved as static
fun ProfileNine.printHelloWorld(name:String){
    println(this.writeMyName(name))
}

class Account: ProfileNine()

fun ProfileNine.printHelloWorld2(){
    println("Profile")
}

fun Account.printHelloWorld2(){
    println("Account")
}

fun writeHelloWorld(profile: ProfileNine){
    profile.printHelloWorld2()
}

fun ProfileNine?.printHelloWorld3(){
    //this!!.writeMyName("Arif")
    //this?.writeMyName("Arif") // if not null call it, if null does not nothing
    if(this != null){
        this.writeMyName("Arif")
    }
}

fun ProfileNine.writeMyName(firstName: String): String{
    return "$firstName From extension function"
}