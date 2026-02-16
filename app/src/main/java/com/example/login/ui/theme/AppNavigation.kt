package com.example.login.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login.Screen.Authscreen
import com.example.login.Screen.Loginscreen
import com.example.login.Screen.SignUpscreen

@Composable
fun AppNavigation(modifier: Modifier = Modifier){

    val navController = rememberNavController()

    NavHost(navController = navController ,startDestination = "auth"){

        composable ("auth"){
            Authscreen(modifier, navController)
        }

        composable ("Login"){
            Loginscreen(modifier)
        }

        composable ("SignUP"){
            SignUpscreen(modifier)
        }


    }
    }


