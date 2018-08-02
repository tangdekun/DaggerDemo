package com.tdk.daggerdemo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tdk.daggerdemo.R.id.daggerdemo_tv
import kotlinx.android.synthetic.main.activity_main.*
import com.hp.baseres.utils.LogUtils
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var student1: Student1


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerMainComponent.builder()
                .build()
                .inject(this)
        student1.name = "唐德坤"
        student1.age = 26
        student1.lesson?.name = "英语"
        student1.lesson?.score = 100
        daggerdemo_tv.text = student1.toString()
        LogUtils.dTag("MainActivity", student1.toString())
    }
}
