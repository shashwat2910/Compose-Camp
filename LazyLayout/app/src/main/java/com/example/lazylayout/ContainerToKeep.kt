package com.example.lazylayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ContainerToKeep(person: Person){
    Card(
        modifier = Modifier.background(colorResource(id = R.color.white)).padding(15.dp)
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth().background(Color.Gray).padding(20.dp)
        ) {
            Text(
                text = "${person.id}",
                color = Color.Black
            )
            Text(text = person.name,
                color = Color.Black)
            Text(text = "${person.phone}",
                color = Color.Black)
        }
    }
}

@Composable
@Preview
fun CustomItemPreview() {
    ContainerToKeep(person =
    Person(
        id = 1,
        name = "XYZ",
        phone = 1232

    )
    )
}