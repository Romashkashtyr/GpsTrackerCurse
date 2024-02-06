package com.romashka1.gpstrackercurse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.romashka1.gpstrackercurse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onButtonNavClicks()
    }

    private fun onButtonNavClicks(){
        binding.bNav.setOnItemSelectedListener{
            when(it.itemId){
                R.id.id_home -> Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                R.id.id_tracks -> Toast.makeText(this, "Track", Toast.LENGTH_SHORT).show()
                R.id.id_settings -> Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show()

            }
            true
        }
    }
}