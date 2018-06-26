package com.valpromise.vpp.bean

import com.google.gson.annotations.SerializedName

data class PaymentHistoryBean(
    @SerializedName("rows") val rows: List<PaymentHistoryRow>
)