package com.tdk.daggerdemo

import dagger.Module
import dagger.Provides

/**
 * @Author tangdekun
 * @Date 2018/7/30-10:45
 * @Email tangdekun0924@gmail.com
 */
@Module
class MainModule(val mainActivity: MainActivity) {

    //    @Named("tangdekun")
    @Provides
    fun provideStudent(lessonInterface: LessonInterface): Student {
        return Student("tangdekun", 26, lessonInterface)
    }


    @Provides
    fun provideLesson(lesson: Lesson): LessonInterface {
        return lesson
    }

    @Provides
    fun provideLessonHelper(): LessonHelper {
        return object : LessonHelper {

            override fun getInterfaceName(): String {
                return "LessonHelper"

            }


        }
    }
//    @Named("tdk")
//    @Provides
//    fun providerStudent():Student{
//        return Student("tdk",26)
//    }

}