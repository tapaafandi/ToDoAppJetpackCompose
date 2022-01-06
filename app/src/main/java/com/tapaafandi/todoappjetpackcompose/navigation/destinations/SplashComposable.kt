package com.tapaafandi.todoappjetpackcompose.navigation.destinations

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideOutVertically
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import com.tapaafandi.todoappjetpackcompose.ui.screens.splash.SplashScreen
import com.tapaafandi.todoappjetpackcompose.util.Constant.SPLASH_SCREEN

@ExperimentalAnimationApi
fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit,
) {
    composable(
        route = SPLASH_SCREEN,
        exitTransition = { _, _ ->
            slideOutVertically(
                targetOffsetY ={ fullHeight -> -fullHeight },
                animationSpec = tween(300)
            )
        }
    ) {
        SplashScreen(navigateToListScreen = navigateToListScreen)
    }
}