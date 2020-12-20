package com.example.tracker.data.model

import com.example.tracker.data.PreferencesProvider
import com.example.tracker.data.SavedWalk

class Model(private val preferencesProvider: PreferencesProvider) {
    private val listWalks: MutableList<SavedWalk> = mutableListOf()

    fun addWalk(walk: SavedWalk) {
        listWalks.add(walk)
    }

    fun getListWalk(): List<SavedWalk> {
        return listWalks //whenever
    }

    fun saveSharedPref(savedListWalks: String) {
        preferencesProvider.putString(PreferencesProvider.KEY_STR_SAVED_WALK, savedListWalks)
    }//verify что вызвался putString

    fun getListWalks(): String? {
        return (preferencesProvider.getString(PreferencesProvider.KEY_STR_SAVED_WALK))
    }

    fun checkKeySavedWalksList(): Boolean {
        return preferencesProvider.hasKey(PreferencesProvider.KEY_STR_SAVED_WALK)
    }

}