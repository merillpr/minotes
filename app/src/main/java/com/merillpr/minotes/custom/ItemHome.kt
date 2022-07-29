package com.merillpr.minotes.custom

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.merillpr.minotes.robotoFont
import com.merillpr.minotes.ui.theme.Black
import com.merillpr.minotes.ui.theme.GreyLine
import com.merillpr.minotes.ui.theme.MostYellow

@Composable
fun LineHome() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Divider(
            color = GreyLine,
            thickness = 1.dp,
            modifier = Modifier.fillMaxWidth(0.9f)
        )
    }
}

@Composable
fun TextHome(
    time: String,
    activity: String
) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(15.dp, 10.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = time,
            color = MostYellow,
            fontFamily = robotoFont,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp
        )
        Spacer(modifier = Modifier.padding(10.dp))
        Text(
            text = activity,
            color = Black,
            fontFamily = robotoFont,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            maxLines = 1
        )
    }
}