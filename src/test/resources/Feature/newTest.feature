Feature: this is for new testng

@Smoke 
Scenario Outline: User should be able to test with testng
	Then i am entering firstname "<fname>" "<fvalue>" 
	Then i am entering lastname "<lname>" "<lvalue>" 
	
	Examples: 
		|fname    |fvalue |lname   |lvalue |
		|firstName|Mohsin |lastName|New  |
