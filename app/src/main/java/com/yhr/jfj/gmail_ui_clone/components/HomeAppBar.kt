package com.yhr.jfj.gmail_ui_clone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.yhr.jfj.gmail_ui_clone.GmailApp
import com.yhr.jfj.gmail_ui_clone.R
import com.yhr.jfj.gmail_ui_clone.ui.theme.Gmail_UI_CloneTheme

@Composable
fun HomeAppBar() {
    Box(modifier = Modifier.padding(10.dp)) {
        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(5.dp),
            modifier = Modifier.requiredHeight(50.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                Icon(Icons.Default.Menu, "Menu")
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Search in mail", modifier = Modifier.weight(2.0f))
                Image(
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(30.dp)
                        .background(color = Color.Gray),
                    painter = painterResource(id = R.drawable.main),
                    contentDescription = "1st Profile Picture"
                )
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    Gmail_UI_CloneTheme {
        GmailApp()
    }
}