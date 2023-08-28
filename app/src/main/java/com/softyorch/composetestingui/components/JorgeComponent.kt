package com.softyorch.composetestingui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun JorgeComponent() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Jorge", Modifier.testTag("component1"))
        Text(text = "Agulló", Modifier.testTag("component2"))

        Image(imageVector = Icons.Default.Add, contentDescription = "imageDecorator")
    }
}