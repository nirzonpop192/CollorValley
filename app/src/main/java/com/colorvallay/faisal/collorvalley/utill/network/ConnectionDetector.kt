package com.colorvallay.faisal.collorvalley.utill.network

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

/**
 * @author Faisal Mohammad
 * Single toon class
 */
object  ConnectionDetector{

    public fun isNetworkAvalible(context: Context):Boolean{

        val connectivityManager=context.getSystemService(Context.CONNECTIVITY_SERVICE)

        return if (connectivityManager is ConnectivityManager){
            val networkInfo:NetworkInfo?=connectivityManager.activeNetworkInfo
            networkInfo?.isConnected?:false
        }else false
    }
}