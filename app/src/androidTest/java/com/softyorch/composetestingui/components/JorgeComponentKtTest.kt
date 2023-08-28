package com.softyorch.composetestingui.components

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class JorgeComponentKtTest {

    @get:Rule
    val composableTestRule = createComposeRule()

    @Test
    fun myFirstTest() {
        composableTestRule.setContent {
            JorgeComponent()
        }
    }
}