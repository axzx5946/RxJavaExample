package com.rx.java.rxjavaexample.base

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup

/**
 * Created by xuzaixiang on 2017/12/8.
 */
abstract class BaseActivity:AppCompatActivity(){
    override fun setContentView(layoutResID: Int) {
        super.setContentView(layoutResID)
        init()
    }

    override fun setContentView(view: View?) {
        super.setContentView(view)
        init()
    }

    override fun setContentView(view: View?, params: ViewGroup.LayoutParams?) {
        super.setContentView(view, params)
        init()
    }
    private fun init() {
        viewOnClick()
    }
    abstract fun viewOnClick()
}