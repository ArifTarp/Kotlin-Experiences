package com.kotlin.ariftarpicikotlin.functionsandlambdaexpressions

class FuncAndLambda {
    fun writeMyName(firstName: String, lastName: String = "Tarpıcı", age: Int = 32): String {
        return "Mr. $firstName $lastName, $age"
    }

    fun writeMyName2(firstName: String, lastName: String = "Tarpıcı", age: Int = 32): String =
        "Mr. $firstName $lastName, $age"

    fun writeMyName3(firstName: String, age: () -> Int): String {
        return "Mr. $firstName ${age()}"
    }

    fun writeMyName4(firstName: String, age: (Int) -> Int): String {
        return "Mr. $firstName ${age(1)}"
    }

    fun writeMyName5(firstName: String, age: (Int) -> Unit): String{
        age(26)
        return "Mr. $firstName"
    }

    // member level func
    fun writeMyName6(firstName: String): String{
        return "Mr. $firstName"
    }
}

// root level func
fun writeMyName6(firstName: String): String{
    return "Mr. $firstName"
}



