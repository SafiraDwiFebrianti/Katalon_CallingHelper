package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class Login {
	@Given("User already on Login Page")
	public void user_already_on_Login_Page() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://stg.callinghelper.com/login')
	}

	@When("User input value email with {string}")
	public void user_input_value_email_with(String email) {
		WebUI.setText(findTestObject('Login Page/input_Email'), email)
	}

	@When("User input value password with {string}")
	public void user_input_value_password_with(String password) {
		WebUI.setText(findTestObject('Login Page/input_Password'), password)
	}

	@When("User click icon password")
	public void user_click_icon_password() {
		WebUI.click(findTestObject('Login Page/icon_Password'))
	}

	@When("User click Log In button")
	public void user_click_Log_In_button() {
		WebUI.click(findTestObject('Login Page/button_Login'))
	}

	@Then("User successfully login as Helper")
	public void user_successfully_login_as_Helper() {
		WebUI.verifyElementVisible(findTestObject('Helper - Dashboard/sidebar_Dashboard'), FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/sidebar_All Tickets'), FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementVisible(findTestObject('Helper - Assign History/sidebar_Assign History'), FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User successfully login as Admin Merchant")
	public void user_successfully_login_as_Admin_Merchant() {
		WebUI.verifyElementVisible(findTestObject('Admin Merchant - Dashboard/sidebar_Dashboard'))
		WebUI.verifyElementVisible(findTestObject('Admin Merchant - Ticket Request/sidebar_Ticket Request'))
		WebUI.verifyElementVisible(findTestObject('Admin Merchant - Ticket Types/sidebar_Ticket Types'))
		WebUI.verifyElementVisible(findTestObject('Admin Merchant - Ticket Groups/sidebar_Ticket Groups'))
		WebUI.verifyElementVisible(findTestObject('Admin Merchant - Ticket Report/sidebar_Ticket Report'))
		WebUI.verifyElementVisible(findTestObject('Admin Merchant - Setting/sidebar_Setting'))
	}

	@Then("User successfully login as Admin CH")
	public void user_successfully_login_as_Admin_CH() {
		WebUI.verifyElementVisible(findTestObject('Admin CH - Dashboard/sidebar_Dashboard'))
		WebUI.verifyElementVisible(findTestObject('Admin CH - Ticket Report/sidebar_Ticket Report'))
		WebUI.verifyElementVisible(findTestObject('Admin CH - Setting/sidebar_Setting'))
	}

	@Then("User successfully login as AF BFx")
	public void user_successfully_login_as_AF_BFx() {
		WebUI.verifyElementVisible(findTestObject('AF BFx - Dashboard/sidebar_Dashboard'))
		WebUI.verifyElementVisible(findTestObject('AF BFx - All Tickets/sidebar_All Tickets'))
		WebUI.verifyElementVisible(findTestObject('AF BFx - Assign History/sidebar_Assign History'))
		WebUI.closeBrowser()
	}
}
