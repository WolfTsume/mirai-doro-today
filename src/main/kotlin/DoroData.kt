package org.wolftsume.overflow.plugin

import kotlinx.serialization.Serializable
import net.mamoe.mirai.console.data.AutoSavePluginData
import net.mamoe.mirai.console.data.value

object DoroData : AutoSavePluginData("DoroData"){
    @Serializable
    data class Doro(
        val name: String,
        val imageName: String
    )

    val doro by value(arrayOf(Doro("结局名称", "图片名称")))
}