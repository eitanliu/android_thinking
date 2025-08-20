@file:Suppress("ClassName", "ConstPropertyName")

package com.example.thinking.util

import android.os.Build

object Os {

    /**
     * [android.R](https://developer.android.com/reference/android/R)
     */
    val R = OsR

    /**
     * [android.os.Build.VERSION_CODES](https://developer.android.com/reference/android/os/Build.VERSION_CODES)
     */
    object Versions {
        const val v2_3 = Build.VERSION_CODES.GINGERBREAD // 9
        const val v2_3_3 = Build.VERSION_CODES.GINGERBREAD_MR1 // 10
        const val v3 = Build.VERSION_CODES.HONEYCOMB // 11
        const val v3_1 = Build.VERSION_CODES.HONEYCOMB_MR1 // 12
        const val v3_2 = Build.VERSION_CODES.HONEYCOMB_MR2 // 13
        const val v4 = Build.VERSION_CODES.ICE_CREAM_SANDWICH // 14
        const val v4_03 = Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 // 15
        const val v4_1 = Build.VERSION_CODES.JELLY_BEAN // 16
        const val v4_2 = Build.VERSION_CODES.JELLY_BEAN_MR1 // 17
        const val v4_3 = Build.VERSION_CODES.JELLY_BEAN_MR2 // 18
        const val v4_4 = Build.VERSION_CODES.KITKAT // 19
        const val v5_4_w = Build.VERSION_CODES.KITKAT_WATCH // 20
        const val v5 = Build.VERSION_CODES.LOLLIPOP // 21
        const val v5_1 = Build.VERSION_CODES.LOLLIPOP_MR1 // 22
        const val v6 = Build.VERSION_CODES.M // 23
        const val v7 = Build.VERSION_CODES.N // 24
        const val v7_1 = Build.VERSION_CODES.N_MR1 // 25
        const val v8 = Build.VERSION_CODES.O // 26
        const val v8_1 = Build.VERSION_CODES.O_MR1 // 27
        const val v9 = Build.VERSION_CODES.P // 28
        const val v10 = Build.VERSION_CODES.Q // 29
        const val v11 = Build.VERSION_CODES.R // 30
        const val v12 = Build.VERSION_CODES.S // 31
        const val v12_1 = Build.VERSION_CODES.S_V2 // 32
        const val v13 = Build.VERSION_CODES.TIRAMISU // 33
        const val v14 = Build.VERSION_CODES.UPSIDE_DOWN_CAKE // 34
        const val v15 = Build.VERSION_CODES.VANILLA_ICE_CREAM // 35
    }
}
