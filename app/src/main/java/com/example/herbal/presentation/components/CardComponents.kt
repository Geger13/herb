package com.example.herbal.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.herbal.R
import com.example.herbal.data.theme.ContentLightBlue
import com.example.herbal.data.theme.SecondaryBase
import com.example.herbal.data.theme.SurfaceBase
import com.example.herbal.presentation.navigation.Screen


@Composable
fun BannerCard(modifier: Modifier, navController: NavHostController) {

    Row(
        modifier
            .fillMaxWidth()
            .height(150.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(ContentLightBlue),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(
                text = "Pindai Tanaman\nHerbalmu",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            SmallBtn(modifier = Modifier, text = "Pindai", onClick = {
                navController.navigate(Screen.Scan.route)
            })
        }
        Image(
            contentScale = ContentScale.FillWidth,
            painter = painterResource(id = R.drawable.banner_plant1),
            contentDescription = null
        )
    }

}
@Composable
fun InformationCard(modifier: Modifier, title: String, image: Int, desc: String) {
    Column(
        modifier = modifier
            .height(115.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        Row {
            Image(
                modifier = Modifier
                    .width(90.dp)
                    .height(90.dp)
                    .clip(RoundedCornerShape(16.dp)),
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(10.dp)) {
                Text(
                    text = title,
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 27.sp,
                        fontWeight = FontWeight(700),
                    )
                )
                Text(
                    text = desc.take(80) + if (desc.length > 80) "..." else "",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 18.sp,
                        fontWeight = FontWeight(400),
                    )
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        HorizontalDivider()
    }
}

@Composable
fun MenuCard(modifier: Modifier, title: String, image: Int) {
    Column(
        modifier = modifier
            .height(115.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(90.dp)
                    .clip(RoundedCornerShape(16.dp)),
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 27.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(start = 12.dp) // Jarak antara gambar dan teks
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        HorizontalDivider()
    }
}

@Composable
fun SearchBarTanaman(modifier: Modifier) {
    Row(
        modifier = modifier
            .height(45.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceBase),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            tint = SecondaryBase,
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp)
                .width(24.dp)
                .height(24.dp),
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = null
        )
        Text(
            text = "Cari tanaman",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight(400),
            )
        )
    }
}


@Composable
@Preview(showBackground = true)
fun PreviewCardComponents(){
    val navController = rememberNavController()

    Column(
        modifier = Modifier
            .background(SurfaceBase)
            .padding(16.dp)
            .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally

    ){
        InformationCard(modifier = Modifier, "Sirih", R.drawable.sirih, "Daun sirih adalah")
        BannerCard(
            modifier = Modifier.padding(16.dp),
            navController = navController
        )
    }
}