Feature: Filter Ticket

	Background: User want to login using Helper Credential
	Given User already on Login Page
	When User input value email with 'safiradwifebrianti02+helper01@gmail.com'
	And User input value password with '12345678'
	And User click icon password
	And User click Log In button
	Then User successfully login as Helper
    
	@positive_case @ticket_type
	Scenario: Helper filter data Ticket Type (Deposit)
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Deposit
	And Helper close button Filter
	Then Helper see all ticket is Deposit
	
	@positive_case @ticket_type
	Scenario: Helper filter data Ticket Type (Other)
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Other
	And Helper close button Filter
	Then Helper see all ticket is Other
	
	@positive_case @ticket_tier
	Scenario: Helper filter data Ticket Tier (Tier 5)
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Tier 5
	And Helper close button Filter
	Then Helper see all ticket is on Tier 5

	@positive_case @ticket_status
	Scenario: Helper filter data Ticket Status (Open)
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Open
	And Helper close button Filter
	Then Helper see all ticket is Open
	
	@positive_case @ticket_read
	Scenario: Helper filter data Ticket Read (Unread)
	When Helper already at page All Tickets
	And Helper click button Filter
	And Helper click checkbox of Unread
	And Helper close button Filter
	Then Helper see all ticket is Unread
	