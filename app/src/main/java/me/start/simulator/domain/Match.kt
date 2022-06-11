package me.start.simulator.domain

import com.google.gson.annotations.SerializedName

data class Match (
    @SerializedName("descricao")
    val descripton: String,
    @SerializedName("mapa")
    val place: Place,
    @SerializedName("primario")
    val TeamOne: Team,
    @SerializedName("secundario")
    val TeamTwo: Team
    )