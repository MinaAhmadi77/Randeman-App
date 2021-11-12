package com.example.atry

sealed class Screen(val route: String){
    object loginScreen : Screen("login_screen")
    object featuresScreen : Screen("features_screen")
    object resourcesScreen : Screen("resources_screen")
    object accountFormScreen : Screen("accountForm_screen")
    object resourceFormScreen : Screen("resourceForm_screen")

    fun withArgs(vararg args: String): String{

        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }



    }



}
