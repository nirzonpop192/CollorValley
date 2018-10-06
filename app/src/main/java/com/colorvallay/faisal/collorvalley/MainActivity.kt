package com.colorvallay.faisal.collorvalley

import android.os.Bundle
import android.support.v4.app.Fragment
import com.colorvallay.faisal.collorvalley.view.activity.BaseActivity
import com.colorvallay.faisal.collorvalley.view.fragment.SplashScreenFrag


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(SplashScreenFrag())

    }

    private fun loadFragment(fragment: Fragment) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
//        val fragment = SplashScreenFrag()
        transaction.replace(R.id.container, fragment)
        val tagFragment:String=fragment.javaClass.simpleName
        transaction.addToBackStack(tagFragment)
        transaction.commit()
    }
}
