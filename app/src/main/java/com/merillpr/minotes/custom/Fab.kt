package com.merillpr.minotes.custom

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.merillpr.minotes.R
import com.merillpr.minotes.ui.theme.MostYellow

@Composable
fun SetupFab(
    componentActivity: Class<*>
) {
    val context = LocalContext.current
    FloatingActionButton(
        onClick = {
            val move = Intent(context, componentActivity)
            context.startActivity(move)
        },
        modifier = Modifier.size(60.dp),
        backgroundColor = MostYellow
    ){
        Image(
            painterResource(id = R.drawable.minotes_add),
            contentDescription = "My Add",
            modifier = Modifier.size(30.dp)
        )
    }
}
