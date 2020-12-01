package com.example.tracker.view

import androidx.annotation.StringRes
import com.example.tracker.data.SavedWalk
import com.example.tracker.data.model.ModelWalksScreenState

interface TrackerView {

  //fun updateAdapter(listWalks: List<SavedWalk>)
    fun updateProgress(idResString: Int, countProgress: Int)
    fun setEditText(location: String?, distance: Int?)
//  fun updateProgressBar(values: Int)
    fun setErrorDistance(@StringRes errorTextResId: Int)
    fun setErrorLocation(@StringRes errorTextResId: Int)
    fun setFirstLaunchMessage(switcher: Boolean)

    fun renderView(model :ModelWalksScreenState)

    fun closeKeyboards()
    fun clearEditTexts()

    fun makeToast(@StringRes textForToastResId: Int)
}