package com.tdk.daggerdemo

/**
 * @Author tangdekun
 * @Date 2018/7/30-10:43
 * @Email tangdekun0924@gmail.com
 */
class Student private constructor(val name: String, val age: Int) {

    lateinit var lesson: LessonInterface
    override fun toString(): String {
        return "name:$name,age:$age,接口名:${lesson.getClassName()}"
    }

    constructor(name: String, age: Int, lesson: LessonInterface) : this(name, age) {
        this.lesson = lesson
    }

}