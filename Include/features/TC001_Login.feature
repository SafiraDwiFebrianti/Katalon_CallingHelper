Feature: Login

	@positive_case @helper
	Scenario: User want to login using Helper Credential
	Given User already on Login Page
	When User input value email with 'safiradwifebrianti02+helper01@gmail.com'
	And User input value password with '12345678'
	And User click icon password
	And User click Log In button
	Then User successfully login as Helper
	
	@positive_case @admin_merchant
	Scenario: User want to login using Admin Merchant Credential
	Given User already on Login Page
	When User input value email with 'admin@bullishfx.com'
	And User input value password with '12345678'
	And User click icon password
	And User click Log In button
	Then User successfully login as Admin Merchant
	
	@positive_case @admin_ch
	Scenario: User want to login using Admin CH Credential
	Given User already on Login Page
	When User input value email with 'oriontekno.it@gmail.com'
	And User input value password with 'password'
	And User click icon password
	And User click Log In button
	Then User successfully login as Admin CH
	
	@positive_case @affiliate_bfx
	Scenario: User want to login using AF BFx Credential
	Given User already on Login Page
	When User input value email with 'safiradwifebrianti02+qzy@gmail.com'
	And User input value password with '123456'
	And User click icon password
	And User click Log In button
	Then User successfully login as AF BFx