package com.example.cartadepresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartadepresentacion.ui.theme.CartaDePresentacionTheme
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaDePresentacionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        SeccionNombre()
                        InformacionContacto()
                    }
                }
            }
        }
    }
}


@Composable
fun SeccionNombre() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.photo_id),
            contentDescription = null,
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Fit
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Carolina Chi Arceo",
                fontSize = 24.sp,
                color = Color.Black,
                textAlign = TextAlign.Center

            )
            Text(
                text = "Estudiante de Ingeniería en Sistemas Computacionales",
                fontSize = 16.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center

            )
        }
    }
}


@Composable
fun InformacionContacto(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.padding(15.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                val email = painterResource(id = R.drawable.email_icon)
                Image(painter = email, contentDescription = null, modifier = Modifier.padding(8.dp))
                Text(
                    text = "carochiar@gmail.com",
                    color = Color.Black,
                    modifier = Modifier.padding(8.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                val email = painterResource(id = R.drawable.phone_icon)
                Image(painter = email, contentDescription = null, modifier = Modifier.padding(8.dp))
                Text(
                    text = "9811162563",
                    color = Color.Black,
                    modifier = Modifier.padding(8.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                val email = painterResource(id = R.drawable.social_media)
                Image(painter = email, contentDescription = null, modifier = Modifier.padding(8.dp))
                Text(
                    text = "@caroarceo",
                    color = Color.Black,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CartaDePresentacionTheme {
        Column {
            SeccionNombre()
            InformacionContacto()
        }
    }
}
