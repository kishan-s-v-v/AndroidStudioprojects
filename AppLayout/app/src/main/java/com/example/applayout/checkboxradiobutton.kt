package com.example.applayout

import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class checkboxradiobutton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_checkboxradiobutton)
        var a = findViewById<RadioGroup>(R.id.rg)
        var b = findViewById<CheckBox>(R.id.checkBox)
        var c = findViewById<CheckBox>(R.id.checkBox2)
        var d = findViewById<CheckBox>(R.id.checkBox3)
        var e = findViewById<CheckBox>(R.id.checkBox4)
        var f = findViewById<CheckBox>(R.id.checkBox5)
        var g = findViewById<TextView>(R.id.textView3)
        var h= findViewById<TextView>(R.id.textView4)
        var i = findViewById<TextView>(R.id.textView)
        var j = findViewById<RadioButton>(R.id.radioButton2)
        var k = findViewById<RadioButton>(R.id.radioButton3)
        var l = findViewById<RadioButton>(R.id.radioButton5)
        var m = findViewById<RadioButton>(R.id.radioButton6)
        b.setOnClickListener {
            var i = a.checkedRadioButtonId
            val Selectpizza = when (i){
                R.id.radioButton5 -> "veg pizza"
                R.id.radioButton6 -> "panner pizza"
                R.id.radioButton2 -> "chicken pizza"
                R.id.radioButton3 -> "Mushroom pizza"
                else -> ""
            }
            val Pizzasize = mutableListOf<String>()
            if (b.isChecked) Pizzasize.add("Small")
            if (c.isChecked) Pizzasize.add("Medium")
            if (d.isChecked) Pizzasize.add("Large")
            
            val Toppings = mutableListOf<String>()
            if (e.isChecked)  Toppings.add("Pepperoni")
            if (f.isChecked) Toppings.add("Extra Cheese")
            val message = "Pizza: $Selectpizza\nSizes: ${Pizzasize.joinToString()}\nToppings: ${Toppings.joinToString()}"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }


    }
}