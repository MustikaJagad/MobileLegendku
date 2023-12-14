package com.dicoding.mobilelegend

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Hero(
    val imgHero: Int,
    val nameHero: String,
    val desHero: String
):Parcelable
