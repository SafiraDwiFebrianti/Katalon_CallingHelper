Feature: Reply Ticket

	Background: User want to login using Helper Credential
	Given User already on Login Page
	When User input value email with 'safiradwifebrianti02+helper01@gmail.com'
	And User input value password with '12345678'
	And User click icon password
	And User click Log In button
	Then User successfully login as Helper
	
	@positive_case @reply_text
	Scenario: Helper reply with text
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Open
	And Helper close button Filter
	And Helper click button Plus
	And Helper click button Detail
	And Helper already at Detail Ticket
	And Helper typing a text
	And Helper click button Send
	Then Helper successfully reply ticket with text
	
#	@positive_case @reply_image
#	Scenario: Helper reply with image
#	When Helper already at page All Tickets
#	And Helper click button Filter
#	And Helper click checkbox of Open
#	And Helper close button Filter
#	And Helper click button Plus
#	And Helper click button Detail
#	And Helper already at Detail Ticket
#	And Helper click button Upload File
#	And Helper see popup of Upload File
#	And Helper choose image from Gallery "E:\QA BFX\CallingHelper\Image\image.jpeg"
#	And Helper click button Upload on popup
#	Then Helper successfully reply ticket with image
#	
#	@positive_case @reply_document
#	Scenario: Helper reply with document
#	When Helper already at page All Tickets
#	And Helper click button Filter
#	And Helper click checkbox of Open
#	And Helper close button Filter
#	And Helper click button Plus
#	And Helper click button Detail
#	And Helper already at Detail Ticket
#	And Helper click button Upload File
#	And Helper see popup of Upload File
#	And Helper choose file "E:\QA BFX\CallingHelper\Image\doc_pdf.pdf"
#	And Helper click button Upload on popup
#	Then Helper successfully reply ticket with file