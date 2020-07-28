package com.kotlin.ariftarpiciwithkotlin.platformTypes

import java.util.*

open class ProfileTen{
    fun writeMyName(firstName: String){
        // kotlin allowed because itself assesment null or not for only platform types
        var calendar: Calendar? = Calendar.getInstance()
        /*if (calendar != null){
            calendar.get()
        }
        // or
        calendar?.get()*/

        // if java types annotation such as @Nullable or @NotNull
        // kotlin create right type
        // in short; kotlin does not put exclamation point(!) end of type
    }
}
