package com.hkt.hiltdemo.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun UserScreen(
    viewModel: UserViewModel = hiltViewModel()
) {
    val users by viewModel.users.collectAsState()
    var userName by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // 新增用戶區域
        OutlinedTextField(
            value = userName,
            onValueChange = { userName = it },
            label = { Text("使用者名稱") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                viewModel.addUser(userName)
                userName = ""
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("新增")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // 用戶列表
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(users) { user ->
                Card(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = user.name,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
} 