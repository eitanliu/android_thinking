package com.example.thinking.util

import org.json.JSONObject

object TextUtil {

    fun formatJson(json: String?, indent: Int = 2): String {
        if (null == json || "" == json) return ""
        return JSONObject(json).toString(indent)
    }
}