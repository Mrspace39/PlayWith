package com.samaa.playwith.feature.main.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.ui.res.stringResource
import com.samaa.playwith.R
import com.samaa.playwith.feature.apply.navigation.APPLY
import com.samaa.playwith.feature.guide.navigation.GUIDE
import com.samaa.playwith.feature.me.navigation.ME
import com.samaa.playwith.feature.message.navigation.MESSAGE

/**
 * 底部导航栏枚举
 */
enum class BottomLevelNavigation(
    // 图标
    val selectIcon: Int,
    // 未选中时图标
    val unselectedIcon: Int,
    // 标题
    val titleTextId: Int,
    //
    val route: String,
) {
    // 首页
    GUIDE_BOTTOM(
        selectIcon = R.drawable.selected_home,
        unselectedIcon =R.drawable.home,
        titleTextId = R.string.home,
        route = GUIDE,
    ),
    // 成为大神
//    APPLY_BOTTOM(
//        selectIcon = 0,
//        unselectedIcon = 0,
//        titleTextId = R.string.apply,
//        route = APPLY,
//    ),
    // 消息
    MESSAGE_BOTTOM(
        selectIcon = R.drawable.selected_message,
        unselectedIcon = R.drawable.message,
        titleTextId = R.string.chat,
        route = MESSAGE,
    ),
    // 我的
    ME_BOTTOM(
        selectIcon = R.drawable.me,
        unselectedIcon = R.drawable.me,
        titleTextId = R.string.me,
        route = ME,
    )

}