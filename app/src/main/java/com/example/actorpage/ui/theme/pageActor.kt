//package com.example.actorpage.ui.theme
//
//import android.content.Context
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.lazy.LazyRow
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Card
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontWeight.Companion.W400
//import androidx.compose.ui.text.font.FontWeight.Companion.W500
//import androidx.compose.ui.text.font.FontWeight.Companion.W600
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import coil.compose.rememberAsyncImagePainter
//import com.example.actorpage.R
//import com.example.actorpage.models.FilmItems
//
//@Preview(showBackground = true)
//@Composable
//fun ActorPagePreview() {
//    ActorPage()
//}
//
//
//@Composable
//fun ActorPage() {
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier.fillMaxSize()
//    ){
//        Body(imgUrl = R.drawable.abc, name = "Кристина Асмус", job = "актриса")
//    }
//}
//
//@Composable
//fun Body(imgUrl: Int, name: String, job: String) {
//    Row(
//        horizontalArrangement = Arrangement.Center,
//        modifier = Modifier
//            .fillMaxWidth()
//    ){
//        Image(
//            painter = painterResource(id = imgUrl),
//            contentDescription = "null",
//            modifier = Modifier
//                .size(width = 146.dp, height = 201.dp)
//        )
//        Column(
//            verticalArrangement = Arrangement.Center,
//            modifier = Modifier
//                .padding(4.dp)
//        ) {
//            Text(
//                text = name,
//                fontFamily = FontFamily.Default,
//                fontSize = 16.sp
//            )
//            Text(
//                text = job,
//                fontFamily = FontFamily.Default,
//                fontSize = 12.sp,
//                color = Color.Gray
//            )
//        }
//    }
//
//}
//
//@Composable
//private fun HorizontalRow() {
//    Column {
//        Row(
//            modifier = Modifier.fillMaxSize()
//                .padding(end = 23.dp)
//                .padding(start = 15.dp)
//                .padding(top = 8.dp),
//            horizontalArrangement = Arrangement.SpaceBetween,
//        ) {
//            Text(
//                text = "Лучшее",
//                fontFamily = FontFamily.Default,
//                fontWeight = W600,
//                fontSize = 22.sp,
//                color = Color.Black
//            )
//            Text(
//                text = "Все",
//                fontFamily = FontFamily.Default,
//                fontWeight = W500,
//                fontSize = 16.sp,
//                color = Color.Blue
//            )
//        }
//
//        LazyRow(
//            horizontalArrangement = Arrangement.spacedBy(12.dp),
//            verticalAlignment = Alignment.CenterVertically,
//            contentPadding = PaddingValues(
//                top = 20.dp,
//                start = 15.dp,
//                end = 24.dp
//            )
//        ) {
//            items() {
//                ItemLayout(optionsList = it)
//            }
//        }
//    }
//}
//@Composable
//private fun ItemLayout(
//    optionsList: FilmItems,
//    context: Context = LocalContext.current.applicationContext,
//){
//    Card (
//        shape = RoundedCornerShape(size = 4.dp),
//        modifier = Modifier
//            .background(color = Color.White)
//            .height(285.6.dp)
//            .width(158.dp)
//    ) {
//        Column(
//            modifier = Modifier.background(color = Color.White)
//        ) {
//            Box(
//                modifier = Modifier
//                    .background(color = Color.Blue)
//                    .fillMaxWidth()
//                    .clickable {  },
//                contentAlignment = Alignment.TopEnd
//            ) {
//                Image(
//                    painter = rememberAsyncImagePainter(model = optionsList.posterUrl),
//                    modifier = Modifier.fillMaxWidth().height(237.6.dp),
//                    contentScale = ContentScale.FillBounds,
//                    contentDescription = null
//                )
//                Column(
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    modifier = Modifier
//                        .padding(top = 6.dp, end = 8.dp)
//                ) {
//                    Text(
//                        text = optionsList.rating,
//                        modifier = Modifier
//                            .background(color = Color.Blue,
//                                shape = RoundedCornerShape(6.dp)
//                            )
//                            .height(19.82.dp)
//                            .width(34.dp),
//                        color = Color.White,
//                        textAlign = TextAlign.Center,
//                        fontSize = 12.sp,
//                        fontFamily = FontFamily.Default,
//                        fontWeight = W400
//                    )
//                }
//            }
//            Spacer(modifier = Modifier.height(6.dp))
//            Column{
//                Text(
//                    text = optionsList.nameRu,
//                    color = Color.Black,
//                    fontSize = 16.sp,
//                    fontFamily = FontFamily.Default,
//                    fontWeight = W400
//                )
//            }
//            Column{
//                Text(
//                    text = optionsList.genres!!.joinToString(", "),
//                    color = Color.Gray,
//                    fontSize = 12.sp,
//                    fontFamily = FontFamily.Default,
//                    fontWeight = W400
//                )
//            }
//        }
//    }
//}
//
