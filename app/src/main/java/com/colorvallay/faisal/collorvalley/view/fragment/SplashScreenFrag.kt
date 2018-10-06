package com.colorvallay.faisal.collorvalley.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.colorvallay.faisal.collorvalley.R

class SplashScreenFrag:BaseFragment(){

    val TAG="SplashScreenFrag"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // inflater will not be null
        return inflater.inflate(R.layout.frag_splash_screen,container,false)

    }

    override fun onDetach() {
        super.onDetach()
    }

    override fun onResume() {
        super.onResume()

        val background=object :Thread(){
            override fun run() {
                try {
                    Thread.sleep(5*1000)
                    loadFragment(DashBordFrag())
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        }

        background.start()
    }


}