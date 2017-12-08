package com.rx.java.rxjavaexample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.rx.java.rxjavaexample.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun viewOnClick() {
        button_1.setOnClickListener{
            startActivity(Intent(this,CreateActivity::class.java))
        }
    }
}
