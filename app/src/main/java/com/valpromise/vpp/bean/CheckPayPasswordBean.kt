package com.valpromise.vpp.bean

import com.google.gson.annotations.SerializedName

data class CheckPayPasswordBean(
    @SerializedName("success") val success: Int
)