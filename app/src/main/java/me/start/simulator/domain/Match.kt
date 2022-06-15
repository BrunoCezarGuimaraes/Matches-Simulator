package me.start.simulator.domain

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Match (
    @SerializedName("descricao")
    val descripton: String,
    @SerializedName("mapa")
    val place: Place,
    @SerializedName("primario")
    val TeamOne: Team,
    @SerializedName("secundario")
    val TeamTwo: Team
    ) : Parcelable