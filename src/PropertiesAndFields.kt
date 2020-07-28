package com.kotlin.ariftarpicikotlin.propertiesandfields

import java.util.*

class PropertiesAndFields(/*val firstName: String, val lastName: String*/) {

    lateinit var firstName: String

    // redundant set and get
    var lastName: String = ""
        set(value) {
            field = value
        }
        get() = field

    // throw error because kotlin create automatic setter and getter after compile
    //fun setLastName(v: String){

    //}

    fun createAccount() {
        // a value assign?
        if(this::firstName.isInitialized){
            println("first name have a value")
        }
    }
}