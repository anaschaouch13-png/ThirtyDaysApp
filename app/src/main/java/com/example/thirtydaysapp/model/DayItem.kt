package com.example.thirtydaysapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DayItem(
    val day: Int,
    @param:StringRes val titleRes: Int,
    @param:StringRes val descriptionRes: Int,
    @param:DrawableRes val imageRes: Int,
)
