package com.tdk.daggerdemo

import android.content.Context
import android.content.SharedPreferences
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * @Author tangdekun
 * @Date 2018/7/30-14:51
 * @Email tangdekun0924@gmail.com
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun sharedPreferences(): SharedPreferences

    fun myApplication(): Context

    fun inject(application: MyApplication)
//
//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        fun application(application: MyApplication): Builder
//
//        fun
//        fun build(): AppComponent
//    }

}