package com.kotlin.ariftarpicikotlin

import com.kotlin.ariftarpicikotlin.classes.ClassProfile
import com.kotlin.ariftarpicikotlin.classes.ClassProfileFour
import com.kotlin.ariftarpicikotlin.classes.ClassProfileThree
import com.kotlin.ariftarpicikotlin.classes.ClassProfileTwo
import com.kotlin.ariftarpicikotlin.collections.collections
import com.kotlin.ariftarpicikotlin.extensionfunction.*
import com.kotlin.ariftarpicikotlin.functionliteralswithreceiver.printValue
import com.kotlin.ariftarpicikotlin.functionliteralswithreceiver.printValue2
import com.kotlin.ariftarpicikotlin.functionliteralswithreceiver2.HTML
import com.kotlin.ariftarpicikotlin.functionliteralswithreceiver2.html
import com.kotlin.ariftarpicikotlin.functionsandlambdaexpressions.FuncAndLambda
import com.kotlin.ariftarpicikotlin.inheritance.inheritanceClass
import com.kotlin.ariftarpicikotlin.inheritance.inheritanceClass4
import com.kotlin.ariftarpicikotlin.propertiesandfields.PropertiesAndFields
import com.kotlin.ariftarpicikotlin.typesystem.typeSystem
import com.kotlin.ariftarpicikotlin.entrykotlin.Profile
import com.kotlin.ariftarpicikotlin.entrykotlin.getLastName
import java.lang.StringBuilder

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        // YOU CAN USE THE CODES BY REMOVING THE COMMENT LINES BELOW
        // BUT RUN EACH STEP SEPARATELY AND SINGLY

        // STEP 1
        /*println("Hello friends. Let's learn kotlin.")
        println(getName())*/

        // STEP 2
        //getLoopsAndConditions()

        // STEP 3
        //typeSystem()

        // STEP 4
        //collections()

        // STEP 5
        /*
        //ClassProfile("Arif", "Tarpıcı",15)
        //ClassProfileTwo("Arif", "Tarpıcı").writeSomething()

        //var profileThreeOne = ClassProfileThree("Arif")
        //var profileThreeTwo = ClassProfileThree("Arif")
        //var result = profileThreeOne.equals(profileThreeTwo) //compare references or another syntax (profileThreeOne == profileThreeTwo)
        //println(result) // false but if data keyword is exists, true

        //var profileThreeThree = ClassProfileThree("Arif")
        //var profileThreeFour = ClassProfileThree("Arif")
        //println(profileThreeThree.toString()) // without data keyword output as: com.kotlin.ariftarpicikotlin.classes.ClassProfileThree@17e1886
        // with data keyword output as: ClassProfileThree(firstName=Arif)

        //ClassProfileFour.Account().writeFirstName() without inner keyword in nested class
        //ClassProfileFour("Arif","Tarpıcı").Account().writeFirstName()
         */

        // STEP 6
        /*var propertyAndFieldClass = PropertiesAndFields()
        propertyAndFieldClass.firstName = "Arif"
        propertyAndFieldClass.createAccount()*/

        // STEP 7
        //inheritanceClass4().helloWorld()

        // STEP 8
        /*
        //println(FuncAndLambda().writeMyName("Arif","Tarpıcı2")) // another syntax firstName = "Arif"
        //println(FuncAndLambda().writeMyName("Arif",age = 20))
        //println(FuncAndLambda().writeMyName2("Arif",age = 20))
        //println(FuncAndLambda().writeMyName3("Arif",{->33}))
        //println(FuncAndLambda().writeMyName3("Arif",{33}))
        //println(FuncAndLambda().writeMyName4("Arif",{a->a+33}))
        //println(FuncAndLambda().writeMyName4("Arif") {a->a+33}) //if lambda expression is last expression
        //println(FuncAndLambda().writeMyName4("Arif") {a->
            //var myAge = 23
            ////return myAge + a // ERROR. because kotlin's scope is different. this return is this fun main return
            //return@writeMyName4 myAge + a
        //})

        // STEP 9
        //println(FuncAndLambda().writeMyName5("Arif",{age->
            //println("I am $age years old")
        //}))

        // STEP 10
        //println(FuncAndLambda().writeMyName4("Arif") {
            //var myAge = 23
            //return@writeMyName4 myAge + it
        //})
        */

        // STEP 11
        /*
        //ProfileNine().printHelloWorld("Arif")
        //writeHelloWorld(Account())
        //println(ProfileNine().writeMyName("Arif")) // always member function get ahead
         */

        // STEP 12
        // function literals with receiver
        //5.printValue()
        //printValue2({
            //println(this.plus(3))
        //})
        // or syntax
        //printValue2 {
            //println(this.plus(3))
        //}
        //such as...
        //var builder = StringBuilder().apply({})

        // STEP 13
        // we own domain specific language
        /*html({
            this.body()
        })*/
    }

    fun getName(): String {

        val profile = Profile()
        profile._firstName = "Arif2"

        //val name = "${Profile().getFirstName()} ${getLastName()}"
        val name = "${profile._firstName} ${getLastName()}"
        var age = 32

        //return name + " " + age
        return "$name ${age - 2}"
    }

    fun getLoopsAndConditions() {
        //var names = listOf("arif", "mehmet", "musa")
//        for (name in names) {
//            println(name)
//        }

        //var i = 2
        //var twoToTen = i.rangeTo(10)

//        var twoToTen = 2..10
//        for (count in twoToTen) {
//            println(count)
//        }

//        for (i in 0..names.count()-1){
//            println(names[i])
//        }
//        for (i in names.indices){
//            println(names[i])
//        }

//        for (i in 4 downTo 1){
//            println(i)
//        }
//        for (i in 4 downTo 1 step 2){
//            println(i)
//        }

        var number = 3
//        when (number){
//            1 -> println("one")
//            2 -> {
//                println("multiline two")
//            }
//            else -> {
//                println("what do you mean")
//            }
//        }
        when (number){
            in 1..10 -> println("number is among 1 and 10")
            !in 10..20 -> println("number is not among 10 and 20")
        }
    }
}




