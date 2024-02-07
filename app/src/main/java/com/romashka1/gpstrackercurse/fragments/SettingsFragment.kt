package com.romashka1.gpstrackercurse.fragments

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.romashka1.gpstrackercurse.R

class SettingsFragment: PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.main_preference, rootKey)

    }
}