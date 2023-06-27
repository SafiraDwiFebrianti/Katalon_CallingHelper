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

public class Helper_Request_Extend_Time {
	@When("Helper click button Request Extend Extra Time")
	public void helper_click_button_Request_Extend_Extra_Time() {
		WebUI.scrollToElement(findTestObject('Helper - All Tickets/Detail Ticket/Feature Request Extend Extra Time/button_Request Extend'), 5)
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/Feature Request Extend Extra Time/button_Request Extend'))
	}

	@When("Helper see popup of Request Extend Extra Time")
	public void helper_see_popup_of_Request_Extend_Extra_Time() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Request Extend Extra Time/Wording_Request Extend Extra Time'))
	}

	@When("Helper input expired time on popup")
	public void helper_input_expired_time_on_popup() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Request Extend Extra Time/Input_Expired Time in Second'))
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/Feature Request Extend Extra Time/Input_Expired Time in Second'))
		WebUI.setText(findTestObject('Helper - All Tickets/Detail Ticket/Feature Request Extend Extra Time/Input_Expired Time in Second'), '3600')
	}

	@When("Helper input the reason on popup")
	public void helper_input_the_reason_on_popup() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Request Extend Extra Time/Input_Reason'))
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/Feature Request Extend Extra Time/Input_Reason'))
		WebUI.setText(findTestObject('Helper - All Tickets/Detail Ticket/Feature Request Extend Extra Time/Input_Reason'), 'Testing Extend Time - otomatis')
	}

	@When("Helper click button Send on popup Extend Time")
	public void helper_click_button_Send_on_popup_Extend_Time() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Request Extend Extra Time/Button_Send'))
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/Feature Request Extend Extra Time/Button_Send'))
	}

	@Then("Helper successfully request extend time")
	public void helper_successfully_request_extend_time() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/alert_waiting adminstrator'))
		WebUI.scrollToElement(findTestObject('Helper - All Tickets/Detail Ticket/Feature Request Extend Extra Time/Wording_Ticket successfully Requested to Administrator'), 5)
		WebUI.closeBrowser()
	}
}
