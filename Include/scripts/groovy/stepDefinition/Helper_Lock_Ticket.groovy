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

public class Helper_Lock_Ticket {
	@When("Helper click button Lock For Me")
	public void helper_click_button_Lock_For_Me() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/button_Lock for me'))
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/button_Lock for me'))
	}

	@When("Helper click button OK on popup")
	public void helper_click_button_OK_on_popup() {
		WebUI.verifyAlertPresent(5)
		WebUI.acceptAlert()
		WebUI.delay(2)
	}

	@Then("Helper successfully locked ticket")
	public void helper_successfully_locked_ticket() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/button_Remove Lock'))
		WebUI.closeBrowser()
	}

	@When("Helper click button Remove Lock")
	public void helper_click_button_Remove_Lock() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/button_Remove Lock'))
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/button_Remove Lock'))
	}

	@Then("Helper successfully remove locked ticket")
	public void helper_successfully_remove_locked_ticket() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/button_Lock for me'))
		WebUI.closeBrowser()
	}
}

