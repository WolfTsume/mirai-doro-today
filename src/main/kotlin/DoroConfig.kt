package org.wolftsume.overflow.plugin

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.ValueDescription
import net.mamoe.mirai.console.data.value

object DoroConfig : AutoSavePluginConfig("Config") {
    @ValueDescription("用户数据库文件名")
    val database by value("user.sqlite")
}