package com.samaa.playwith.feature.splash

import android.os.CountDownTimer
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SplashViewModel : ViewModel() {

    /**
     * 倒计时器
     */
    private var timer: CountDownTimer? = null

    /**
     * 倒计时秒数
     */
    private val _timeLeft = MutableStateFlow(0L)
    val timeLeft: StateFlow<Long> = _timeLeft

    /**
     * 路由
     */
    private val _navigateToGuide = MutableStateFlow(false)
    val navigateToGuide: StateFlow<Boolean> = _navigateToGuide

    private val _navigateToMain = MutableStateFlow(false)
    val navigateToMain: StateFlow<Boolean> = _navigateToMain

    init {
        startCountdown()
    }

    private fun startCountdown() {

        timer = object : CountDownTimer(6000, 1000) {
            /**
             * 每次倒计时执行
             */
            override fun onTick(millisUntilFinised: Long) {
                // 毫秒转秒
                _timeLeft.value = millisUntilFinised / 1000;

            }

            /**
             * 倒计时结束
             */
            override fun onFinish() {
//                _navigateToGuide.value = true
                _navigateToMain.value = true
            }

        }.start()
    }

    /**
     * 执行下一步操作
     *
     * 现阶段是跳转至首页
     */
    fun next() {
        timer?.cancel()
//        _navigateToGuide.value = true
        _navigateToMain.value = true
    }

    /**
     * ViewModel销毁时
     */
    override fun onCleared() {
        timer?.cancel()
    }
}