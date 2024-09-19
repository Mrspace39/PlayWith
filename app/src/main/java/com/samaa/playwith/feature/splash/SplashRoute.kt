package com.samaa.playwith.feature.splash

import android.os.CountDownTimer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.samaa.playwith.R
import java.time.LocalDate

/**
 * 启动页面
 */
@Composable
fun SplashRoute(toGuide: () -> Unit, toMain: () -> Unit) {

    val viewModel: SplashViewModel = viewModel()
    val timeLeft by viewModel.timeLeft.collectAsState()
    val navigateToGuide by viewModel.navigateToGuide.collectAsState()
    val navigateToMain by viewModel.navigateToMain.collectAsState()

    SplashScreen(
        timeLeft = timeLeft,
        navigateToGuide = navigateToGuide,
        navigateToMain = navigateToMain,
        toGuide = toGuide,
        toMain = toMain,
        next = viewModel::next
    )
}

@Composable
fun SplashScreen(
    timeLeft: Long = 0,
    navigateToGuide: Boolean = false,
    navigateToMain: Boolean = false,
    next: () -> Unit = { },
    toGuide: () -> Unit = {},
    toMain: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.mipmap.poster5),
            contentDescription = "封面",
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxSize(),  // 图片居中, 并充满全屏
            contentScale = ContentScale.Crop  // 裁剪图片使其填充整个屏幕
        )

        // 版权文件
        Text(
            text = stringResource(id = R.string.copyright, LocalDate.now().year),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 20.dp),
            color = Color.White
        )

        Button(
            onClick = next,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(50.dp),
//            colors = ButtonColors(containerColor = Color.Gray, disabledContainerColor = Color.Gray)
//            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray)
        ) {
            Text(text = "跳过$timeLeft")
        }
    }

//    if (navigateToGuide) {
    if (navigateToMain) {
        LaunchedEffect(key1 = true) {
            println("跳转页面")
//            toGuide()
            toMain()
        }
    }
}