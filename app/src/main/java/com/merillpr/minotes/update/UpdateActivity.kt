package com.merillpr.minotes.update

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import com.merillpr.minotes.R
import com.merillpr.minotes.custom.SetupTopAppBar
import com.merillpr.minotes.home.HomeActivity

class UpdateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = { SetupTopAppBar(idImage = R.drawable.minotes_save_icon, descImage = "My Save", "Update", HomeActivity::class.java) }
            ) {

            }
        }
    }
}
