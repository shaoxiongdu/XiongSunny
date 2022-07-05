/*
 * Copyright (c) 2022. DuShaoxiong<email@shaoxiongdu.cn>  allRightsReserved
 */

package shaoxiongdu.cn.xiongsunny

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * 全局获取Context
 */
class XiongSunnyApplication: Application() {

    companion object{

        /**
         * 彩云天气API的请求令牌
         */
        const val CAI_YUN_API_TOKEN = "wUmke0IjHzdP9Jce"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}