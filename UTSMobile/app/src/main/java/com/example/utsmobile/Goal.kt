package com.example.utsmobile

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Goal (
    val name: String
):Parcelable
