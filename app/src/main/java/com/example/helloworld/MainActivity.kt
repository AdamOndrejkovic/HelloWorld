package com.example.helloworld

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Switch
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var greetings = Greetings(null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        greetings = Greetings(findViewById(R.id.slanguage))
        btnOK.setOnClickListener { onClickOK() }
        btnCancel.setOnClickListener { onClickCancel() }
    }

    private fun onClickCancel() {
        val etName = findViewById<EditText>(R.id.etName)
        etName.text.clear()
    }

    @SuppressLint("SetTextI18n", "UseSwitchCompatOrMaterialCode")
    private fun onClickOK() {
        val tvHeader = findViewById<TextView>(R.id.tvHeader)
        val etName = findViewById<EditText>(R.id.etName)
        val sGender = findViewById<Switch>(R.id.sGender)
        val lyScreen = findViewById<LinearLayout>(R.id.lyScreen)
        val greeting = greetings.get()
        val name = etName.text.toString()
        if (name.length >= 3) {
            if (!sGender.isChecked) {
                lyScreen.setBackgroundColor(Color.parseColor("#328fa8"))
            } else {
                lyScreen.setBackgroundColor(Color.parseColor("#f065e9"))
            }
            tvHeader.text = "$greeting $name"
            etName.setText("")
        }
    }
}