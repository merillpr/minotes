package com.merillpr.minotes.custom

import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.merillpr.minotes.R
import com.merillpr.minotes.robotoFont
import com.merillpr.minotes.ui.theme.Black
import com.merillpr.minotes.ui.theme.White

@Composable
fun SetupTopAppBar(
    idImage: Int,
    descImage: String,
    title: String,
    componentActivity: Class<*>
){
    val context = LocalContext.current
    TopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painterResource(id = R.drawable.minotes_logo),
                    contentDescription = "My Logo",
                    modifier = Modifier.size(40.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = title,
                    fontFamily = robotoFont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Black
                )
            }
        },
        backgroundColor = White,
        actions = {
            IconButton(onClick = {
                val move = Intent(context, componentActivity)
                context.startActivity(move)
            }) {
                Image(
                    painterResource(id = idImage),
                    contentDescription = descImage,
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    )
}