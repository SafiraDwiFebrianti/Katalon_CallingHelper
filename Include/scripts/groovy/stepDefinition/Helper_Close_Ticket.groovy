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

public class Helper_Close_Ticket {
	@When("Helper click button Close Ticket")
	public void helper_choose_file() {
		WebUI.scrollToElement(findTestObject('Helper - All Tickets/Detail Ticket/Feature Close Ticket/button_Close Ticket'), 5)
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/Feature Close Ticket/button_Close Ticket'))
	}

	@Then("Helper successfully closed ticket")
	public void helper_successfully_closed_ticket() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Close Ticket/wording_Ticket Closed'))
		WebUI.closeBrowser()
	}

	@Then("Helper see alert can not close tiket")
	public void helper_see_alert_can_not_close_tiket() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/alert_can_not_close_ticket_type_is_other'))
	}
}
