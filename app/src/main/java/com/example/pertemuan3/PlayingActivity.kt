package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun PlayActivity() {
    Column(modifier = Modifier.fillMaxSize()) {
        HeaderSetion()
    }
}

@Composable
fun HeaderSetion() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.DarkGray)
        .padding(15.dp)
    ){
        Row {
            Column {
                Text(text = "Daerah Istimewa Yogyakarta",
                    color = Color.White
                )
                Text(text = "Fax : 021-121212, Tlp :083111111",
                    color = Color.White
                    )
            }
            Box (
                contentAlignment = Alignment.BottomStart
            ){
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "",
                    modifier = Modifier.size(100.dp)
                        .clip(CircleShape)
                    )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = null
                    )
            }
        }
    }
}

@Composable
fun DetailSurat(
    judul: String, isinya: String
){
    Row {
        Text(text = judul,
            modifier = Modifier.weight(0.8f))
        Text(text = ":",
            modifier = Modifier.weight(0.2f))
        Text(text = isinya,
            modifier = Modifier. weight(2f))
    }
}