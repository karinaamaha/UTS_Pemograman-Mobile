package com.example.utsmobile

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    val photo:Int,
    val title:String
):Parcelable

