package com.merillpr.minotes.custom

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.merillpr.minotes.R
import com.merillpr.minotes.robotoFont
import com.merillpr.minotes.ui.theme.BackgroundYellow
import com.merillpr.minotes.ui.theme.Black
import com.merillpr.minotes.ui.theme.MostYellow

@Composable
fun CardList() {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        border = BorderStroke(2.dp, MostYellow),
        backgroundColor = BackgroundYellow
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column() {
                Text(
                    text = "00:00",
                    color = Black,
                    fontFamily = robotoFont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
                Spacer(modifier = Modifier.size(2.dp))
                Text(
                    text = "00:10",
                    color = Black,
                    fontFamily = robotoFont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
            }
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = "s/d",
                color = Black,
                fontFamily = robotoFont,
                fontWeight = FontWeight.Light,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.size(20.dp))
            Column() {
                Text(
                    text = "Activity",
                    color = Black,
                    fontFamily = robotoFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.size(5.dp))
                Text(
                    text = "Start, Tue 28 Jul, 2022",
                    color = Black,
                    fontFamily = robotoFont,
                    fontWeight = FontWeight.Light,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.size(5.dp))
                Text(
                    text = "Never Repeat",
                    color = Black,
                    fontFamily = robotoFont,
                    fontWeight = FontWeight.ExtraLight,
                    fontSize = 14.sp
                )
            }
            Spacer(Modifier.size(10.dp))
            IconButton(onClick = {}){
                Image(
                    painterResource(id = R.drawable.minotes_delete),
                    contentDescription = "My Delete",
                    modifier = Modifier.size(30.dp)
                )
            }
            Spacer(Modifier.size(5.dp))
            IconButton(onClick = {}){
                Image(
                    painterResource(id = R.drawable.minotes_update),
                    contentDescription = "My Update",
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    }
}