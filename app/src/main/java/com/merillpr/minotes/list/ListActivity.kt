package com.merillpr.minotes.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.merillpr.minotes.R
import com.merillpr.minotes.add.AddActivity
import com.merillpr.minotes.custom.*

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListScaffold()
        }
    }
}

@Composable
fun ListScaffold() {
    Scaffold(
        topBar = { SetupTopAppBar(R.drawable.minotes_filter_icon, "My Filter", "List", ListActivity::class.java) },
        floatingActionButton = { SetupFab(AddActivity::class.java) },
        floatingActionButtonPosition = FabPosition.End,
    ) {
        Column (modifier = Modifier.fillMaxWidth().padding(15 .dp)){
            for(i in 1..50) {
                CardList()
                Spacer(Modifier.size(10.dp))
            }
        }
    }
}

