package com.example.helloworld

import android.widget.Switch
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*

class Greetings(private val switch: Switch?) {

    private val generator = Random()
    val greetingsText = arrayOf("Hey", "Hey man", "Hi", "Long time no see", "Yo!")
    val greetingsTextForeign = arrayOf("مرحبا", "Hola", "你好", "God dag", "Hoi", "Bonjour", )

    public fun get(): String {
        if (switch?.isChecked == false) {
            val index = generator.nextInt(greetingsText.size)
            return greetingsText[index]
        }else {
            val index = generator.nextInt(greetingsTextForeign.size)
            return greetingsTextForeign[index]
        }
    }
}