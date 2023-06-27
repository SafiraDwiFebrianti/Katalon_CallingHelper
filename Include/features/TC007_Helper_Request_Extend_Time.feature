Feature: Request Extend Time

	Background: User want to login using Helper Credential
	Given User already on Login Page
	When User input value email with 'safiradwifebrianti02+helper01@gmail.com'
	And User input value password with '12345678'
	And User click icon password
	And User click Log In button
	Then User successfully login as Helper
	
	@positive_case @extend_time
	Scenario: Helper request extend time to Admin Merchant
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Open
	And Helper close button Filter
	And Helper click button Plus
	And Helper click button Detail
	And Helper already at Detail Ticket
	And Helper click button Request Extend Extra Time
	And Helper see popup of Request Extend Extra Time
	And Helper input expired time on popup
	And Helper input the reason on popup
	And Helper click button Send on popup Extend Time
	Then Helper successfully request extend time