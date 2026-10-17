package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting(
                        title = stringResource(R.string.title),
                        subtitle = stringResource(R.string.subtitle),
                        body = stringResource(R.string.body),
                        contentScale = ContentScale.Crop,
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(
    title: String,
    subtitle: String,
    body: String,
    modifier: Modifier = Modifier,
    contentScale: ContentScale
){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth(),
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(9.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = subtitle,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(9.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = body,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(9.dp),
            textAlign = TextAlign.Justify
        )
    }
}

//@Composable
//fun GreetingText(
//    title: String,
//    subtitle: String,
//    body: String,
//    modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier,
//        verticalArrangement = Arrangement.Center
//        ){
//            Text(
//                text = title,
//                fontSize = 24.sp,
////                lineHeight = 116.sp,
//                modifier = Modifier
//                    .padding(8.dp)
//                    .align(Alignment.Start),
//            )
//            Text(
//                text = subtitle,
//                fontSize = 14.sp,
////                lineHeight = 30.sp,
//                modifier = Modifier
//                    .padding(9.dp),
//                textAlign = TextAlign.Justify
//            )
//            Text(
//                text = body,
//                fontSize = 14.sp,
////                lineHeight = 116.sp,
//                modifier = Modifier
//                    .padding(9.dp),
//                textAlign = TextAlign.Justify
//            )
//        }
//    }
//@Composable
//fun GreetingImage(
//    title: String,
//    subtitle: String,
//    body: String,
//    modifier: Modifier = Modifier,
//    contentScale: ContentScale
//) {
//    Column(
//        modifier = modifier.fillMaxSize(),
//        ) {
//        val image = painterResource(R.drawable.bg_compose_background)
//            Image(
//                painter = image,
//                contentDescription = null,
//                contentScale = ContentScale.FillWidth,
//                modifier = Modifier.fillMaxWidth(),
//            )
//            GreetingText(
//                title = title,
//                subtitle = subtitle,
//                body = body,
//                modifier = Modifier
////                    .fillMaxSize()
//                    .padding(16.dp),
//            )
//    }
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        Greeting(
            title = stringResource(R.string.title),
            subtitle = stringResource(R.string.subtitle),
            body = stringResource(R.string.body),
            contentScale = ContentScale.Crop,
        )
    }
}