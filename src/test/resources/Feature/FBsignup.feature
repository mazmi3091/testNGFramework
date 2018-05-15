Feature: this is for Facebook sign up user story 

@Smoke 
Scenario Outline: User should be able to sign up to Facebook 
	Given i am at Facebook home page 
	Then i am entering firstname "<fname>" "<fvalue>" 
	Then i am entering firstname "<lname>" "<lvalue>" 
	
	Examples: 
		|fname    |fvalue |lname   |lvalue  |
		|firstName|Mohsin |lastName|Askme   |