package com.tdk.daggerdemo

import javax.inject.Inject

/**
 * @Author tangdekun
 * @Date 2018/8/1-13:41
 * @Email tangdekun0924@gmail.com
 */
class Lesson constructor() {

    var name: String? = null

    var score: Int = 0

    @Inject
    constructor(name: String, score: Int) : this() {
        this.name = name
        this.score = score
    }


    override fun toString(): String {
        return "name:$name,score:$score"
    }


}