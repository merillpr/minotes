package com.merillpr.minotes.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.merillpr.minotes.R
import com.merillpr.minotes.add.AddActivity
import com.merillpr.minotes.custom.LineHome
import com.merillpr.minotes.custom.SetupFab
import com.merillpr.minotes.custom.SetupTopAppBar
import com.merillpr.minotes.custom.TextHome
import com.merillpr.minotes.list.ListActivity
import com.merillpr.minotes.robotoFont
import com.merillpr.minotes.ui.theme.Black


class HomeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScaffold()
        }
    }

    @Composable
    fun HomeScaffold() {
        Scaffold(
            topBar = {SetupTopAppBar(R.drawable.minotes_list_icon, "My List", "Home", ListActivity::class.java)},
            floatingActionButton = {SetupFab(AddActivity::class.java)},
            floatingActionButtonPosition = FabPosition.End,
        ) {
            Column() {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth().height(80.dp)
                ) {
                    Text(
                        text = "THRUSDAY, 28 JULY 2022",
                        color = Black,
                        fontFamily = robotoFont,
                        fontWeight = FontWeight.Bold,
                        fontSize = 28.sp
                    )
                }

                Column {
                    //to be change later
                    for(i in 1..4) {
                        LineHome()
                        TextHome(time = "00:0$i", activity = "aktivitas ke-$i" )
                    }
                    LineHome()
                }
            }
        }
    }
}




