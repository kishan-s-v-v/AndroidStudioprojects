package com.example.applayout

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class today : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_today)
        val destinationSpinner: Spinner = findViewById(R.id.spinner)
        val packageListView: ListView = findViewById(R.id.list1)
        val destinations = arrayOf("Paris", "New York", "Tokyo")
        val packageForParis = arrayOf("Eiffel Tower", "Louver Museum", "Seine River")
        val packageForNewYork = arrayOf("Statue of Liberty", "Central Park", "times Square")
        val packageForTokyo = arrayOf("Tokyo Tower", "Mount Fuji", "Senso-ji Temple")

        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item,destinations)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        destinationSpinner.adapter=spinnerAdapter

        val initialAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,packageForParis)
        packageListView.adapter= initialAdapter

        destinationSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long){
                val selectedPackage = when (position){
                    0 -> packageForParis
                    1 -> packageForNewYork
                    else -> packageForTokyo
                }

                val listAdapter = ArrayAdapter(this@today, android.R.layout.simple_list_item_1,selectedPackage)
                packageListView.adapter = listAdapter
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }
    }
}