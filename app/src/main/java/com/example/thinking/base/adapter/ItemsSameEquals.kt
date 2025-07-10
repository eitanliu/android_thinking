package com.example.thinking.base.adapter

interface ItemsSameEquals {

    fun equalsItemSame(other: Any?): Boolean = this == other

    fun equalsContentSame(other: Any?): Boolean
}