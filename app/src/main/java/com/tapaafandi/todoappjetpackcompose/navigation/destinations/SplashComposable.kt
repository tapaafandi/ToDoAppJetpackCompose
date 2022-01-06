package com.tapaafandi.todoappjetpackcompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.tapaafandi.todoappjetpackcompose.ui.screens.splash.SplashScreen
import com.tapaafandi.todoappjetpackcompose.util.Constant.SPLASH_SCREEN

fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit,
) {
    composable(
        route = SPLASH_SCREEN,
    ) {
        SplashScreen(navigateToListScreen = navigateToListScreen)
    }
}