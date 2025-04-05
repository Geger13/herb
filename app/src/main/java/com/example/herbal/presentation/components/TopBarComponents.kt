package com.example.herbal.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.herbal.R
import com.example.herbal.data.theme.ContentDark
import com.example.herbal.data.theme.ContentWhite
import com.example.herbal.data.theme.SecondaryBase
import com.example.herbal.data.theme.SurfaceBase
import com.example.herbal.presentation.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarComponent(title: String, navController: NavHostController) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(ContentWhite),
        title = {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500),
                    color = ContentDark,
                    textAlign = TextAlign.Center,
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()

            )

        },
        navigationIcon = {
            Icon(
                modifier = Modifier.clickable {
                    navController.popBackStack()
                },
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back"
            )
        },
        modifier = Modifier
            .background(ContentWhite)

    )
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarComponentHasilScan(title: String, navController: NavHostController) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(ContentWhite),
        title = {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500),
                    color = ContentDark,
                    textAlign = TextAlign.Center,
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()

            )

        },
        navigationIcon = {
            Icon(
                modifier = Modifier.clickable {
                    navController.navigate(Screen.Menu.route)
                },
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back"
            )
        },
        modifier = Modifier
            .background(ContentWhite)

    )
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarComponentBack( navController: NavHostController) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(ContentWhite),
        title = {

        },
        navigationIcon = {
            Icon(
                modifier = Modifier.clickable {
                    navController.popBackStack()
                },
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Back"
            )
        },
        modifier = Modifier
            .background(ContentWhite)

    )
}


@Composable
fun TopBarComponentSearch(navController: NavHostController, searchText : String, screen : String) {
    Box(
        modifier = Modifier
            .background(ContentWhite)
            .padding(start = 16.dp, top = 16.dp, bottom = 16.dp, end = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .clickable { navController.navigate(screen) }
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
                text = searchText,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(400),
                )
            )
        }
    }
}




@Composable
fun TopBarComponentHome(name : String,navController: NavHostController) {
    Column(modifier = Modifier.background(ContentWhite)) {
        Row(
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, end = 16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {


            SearchBarTanaman(modifier = Modifier
                .padding(16.dp)
                .clickable { navController.navigate(Screen.Tanaman.route) })

        }
    }

}
    @Preview(showSystemUi = true)
    @Composable
    fun TopBarComponentPreview() {
        val context = LocalContext.current

    }