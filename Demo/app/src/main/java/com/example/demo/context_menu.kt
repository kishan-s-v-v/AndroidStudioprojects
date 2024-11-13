package com.example.demo

import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class context_menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.context_menu)
        var j1 = findViewById<ImageView>(R.id.myImageView)
        registerForContextMenu(j1)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val j2:MenuInflater = menuInflater
        j2.inflate(R.menu.contextmenu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var j3 = findViewById<ImageView>(R.id.myImageView)
        return when(item.itemId){
            R.id.changecolor -> {
                j3.setColorFilter(Color.RED)
                Toast.makeText(this, "color changed", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.rotate -> {
                j3.rotation = 45f
                Toast.makeText(this, "image rotated", Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onContextItemSelected(item)
        }

    }
}