package com.edandaniel.mylibrary.toast

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import com.edandaniel.mylibrary.R

class CustomToast(val context: Context, val inflater: LayoutInflater) {

    fun showToast(text: String, type:String) {
        var customToastroot = inflater.inflate(R.layout.custom_toast, null)
        val customtoast = Toast(context)

        when(type){
            "success" -> {customToastroot = inflater.inflate(R.layout.success_toast, null)}
            "info" -> {customToastroot = inflater.inflate(R.layout.info_toast, null)}
            "error" -> {customToastroot = inflater.inflate(R.layout.error_toast, null)}
             else  -> {customToastroot = inflater.inflate(R.layout.custom_toast, null)}
        }

        val textView = customToastroot.findViewById<TextView>(R.id.textView1)
        textView.text = text

        customtoast.view = customToastroot
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
        customtoast.duration = Toast.LENGTH_LONG

        customtoast.show()
    }

}