package com.romashka1.gpstrackercurse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.romashka1.gpstrackercurse.databinding.ActivityMainBinding
import com.romashka1.gpstrackercurse.fragments.MainFragment
import com.romashka1.gpstrackercurse.fragments.SettingsFragment
import com.romashka1.gpstrackercurse.fragments.TracksFragment
import com.romashka1.gpstrackercurse.utils.openFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onButtonNavClicks()
        openFragment(MainFragment.newInstance())
    }

    private fun onButtonNavClicks(){
        binding.bNav.setOnItemSelectedListener{
            when(it.itemId){
                R.id.id_home -> openFragment(MainFragment.newInstance())
                R.id.id_tracks -> openFragment(TracksFragment.newInstance())
                R.id.id_settings -> openFragment(SettingsFragment())

            }
            true
        }
    }
}