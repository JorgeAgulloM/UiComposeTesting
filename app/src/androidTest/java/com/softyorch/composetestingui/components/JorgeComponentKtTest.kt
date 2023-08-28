package com.softyorch.composetestingui.components

import androidx.compose.ui.test.assertContentDescriptionContains
import androidx.compose.ui.test.assertContentDescriptionEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsFocused
import androidx.compose.ui.test.assertIsNotDisplayed
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.assertIsNotFocused
import androidx.compose.ui.test.assertIsNotSelected
import androidx.compose.ui.test.assertIsOff
import androidx.compose.ui.test.assertIsOn
import androidx.compose.ui.test.assertIsSelectable
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.doubleClick
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.longClick
import androidx.compose.ui.test.onAllNodesWithContentDescription
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onFirst
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performImeAction
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.performTextReplacement
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipeDown
import androidx.compose.ui.test.swipeLeft
import androidx.compose.ui.test.swipeRight
import androidx.compose.ui.test.swipeUp
import org.junit.Rule
import org.junit.Test

class JorgeComponentKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun myFirstTest() {
        composeTestRule.setContent {
            JorgeComponent()
        }

        //FINDER
        composeTestRule.onNodeWithText("jorge", ignoreCase = true)
        composeTestRule.onNodeWithTag("component1")
        composeTestRule.onNodeWithContentDescription("imageDecorator")

        composeTestRule.onAllNodesWithText("g")
        composeTestRule.onAllNodesWithTag("component1")
        composeTestRule.onAllNodesWithContentDescription("imageDecorator")

        //ACTIONS
        composeTestRule.onNodeWithText("jorge", ignoreCase = true).performClick()
        composeTestRule.onAllNodesWithTag("component1").onFirst().performClick()
        composeTestRule.onNodeWithText("jorge", ignoreCase = true).performTouchInput {
            doubleClick()
            longClick()
            swipeDown()
            swipeUp()
            swipeLeft()
            swipeRight()
        }
        composeTestRule.onNodeWithText("Jorge").performClick().performScrollTo().performTextInput("")
        composeTestRule.onNodeWithText("Jorge").performImeAction()
        composeTestRule.onNodeWithText("Jorge").performTextClearance()
        composeTestRule.onNodeWithText("Jorge").performTextInput("Badabaw")
        composeTestRule.onNodeWithText("Jorge").performTextReplacement("Replace")

        //ASSERTIONS
        composeTestRule.onNodeWithText("Jorge").assertExists()
        composeTestRule.onNodeWithText("Jorge").assertDoesNotExist()
        composeTestRule.onNodeWithText("Jorge").assertContentDescriptionEquals("imageDecorator")
        composeTestRule.onNodeWithText("Jorge").assertContentDescriptionContains("imageDecorator")
        composeTestRule.onNodeWithText("Jorge").assertIsDisplayed()
        composeTestRule.onNodeWithText("Jorge").assertIsNotDisplayed()
        composeTestRule.onNodeWithText("Jorge").assertIsEnabled()
        composeTestRule.onNodeWithText("Jorge").assertIsNotEnabled()
        composeTestRule.onNodeWithText("Jorge").assertIsSelectable()
        composeTestRule.onNodeWithText("Jorge").assertIsNotSelected()
        composeTestRule.onNodeWithText("Jorge").assertIsFocused()
        composeTestRule.onNodeWithText("Jorge").assertIsNotFocused()
        composeTestRule.onNodeWithText("Jorge").assertIsOn()
        composeTestRule.onNodeWithText("Jorge").assertIsOff()
        composeTestRule.onNodeWithText("Jorge").assertTextEquals("")
        composeTestRule.onNodeWithText("Jorge").assertTextContains("Jorge")


    }
}