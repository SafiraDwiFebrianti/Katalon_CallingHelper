Feature: Close Ticket

	Background: User want to login using Helper Credential
	Given User already on Login Page
	When User input value email with 'safiradwifebrianti02+helper01@gmail.com'
	And User input value password with '12345678'
	And User click icon password
	And User click Log In button
	Then User successfully login as Helper
	
	@negative_case @ticket_type_is_other
	Scenario: Helper close ticket when ticket type is other
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Other
	And Helper click checkbox of Open
	And Helper close button Filter
	And Helper click button Plus
	And Helper click button Detail
	And Helper already at Detail Ticket
	And Helper click button Close Ticket
	And Helper click button OK on popup
	Then Helper see alert can not close tiket
	
	@positive_case @ticket_type_is_not_other
	Scenario: Helper close ticket when ticket type is not other
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Deposit
	And Helper click checkbox of Open
	And Helper close button Filter
	And Helper click button Plus
	And Helper click button Detail
	And Helper already at Detail Ticket
	And Helper click button Close Ticket
	And Helper click button OK on popup
	Then Helper successfully closed ticket