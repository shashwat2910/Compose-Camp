package com.example.material3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.material3.ui.theme.Material3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Material3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
//    Text(text = "Hello $name!")
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) 
    {
        Card(
            modifier = Modifier
                .size(width = 390.dp, height = 370.dp)
                .padding(12.dp),
            shape = RoundedCornerShape(16.dp)

        ) {

            Column(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Image(
                    painter = painterResource(R.drawable.image1),
                    modifier = Modifier.size(width = 390.dp, height = 168.dp),

                    contentDescription ="Hello"

                )

                Text(
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 40.sp,
                    modifier = Modifier.padding(8.dp),
                    text="Name"

                )
                Text(
                    fontSize = 16.sp,
                    modifier = Modifier.padding(horizontal = 8.dp),
                    text ="TY CSE,MITSOE" )

                Text(
                    fontSize = 12.sp,
                    modifier = Modifier.padding(8.dp),
                    text = "Chota sa bio")
                Row(
                    modifier = Modifier.padding(8.dp).fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {

                    OutlinedButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.fillMaxHeight().padding(horizontal = 3.dp)
                    ) {
                        Text(text = "First")
                    }
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier.fillMaxHeight().padding(horizontal = 3.dp)) {
                        Text(text = "Second")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Material3Theme {
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = Color.Black
        ) {
            Greeting("Android")
        }
    }
}