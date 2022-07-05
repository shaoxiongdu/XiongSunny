/*
 * Copyright (c) 2022. DuShaoxiong<email@shaoxiongdu.cn>  allRightsReserved
 */

package shaoxiongdu.cn.xiongsunny.logic.model

import android.location.Location
import com.google.gson.annotations.SerializedName

/**
 * 彩云API结果实体模型
 */
data class PlaceResponse(val states: String, val places: List<Place>) {
}

/**
 * 位置实体模型
 */
data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

/**
 * 坐标实体模型
 */
data class Location(val lng: String, val lat: String)