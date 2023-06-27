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

public class Helper_Assign_To_Supervisor {
	@When("Helper click button Assign To Supervisor")
	public void helper_click_button_Assign_To_Supervisor() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Assign to Supervisor/Button_Assign To Supervisor'))
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/Feature Assign to Supervisor/Button_Assign To Supervisor'))
	}
	
	@When("Helper see type ticket is Other")
	public void helper_see_type_ticket_is_Other() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Assign to Supervisor/Input_type_Other'))
	}
	
	@When("Helper see type ticket is Deposit")
	public void helper_see_type_ticket_is_Deposit() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Assign to Supervisor/Input_type_Deposit'))
	}
	
	@When("Helper click button Assign")
	public void helper_click_button_Assign() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Assign to Supervisor/Button_Assign'))
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/Feature Assign to Supervisor/Button_Assign'))
	}
	
	@Then("Helper see alert ticket is still other")
	public void helper_see_alert_ticket_is_still_other() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Assign to Supervisor/Alert_Sorry The ticket type is still Other'))
		WebUI.closeBrowser()
	}
	
	@Then("Helper successfully assign ticket to supervisor")
	public void helper_successfully_assign_ticket_to_supervisor() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/alert_ticket successfully assigned'))
		WebUI.closeBrowser()
	}
	
}
