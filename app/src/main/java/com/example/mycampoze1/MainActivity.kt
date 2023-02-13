package com.example.mycampoze1

import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycampoze1.ui.theme.MyCampoze1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCampoze1Theme {

//                Column(modifier = Modifier.fillMaxSize(),
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                   verticalArrangement = Arrangement.Center  )


                ImageResourceDemo()
                Box(modifier = Modifier.fillMaxSize()) {
                    IconButton(
                        modifier = Modifier
                            .padding(16.dp)
                            .align(Alignment.TopStart),

                        onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.back),
                            contentDescription = "",
                        )
                    }
                    IconButton(
                        modifier = Modifier
                            .padding(16.dp)
                            .align(Alignment.TopEnd),
                        onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(R.drawable.vector__2_),
                            contentDescription = ""//stringResource(id = R.string.bus_content_description)
                        )

                    }

                    Card(modifier = Modifier
                        .size(415.dp, 426.dp)
                        .align(Alignment.BottomCenter)
                        , shape = RoundedCornerShape(46.dp,46.dp,0.dp,0.dp),

                        ) {
                        Column(modifier = Modifier.padding(35.dp,20.dp)) {

                            Text(
                                text = "  Borsch",
                                fontSize = 20.sp,
                                color = Color(0xFF406A52),
                            )
                              Spacer(modifier = Modifier.padding(0.dp,5.dp))
                            val image: Painter = painterResource(id = R.drawable.rating__2_)
                            Image(painter = image, contentDescription = "")

                            Text(
                                text = "  €11,99",
                                fontSize = 20.sp,
                                color = Color(0xFF406A52),
                            )
                            Spacer(modifier = Modifier.padding(0.dp,5.dp))
                            Text(
                                text = "  About",
                                style= TextStyle(
                                    color = Color.Gray,
                                    fontWeight = FontWeight.ExtraBold,
                                    fontSize = 22.sp
                                )
                            )
                            Spacer(modifier = Modifier.padding(0.dp,15.dp))
                            Card(modifier = Modifier
                                .size(296.dp, 66.dp)
                               // .align(Alignment.BottomCenter)
                                , shape = RoundedCornerShape(46.dp,46.dp,46.dp,46.dp)
                                ,Color.LightGray

                                ){ Text(modifier = Modifier.padding(3.dp,15.dp),
                                text = " Hot dressing soup based on beetroot, which gives the  characteristic red color.",
                                fontSize = 14.sp,
                                color = Color.DarkGray,
                            )
                                
                            }
                            Spacer(modifier = Modifier.padding(0.dp,5.dp))
                            val imageq: Painter = painterResource(id = R.drawable.frame_89)
                            Image(painter = imageq, contentDescription = "")
                            Spacer(modifier = Modifier.padding(0.dp,25.dp))
                          Row() {

                              Button(  modifier = Modifier
                                  .clip(CircleShape),colors=ButtonDefaults.buttonColors(Color.LightGray),
                                  shape = CircleShape,
                                  onClick = { /*TODO*/ }) {
                                  Icon(
                                      modifier = Modifier.size(30.dp),
                                      painter = painterResource(R.drawable.vector),
                                      tint=Color(0xFF406A52),
                                      contentDescription = "",

                                  )

                              }
                              Spacer(modifier = Modifier.padding(5.dp,0.dp))

                              Button(onClick = { /*TODO*/},colors=ButtonDefaults.buttonColors(Color(0xFF406A52)),shape = RoundedCornerShape(50.dp)
                                  , modifier = Modifier.width(450.dp)){
                                  Text(
                                      text = "  Buy NOW",
                                      fontSize = 28.sp,
                                      color = Color.White

                                       )}
                          }



                            
                        }
                        }
                    }


                }

//Button(onClick = { /*TODO*/ },
//shape = RoundedCornerShape(30.dp) {
//
//}




            }

        }
    }
            @Composable
            fun ImageResourceDemo() {
                val image: Painter = painterResource(id = R.drawable.rectangle_17)
                Image(painter = image, contentDescription = "")
            }

            @Composable
            fun set(text: String) {
                Text(
                    text = text,
                    fontSize = 55.sp,
                    modifier = Modifier.background(Color.Blue)


                )
            }

            @Composable
            fun Greeting(name: String) {
                Text(
                    text = "Hello $name!"

                )
            }

            @Preview(showBackground = true)
            @Composable
            fun DefaultPreview() {
                MyCampoze1Theme {
                    Greeting("Android")
                }
            }


