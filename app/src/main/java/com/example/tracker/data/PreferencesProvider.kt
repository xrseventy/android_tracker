package com.example.tracker.data

import android.content.Context

class PreferencesProvider(context: Context) {

    private val sharedPreferences =
        context.getSharedPreferences(KEY_STR_NAME_FOLDER, Context.MODE_PRIVATE)

    fun putString(key: String, value: String) =
        sharedPreferences.edit().putString(key, value).apply()

    fun getString(key: String): String? =
        sharedPreferences.getString(key, null)

    fun putInt(key: String, value: Int) =
        sharedPreferences.edit().putInt(key, value).apply()

    fun getDouble(key: String): Int =
        sharedPreferences.getInt(key, 0)

    fun isKey(key: String): Boolean {
        return sharedPreferences.contains(key)
    }

    companion object {
        const val KEY_STR_SAVED_WALK = "SavedWalk"
        const val KEY_STR_NAME_FOLDER = "sharedPrefFile"
        const val KEY_STR_LOCATION = "Location"
        const val KEY_INT_DISTANCE = "Distance"
    }
}
