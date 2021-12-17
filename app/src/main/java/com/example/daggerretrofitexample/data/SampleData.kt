package com.example.daggerretrofitexample.data

import com.example.daggerretrofitexample.Api.ApiService

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/16/21.
 */

data class SampleData(
    private var userId: Int?,
    private val id: Int?,
    val title: String?,
    val completed : Boolean?
){
    fun getStatus(): String{
        return completed.toString()
    }
}
