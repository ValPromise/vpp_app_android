package com.valpromise.vpp.bean

import com.google.gson.annotations.SerializedName

data class AccountListBean(
    @SerializedName("rows") val rows: List<AccountRow>
)