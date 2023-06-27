Feature: Locked Ticket

	Background: User want to login using Helper Credential
	Given User already on Login Page
	When User input value email with 'safiradwifebrianti02+helper01@gmail.com'
	And User input value password with '12345678'
	And User click icon password
	And User click Log In button
	Then User successfully login as Helper
	
	@positive_case @lock_ticket
	Scenario: Helper lock ticket
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Open
	And Helper close button Filter
	And Helper click button Plus
	And Helper click button Detail
	And Helper click button Lock For Me
	And Helper click button OK on popup
	Then Helper successfully locked ticket
	
	@positive_case @remove_lock_ticket
	Scenario: Helper remove lock ticket
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Open
	And Helper close button Filter
	And Helper click button Plus
	And Helper click button Detail
	And Helper click button Remove Lock
	And Helper click button OK on popup
	Then Helper successfully remove locked ticket
	
	@positive_case @lock_ticket
	Scenario: Helper lock ticket again
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Open
	And Helper close button Filter
	And Helper click button Plus
	And Helper click button Detail
	And Helper click button Lock For Me
	And Helper click button OK on popup
	Then Helper successfully locked ticket