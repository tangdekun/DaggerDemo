package com.tdk.daggerdemo

import dagger.Module
import dagger.Provides

/**
 * @Author tangdekun
 * @Date 2018/7/30-10:45
 * @Email tangdekun0924@gmail.com
 */
@Module()
class MainModule {

    @Provides
    fun provideStudent(lesson: Lesson): Student {
        return Student("tangdekun", 26, lesson)
    }


//    @Provides
//    fun provideLesson(): Lesson {
//        return Lesson("数学", 96)
//    }

    @Provides
    fun provideLesson2(name: String, score: Int): Lesson {
        return Lesson(name, score)
    }

    @Provides
    fun provideName(): String {
        return "语文"
    }

    @Provides
    fun provideScore(): Int {
        return 90
    }

}