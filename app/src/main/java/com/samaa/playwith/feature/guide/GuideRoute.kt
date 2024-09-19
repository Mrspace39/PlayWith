package com.samaa.playwith.feature.guide

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun GuideRoute() {
    GuideGreen()
}

@Composable
fun GuideGreen() {

    GuideContent()

}

@Composable
fun GuideContent() {
    Text(text = "首页首页首页首页首页首页首页首页首页首页首页首页")
}
