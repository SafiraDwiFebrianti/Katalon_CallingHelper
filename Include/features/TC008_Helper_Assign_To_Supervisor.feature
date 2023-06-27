Feature: Request Extend Time

	Background: User want to login using Helper Credential
	Given User already on Login Page
	When User input value email with 'safiradwifebrianti02+helper01@gmail.com'
	And User input value password with '12345678'
	And User click icon password
	And User click Log In button
	Then User successfully login as Helper
	
	@positive_case @assign_to_supervisor @type_other
	Scenario: Helper request assign to supervisor
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Other
	And Helper click checkbox of Open
	And Helper close button Filter
	And Helper click button Plus
	And Helper click button Detail
	And Helper already at Detail Ticket
	And Helper click button Assign To Supervisor
	And Helper see type ticket is Other
	And Helper click button Assign
	Then Helper see alert ticket is still other
	
	@positive_case @assign_to_supervisor @type_deposit
	Scenario: Helper request assign to supervisor
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Deposit
	And Helper click checkbox of Open
	And Helper close button Filter
	And Helper click button Plus
	And Helper click button Detail
	And Helper already at Detail Ticket
	And Helper click button Assign To Supervisor
	And Helper see type ticket is Deposit
	And Helper click button Assign
	Then Helper successfully assign ticket to supervisor