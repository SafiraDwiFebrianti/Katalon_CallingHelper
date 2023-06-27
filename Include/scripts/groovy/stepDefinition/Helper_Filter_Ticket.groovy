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

public class Helper_Filter_Ticket {
	@When("Helper already at page All Tickets")
	public void helper_already_at_page_All_Tickets() {
		WebUI.click(findTestObject('Helper - All Tickets/sidebar_All Tickets'))
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/title_All Tickets'))
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/input_Search Box'))
	}

	@When("Helper click button Filter")
	public void helper_click_button_Filter() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Filter/button_Filter'))
		WebUI.click(findTestObject('Helper - All Tickets/Filter/button_Filter'))
	}

	@When("Helper close button Filter")
	public void helper_close_button_Filter() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Filter/button_Filter'))
		WebUI.click(findTestObject('Helper - All Tickets/Filter/button_Filter'))
	}

	// Filter Ticket Type - Deposit
	@When("Helper click checkbox of Deposit")
	public void helper_click_checkbox_of_Deposit() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Filter/checkbox_Deposit'))
		WebUI.click(findTestObject('Helper - All Tickets/Filter/checkbox_Deposit'))
	}
	@Then("Helper see all ticket is Deposit")
	public void helper_see_all_ticket_is_Deposit() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Table View/type_value_Deposit'))
	}

	// Filter Ticket Type - Other
	@When("Helper click checkbox of Other")
	public void helper_click_checkbox_of_Other() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Filter/checkbox_Other'))
		WebUI.click(findTestObject('Helper - All Tickets/Filter/checkbox_Other'))
	}
	@Then("Helper see all ticket is Other")
	public void helper_see_all_ticket_is_Other() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Table View/type_value_Other'))
	}

	// Filter Ticket Tier - Tier 5
	@When("Helper click checkbox of Tier 5")
	public void helper_click_checkbox_of_Tier_5() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Filter/checkbox_Tier 5'))
		WebUI.click(findTestObject('Helper - All Tickets/Filter/checkbox_Tier 5'))
	}
	@Then("Helper see all ticket is on Tier 5")
	public void helper_see_all_ticket_is_on_Tier_5() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Table View/tier_value_Tier 5'))
	}

	// Filter Ticket Status - Open
	@When("Helper click checkbox of Open")
	public void helper_click_checkbox_of_Open() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Filter/checkbox_Open'))
		WebUI.click(findTestObject('Helper - All Tickets/Filter/checkbox_Open'))
	}
	@Then("Helper see all ticket is Open")
	public void helper_see_all_ticket_is_Open() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Table View/status_value_Open'))
	}

	// Filter Ticket Read - Unread
	@When("Helper click checkbox of Unread")
	public void helper_click_checkbox_of_Unread () {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Filter/checkbox_Unread'))
		WebUI.click(findTestObject('Helper - All Tickets/Filter/checkbox_Unread'))
	}
	@Then("Helper see all ticket is Unread")
	public void helper_see_all_ticket_is_Unread() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Table View/read_value_Unread'))
		WebUI.closeBrowser()
	}

}
