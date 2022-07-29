package com.merillpr.minotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.merillpr.minotes.custom.SetupFab
import com.merillpr.minotes.custom.SetupTopAppBar
import com.merillpr.minotes.ui.theme.MinotesTheme

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = { SetupTopAppBar(R.drawable.minotes_filter_icon, "My Filter", "List", ListActivity::class.java) },
                floatingActionButton = { SetupFab(AddActivity::class.java) },
                floatingActionButtonPosition = FabPosition.End,
            ) {

            }
        }
    }
}

