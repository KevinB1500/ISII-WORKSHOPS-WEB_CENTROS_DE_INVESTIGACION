Feature: Calculate Insurance

	Scenario: The user doesn't have license
		Given has no license
		When  insurance is calculated
		Then Show -1
	
