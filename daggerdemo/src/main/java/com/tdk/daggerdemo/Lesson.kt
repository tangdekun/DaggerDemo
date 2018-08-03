package com.tdk.daggerdemo

import javax.inject.Inject

/**
 * @Author tangdekun
 * @Date 2018/8/1-13:41
 * @Email tangdekun0924@gmail.com
 */
class Lesson constructor() : LessonInterface {

    var name: String? = null
    lateinit var lessonHelper: LessonHelper

    var score: Int = 0

    //    @Inject
    constructor(name: String, score: Int) : this() {
        this.name = name
        this.score = score
    }

    @Inject
    constructor(lessonHelper: LessonHelper) : this() {
        this.lessonHelper = lessonHelper
    }

    override fun toString(): String {
        return "name:$name,score:$score"
    }


    override fun getClassName(): String {
        return lessonHelper.getInterfaceName()
    }
}