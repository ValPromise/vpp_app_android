package com.valpromise.vpp.bean

import com.google.gson.annotations.SerializedName

data class CoinProductBean(
        @SerializedName("help") val help: String,
        @SerializedName("product") val product: List<CoinGuessBean>
)