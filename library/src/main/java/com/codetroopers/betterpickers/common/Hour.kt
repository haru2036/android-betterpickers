package com.codetroopers.betterpickers.common

import android.support.annotation.IntRange

/**
 * Created by haruka on 2016/10/19.
 */
class Hour(@IntRange(from=0,to=23) hourOfDay :Int){
    val hour = if(hourOfDay < 0 || 23 < hourOfDay){
        throw IllegalArgumentException()
    }else{
        hourOfDay
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Hour

        if (hour != other.hour) return false

        return true
    }

    override fun hashCode(): Int {
        return hour
    }

}
