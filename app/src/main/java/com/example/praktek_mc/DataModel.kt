package com.example.praktek_mc

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class DataModel(
val iconsImage:Int,
val TitleImage: String,
val descImage: String
): Parcelable
