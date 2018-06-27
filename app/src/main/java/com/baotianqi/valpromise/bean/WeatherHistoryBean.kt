package com.baotianqi.valpromise.bean

import com.google.gson.annotations.SerializedName

data class WeatherHistoryBean(
        @SerializedName("value") val value: Double,
        @SerializedName("type") val time: String
)