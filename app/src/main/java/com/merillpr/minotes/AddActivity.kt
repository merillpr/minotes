package com.merillpr.minotes

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TimePicker
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import com.merillpr.minotes.custom.SetupTopAppBar
import com.merillpr.minotes.ui.theme.GreyLine
import com.merillpr.minotes.ui.theme.MostYellow
import com.merillpr.minotes.ui.theme.White
import java.util.*

class AddActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AddScaffold()
        }
    }

    @Composable
    fun AddScaffold() {
        Scaffold(
            topBar = { SetupTopAppBar(idImage = R.drawable.minotes_save_icon, descImage = "My Save", "Add", AddActivity::class.java) }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            ) {
                TextFieldAdd()
                Spacer(modifier = Modifier.size(20.dp))
                TimerAdd()
                Spacer(modifier = Modifier.size(10.dp))
                DateAdd()
                Spacer(modifier = Modifier.size(20.dp))
                DropdownAdd()
            }
        }
    }

    @Composable
    fun TextFieldAdd(
    ) {
        var text by remember {mutableStateOf(TextFieldValue(""))}
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = text,
            placeholder = { Text(
                text = "Input your activity",
                color = Color.Black,
                fontFamily = robotoFont,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
            )},
            label = {Text("Activity")},
            onValueChange = {text = it},
            maxLines = 1,
            textStyle = TextStyle(
                color = Color.Black,
                fontFamily = robotoFont,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
            ),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                focusedIndicatorColor =  MostYellow,
                unfocusedIndicatorColor = MostYellow,
                trailingIconColor = MostYellow,
                focusedLabelColor = MostYellow,
                cursorColor = MostYellow
            )
        )
    }

    @Composable
    fun TimerAdd() {
        val context = LocalContext.current

        val calendar = Calendar.getInstance()
        val hour1: Int = calendar.get(Calendar.HOUR)
        val minute1: Int = calendar.get(Calendar.MINUTE)
        var time1 by remember { mutableStateOf("Time")}
        val timePickerDialog1 = TimePickerDialog(
            context,
            {_: TimePicker, hour: Int, minute: Int ->
                var cusHour = hour.toString()
                var cusMinute = minute.toString()
                if(hour.toString().count() == 1) {
                    cusHour = "0" + cusHour
                }
                if(minute.toString().count() == 1) {
                    cusMinute = "0" + cusMinute
                }
                time1 = cusHour + ":" + cusMinute
            }, hour1, minute1, true
        )

        val hour2: Int = calendar.get(Calendar.HOUR)
        val minute2: Int = calendar.get(Calendar.MINUTE)
        var time2 by remember { mutableStateOf("Time")}
        val timePickerDialog2 = TimePickerDialog(
            context,
            {_: TimePicker, hour: Int, minute: Int ->
                var cusHour = hour.toString()
                var cusMinute = minute.toString()
                if(hour.toString().count() == 1) {
                    cusHour = "0" + cusHour
                }
                if(minute.toString().count() == 1) {
                    cusMinute = "0" + cusMinute
                }
                time2 = cusHour + ":" + cusMinute
            }, hour2, minute2, true
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { timePickerDialog1.show() }) {
                Image(
                    painterResource(id = R.drawable.minotes_alar),
                    contentDescription = "My Time",
                    modifier = Modifier.size(40.dp)
                )
            }
            Spacer(modifier = Modifier.size(2.dp))
            Text(
                text = "Start $time1",
                color = Color.Black,
                fontFamily = robotoFont,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
            )
            Spacer(modifier = Modifier.size(30.dp))
            IconButton(onClick = { timePickerDialog2.show() }) {
                Image(
                    painterResource(id = R.drawable.minotes_alar),
                    contentDescription = "My Time",
                    modifier = Modifier.size(40.dp)
                )
            }
            Spacer(modifier = Modifier.size(2.dp))
            Text(
                text = "End $time2",
                color = Color.Black,
                fontFamily = robotoFont,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
            )
        }
    }

    @Composable
    fun DateAdd() {
        val context = LocalContext.current
        val calendar = Calendar.getInstance()
        val year: Int = calendar.get(Calendar.YEAR)
        val month: Int = calendar.get(Calendar.MONTH)
        val day: Int = calendar.get(Calendar.DAY_OF_MONTH)
        var date by remember { mutableStateOf("Date")}

        val datePickerDialog = DatePickerDialog(
            context,
            {_: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
                date = "$dayOfMonth/$month/$year"
            },year, month, day
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconButton(
                onClick = {datePickerDialog.show()}
            ) {
                Image(
                    painterResource(id = R.drawable.minotes_cal),
                    contentDescription = "My Date",
                    modifier = Modifier.size(40.dp)
                )
            }
            Spacer(modifier = Modifier.size(2.dp))
            Text(
                text = "Start $date",
                color = Color.Black,
                fontFamily = robotoFont,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
            )
        }
    }

    @Composable
    fun DropdownAdd() {
        var expanded by remember {mutableStateOf(false)}
        val list = listOf("Never", "Daily", "Weekly")
        var selectedItem by remember {mutableStateOf("") }

        var textFiledSize by remember {mutableStateOf(Size.Zero)}

        val icon = if (expanded) {
            Icons.Filled.KeyboardArrowUp
        }else{
            Icons.Filled.KeyboardArrowDown
        }

        OutlinedTextField(
            value = selectedItem,
            onValueChange = {selectedItem = it},
            modifier = Modifier
                .fillMaxWidth()
                .onGloballyPositioned { coordinates ->
                    textFiledSize = coordinates.size.toSize()
                },
            label = { Text(text = "Type of repetition")},
            placeholder = { Text(
                text = "Choose the type",
                color = Color.Black,
                fontFamily = robotoFont,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
             )},
            trailingIcon = {
                Icon(icon, "My Arrow", Modifier.clickable { expanded = !expanded })
            },
            textStyle = TextStyle(
                color = Color.Black,
                fontFamily = robotoFont,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
            ),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                focusedIndicatorColor =  MostYellow,
                unfocusedIndicatorColor = MostYellow,
                trailingIconColor = MostYellow,
                focusedLabelColor = MostYellow,
                cursorColor = MostYellow
            )
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = {expanded = false},
            modifier = Modifier
                .width(with(LocalDensity.current){textFiledSize.width.toDp()}),
        ){
            list.forEach {label ->
                DropdownMenuItem(
                    onClick = {
                        selectedItem = label
                        expanded = false
                    },
                ) {
                    Text(text = label)
                }
            }
        }
    }
}




