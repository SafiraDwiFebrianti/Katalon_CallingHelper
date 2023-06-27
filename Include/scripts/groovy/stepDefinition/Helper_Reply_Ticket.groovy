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

public class Helper_Reply_Ticket {
	@When("Helper click button Plus")
	public void helper_click_button_Plus() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Table View/button_plus'))
		WebUI.click(findTestObject('Helper - All Tickets/Table View/button_plus'))
	}

	@When("Helper click button Detail")
	public void helper_click_button_Detail() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Table View/button_Detail'))
		WebUI.click(findTestObject('Helper - All Tickets/Table View/button_Detail'))
	}

	@When("Helper already at Detail Ticket")
	public void helper_already_at_Detail_Ticket() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/button_Back'))
	}

	@When("Helper typing a text")
	public void helper_typing_a_text() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/input_Reply'))
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/input_Reply'))
		WebUI.setText(findTestObject('Helper - All Tickets/Detail Ticket/input_Reply'), 'Halo ini Helper - dikirim otomatis')
	}


	@When("Helper click button Send")
	public void helper_click_button_Send() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/button_Reply'))
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/button_Reply'))
	}

	@Then("Helper successfully reply ticket with text")
	public void helper_successfully_reply_ticket_with_text() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/reply_value_Halo ini Helper - dikirim otomatis'))
		WebUI.closeBrowser()
	}

	@When("Helper click button Upload File")
	public void helper_click_button_Upload_File() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Upload File/button_Upload File'))
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/Feature Upload File/button_Upload File'))
	}

	@When("Helper see popup of Upload File")
	public void helper_see_popup_of_Upload_File() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Upload File/Wording_Upload File'))
	}

	@When("Helper choose image from Gallery {string}")
	public void helper_choose_image_from_Gallery(String image) {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Upload File/Input_File'))
		WebUI.uploadFile(findTestObject('Helper - All Tickets/Detail Ticket/Feature Upload File/Input_File'), image)
	}

	@When("Helper click button Upload on popup")
	public void helper_click_button_Upload_on_popup() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Upload File/Button_Upload'))
		WebUI.click(findTestObject('Helper - All Tickets/Detail Ticket/Feature Upload File/Button_Upload'))
	}

	@Then("Helper successfully reply ticket with image")
	public void helper_successfully_reply_ticket_with_image() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/reply_value_File Uploaded'))
	}

	@When("Helper choose file {string}")
	public void helper_choose_file(String file) {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/Feature Upload File/Input_File'))
		WebUI.uploadFile(findTestObject('Helper - All Tickets/Detail Ticket/Feature Upload File/Input_File'), file)
	}

	@Then("Helper successfully reply ticket with file")
	public void helper_successfully_reply_ticket_with_file() {
		WebUI.verifyElementVisible(findTestObject('Helper - All Tickets/Detail Ticket/reply_value_File Uploaded'))
	}
}
