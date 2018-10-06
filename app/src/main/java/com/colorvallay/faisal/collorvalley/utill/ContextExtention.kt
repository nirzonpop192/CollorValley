package com.colorvallay.faisal.collorvalley.utill

import android.content.Context
import android.widget.Toast


class ContextExtention{
   public fun Context.toast( message :CharSequence)=
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

}

