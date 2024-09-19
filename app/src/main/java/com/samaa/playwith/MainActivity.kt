package com.samaa.playwith

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.samaa.playwith.ui.GlobalPage
import com.samaa.playwith.ui.theme.PlayWithTheme

//@RequiresApi(Build.VERSION_CODES.HONEYCOMB_MR2)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 显示状态栏
        enableEdgeToEdge()

        setContent {
            PlayWithTheme {
                GlobalPage()
//                SplashRoute()
            }
        }
    }
}
