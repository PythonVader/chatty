package com.example.chatty.ui.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.chatty.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileMain() {
    val isNavDrawerOpen by rememberSaveable {
        mutableStateOf(false)
    }
    Scaffold(
        modifier = Modifier,
        topBar = {
            CenterAlignedTopAppBar(title = { },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color.Transparent),
                navigationIcon = {
                    IconButton(onClick = {  }) {
                        if (isNavDrawerOpen) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBack,
                                contentDescription = "ToMainMenu",
                                modifier = Modifier.size(32.dp)
                            )
                        } else {
                            Icon(
                                imageVector = Icons.Filled.Menu,
                                contentDescription = "ToDetailsMenu",
                                modifier = Modifier.size(32.dp)
                            )
                        }
                    }
                },
                actions = {
                    IconButton(onClick = {

                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_share_24),
                            contentDescription = "Share Profile",
                            modifier = Modifier.size(18.dp))
                    }
                })
        },

        ){innerPadding ->
                Box(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .verticalScroll(rememberScrollState())
                    ) {

                    }
                }
            }

}