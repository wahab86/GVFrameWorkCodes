@retailPage1234
Feature: Retail Website features


# Every feature file starts with feature: name of feature file
# Every scenario starts with scenario: Name of test case we want to automate
# Gherkin keywords are are Given, When, And, But and then
# Given is precondition 
# When is an action 
# Then is an expected result (We write validation)
# And is repeating an action or can be used following Given keyword as well
# But is used for negative scenarios verification


Background: 	
		Given User is on Retail Website


@Test  
Scenario: Search functionality Test Case 
	
	When User search for '<iPhone>'
	And User click on search
	Then User should see iPhone Image
	
# In scenario outline we can run same scenario with multiple set of data
# we will use examples keyword to pass different data. 
# Every scenario outline follows with Examples keyword
# Under Examples keyword we placed data inside the pipes | and we can separate columns with pipes
# In Examples each row represent one time of execution

@TestCast
Scenario Outline: Test search functionality with multiple set of data

		When User search for '<itemName>'
		And  User click on search button 
		
		
	Examples:
	
	|itemName| 
	|iPhone|
	|Mac book|
	|Canon|
	
		
@RegisterTest		
Scenario: Register an Account Test Case				
		
		When User click on MyAccount
		And User  click on register option 
		And User fill the registration form with below information	 
		
		|firstName|lastName|email|telephone|password|confirmPassword|subscribe|
		|Alex|Sokolova|abcd123@gmail.com|203234455|test|test|no|
		
		And User accept the privacy and policy 
		And User click on continue button 
		Then User should be registered in retail website
		
		
		
		
		
