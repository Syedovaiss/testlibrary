package com.ovais.android.commons

import android.content.Context
import android.widget.Toast

/**
Created By Ovais on 2/1/21
 */

object ViewHelpers {

    fun Context.displayShortToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


    fun Context.displayLongToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

}