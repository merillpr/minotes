package com.merillpr.minotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.merillpr.minotes.custom.SetupTopAppBar
import com.merillpr.minotes.ui.theme.MinotesTheme

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
