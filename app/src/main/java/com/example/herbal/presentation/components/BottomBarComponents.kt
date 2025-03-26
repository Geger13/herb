package com.example.herbal.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.herbal.data.theme.Neutral60
import com.example.herbal.data.theme.PrimaryBase
import com.example.herbal.presentation.navigation.bottomNavItem

@Composable
fun BottomBarComponent(navController: NavHostController) {



    var selected by remember {
        mutableStateOf(0)
    }

    BottomAppBar(
        modifier = Modifier
            .height(70.dp),
        containerColor = Color.White,
        content = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.weight(1f))

                bottomNavItem[0].let { item ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.wrapContentSize()
                    ) {
                        IconButton(onClick = { navController.navigate(item.route) }) {
                            Icon(
                                modifier = Modifier.size(28.dp),
                                tint = if (selected == 0) PrimaryBase else Neutral60,
                                painter = painterResource(id = item.icon),
                                contentDescription = null
                            )
                        }
                        Text(
                            fontSize = 14.sp,
                            text = item.title,
                            color = if (selected == 0) PrimaryBase else Neutral60
                        )
                    }
                }

                Spacer(modifier = Modifier.weight(4f))

                bottomNavItem[1].let { item ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.wrapContentSize()
                    ) {
                        IconButton(onClick = { navController.navigate(item.route) }) {
                            Icon(
                                modifier = Modifier.size(28.dp),
                                tint = if (selected == 1) PrimaryBase else Neutral60,
                                painter = painterResource(id = item.icon),
                                contentDescription = null
                            )
                        }
                        Text(
                            fontSize = 14.sp,
                            text = item.title,
                            color = if (selected == 1) PrimaryBase else Neutral60
                        )
                    }
                }

                Spacer(modifier = Modifier.weight(1f)) // Space di kanan
            }

        }
    )

}


@Preview
@Composable
fun BottomBarComponentPreview() {
    val cont = LocalContext.current
    BottomBarComponent(navController = remember { NavHostController(cont) })
}