package com.valpromise.vpp.bean

import com.valpromise.vpp.view.sortlistview.SortModel
import com.google.gson.annotations.SerializedName

data class CityBean(
    @SerializedName("citys") val citys: List<SortModel>,
    @SerializedName("hot") val hot: List<Hot>
) {
    data class Hot(
        @SerializedName("cityId") val cityId: String,
        @SerializedName("cnName") val cnName: String,
        @SerializedName("initial") val initial: String
    )
}