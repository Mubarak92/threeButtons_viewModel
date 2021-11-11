package com.example.threebuttons

import androidx.lifecycle.ViewModel

class myViewModel : ViewModel() {


    private var _score = 0
    val score
        get() = _score

    fun add1() {
        _score += 1
    }
    fun sub2() {
        if (_score <= 1) {
        } else {
            _score -= 2
        }
    }
    fun add4() {
        _score += 4
    }
}