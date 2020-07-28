package com.kotlin.ariftarpicikotlin.entrykotlin

fun getLastName(): String {
    return "Tarpıcı"
}

class Profile {

    //var _firstName: String? = null
    //var _firstName: String = "Arif"
    //lateinit var _firstName: String

    //    unrecommend because already available default get and set methods
//    var _firstName: String = "Arif"
//        get() = field
//        set(value) {
//            field = value
//        }

    lateinit var _firstName: String
    fun getFirstName(): String {
        return "Arif"
    }
}