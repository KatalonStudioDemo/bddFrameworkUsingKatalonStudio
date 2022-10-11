package com.katalon
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class checkOutWithExistingUserSteps {

	@Given("Navigate to sauceLab home page")
	def navigateToHomePage(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.saucedemo.com/')
	}

	@When("Enter the email and password field")
	def enterDetails(){
		WebUI.setText(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac'),
				'standard_user')

		WebUI.setEncryptedText(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_3423e9'),
				'qcu24s4901FyWDTwXGr6XA==')
	}

	@And("click on Login button")
	def clickLoginButton(){
		WebUI.click(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_0dff71'))
	}

	@And("click on Add to cart button")
	def clickAddToCartBtn(){
		WebUI.click(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/button_Add to cart'))
	}

	@And("click on cart icon on top header of the page")
	def cartIcon(){
		WebUI.click(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/a_1'))
	}

	@And("click on Continue shopping button")
	def continueShoppingBtn(){
		WebUI.click(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/button_Continue Shopping'))
	}


	@And("click on Add to cart button for the second item to be selected")
	def addToCartBtn(){
		WebUI.click(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/button_Add to cart_1'))
	}

	@And("click on checkout button")
	def checkOutBtn(){
		WebUI.click(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/button_Checkout'))
	}

	@And("Enter the first name field")
	def firstNameField(){
		WebUI.setText(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/input_Checkout Your Information_firstName'),
				'Test')
	}

	@And("Enter the last name field")
	def lastNameField() {
		WebUI.setText(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/input_Checkout Your Information_lastName'),
				'User')
	}

	@And("Enter the zipCode field")
	def zipCodeField(){
		WebUI.setText(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/input_Checkout Your Information_postalCode'),
				'121111')
	}

	@And("Click on Continue button")
	def continueBtn(){
		WebUI.click(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/input_Cancel_continue'))
	}

	@And("Click on finish button")
	def finishBtn(){
		WebUI.click(findTestObject('Object Repository/sauceDemoPageObjects/Page_Swag Labs/button_Finish'))
	}
}