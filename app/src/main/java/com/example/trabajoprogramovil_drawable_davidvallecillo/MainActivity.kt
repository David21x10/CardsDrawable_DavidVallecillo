package com.example.trabajoprogramovil_drawable_davidvallecillo

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


import com.example.trabajoprogramovil_drawable_davidvallecillo.ui.theme.TrabajoPrograMovil_Drawable_DavidVallecilloTheme
import org.jetbrains.annotations.Async

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TrabajoPrograMovil_Drawable_DavidVallecilloTheme {
                Scaffold(
                    topBar = { TopBarComponent() },

                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxWidth()
                                .verticalScroll(rememberScrollState())
                        ) {
                            Spacer(modifier = Modifier.height(16.dp))

                            ImageCard(
                                drawableRes = R.drawable.lewandowski,
                                text= "¡Robert Lewandowski a los 36 años no para! Robert Lewandowski pichichi de La Liga.")
                            Spacer(modifier = Modifier.height(16.dp))

                            ImageCard(
                                drawableRes = R.drawable.raphinha,
                                text= "¡Raphinha el mejor brasileño del mundo actualmente!")
                            Spacer(modifier = Modifier.height(16.dp))

                            ImageCard(
                                drawableRes = R.drawable.inigo_martinez,
                                text= "¡El central vasco ha impresionado con su excelente nivel en la linea defensiva del cuadro manejado por Hansi Flick!")
                            Spacer(modifier = Modifier.height(16.dp))

                            ImageCard(
                                drawableRes = R.drawable.hansi_flick,
                                text= "¡El entrenador mas exigente!. A pesar de ganar, Flick siempre saca a relucir los errores durante el partido y siempre dice que se mejorarán.")
                            Spacer(modifier = Modifier.height(16.dp))

                        }
                    }

                }
            }
        }
    }
}

@Composable
fun ImageCard( drawableRes: Int, text: String ) {
    Card(
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .wrapContentHeight(),

        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFF4444)
        )

    ) {



        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = drawableRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .height(230.dp),
                contentScale = ContentScale.Crop

            )
            Text(
                text = text,
                modifier = Modifier.padding(top = 10.dp),
                color = Color.White,
                style = MaterialTheme.typography.bodyMedium,
                fontSize = 18.sp
            )

        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarComponent() {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(stringResource(R.string.tittle_Top),
                    color= Color.White)
                            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF4943FF),
            titleContentColor = Color.White
        )
    )
}



