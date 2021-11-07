Feature: Calculate Insurance

	Scenario: The user doesn't have license
		Given has no license
		When  insurance is calculated
		Then Show -1
	
	Scenario: The user is older than 80 years old
		Given is 90 years old
		When insurance is calculated
		Then Show -1
	
	Scenario: The user is married and is between 45 and 65
		Given is married 
		Given is 50 years old 
		When insurance is calculated
		Then Show 200