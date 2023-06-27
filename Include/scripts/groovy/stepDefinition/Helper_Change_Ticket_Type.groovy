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

public class Helper_Change_Ticket_Type {

	@When("Helper click button Change Ticket Type")
	public void helper_click_button_Change_Ticket_Type() {
		WebUI.scrollToElement(findTestObject('Helper - All Tickets/Detail Ticket/Feature Change Ticket Type/Button_Change Type'), 10)
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/Feature Change Ticket Type/Button_Change Type'))
	}

	@When("Helper see popup of Change Ticket Type")
	public void helper_see_popup_of_Change_Ticket_Type() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Change Ticket Type/Wording_Change Ticket Type'))
	}

	@When("Helper choose ticket type Deposit")
	public void helper_choose_ticket_type_Deposit() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Change Ticket Type/Option'))
		WebUI.selectOptionByLabel(findTestObject('Helper - All Tickets/Detail Ticket/Feature Change Ticket Type/Option'), 'Deposit', false)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Helper - All Tickets/Detail Ticket/Feature Change Ticket Type/Option'), 'Deposit', false, 10)
	}

	@When("Helper click button Send on popup")
	public void helper_click_button_Send_on_popup() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Change Ticket Type/Button_Send'))
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/Feature Change Ticket Type/Button_Send'))
		WebUI.delay(10)
	}

	@Then("Helper successfully change ticket to Deposit")
	public void helper_successfully_change_ticket_to_Deposit() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/alert_Change ticket type is successful'))
		WebUI.closeBrowser()
	}
}
