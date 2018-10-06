package com.colorvallay.faisal.collorvalley.view.fragment

import android.support.v4.app.Fragment
import com.colorvallay.faisal.collorvalley.R

open class BaseFragment:Fragment(){

    fun loadFragment(fragment: Fragment){
        val manager= fragmentManager
        val transaction = manager!!.beginTransaction()
        transaction.replace(R.id.container, fragment)
        val tagFragment:String=fragment.javaClass.simpleName
        transaction.addToBackStack(tagFragment)
        transaction.commit()
    }
}