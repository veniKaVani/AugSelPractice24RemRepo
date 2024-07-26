Feature: Uber Booking Feature 

Scenario: Booking Cab 

	Given User wants to select a car type "Sedan" from uber application 
	When User selects car "Sedan" and pick up point "Bangalore" and drop location "Pune" 
	Then Driver starts the journey 
	And Driver ends the journey 
	Then User pays 1000 USD
	
	Scenario: Booking Cab SUV

	Given User wants to select a car type "SUV" from uber application 
	When User selects car "SUV" and pick up point "Bangalore" and drop location "Hyderabad" 
	Then Driver starts the journey 
	And Driver ends the journey 
	Then User pays 1000 USD
	
	Scenario: Booking Cab Mini

	Given User wants to select a car type "Mini" from uber application 
	When User selects car "Mini" and pick up point "Pune" and drop location "Mumbai" 
	Then Driver starts the journey 
	And Driver ends the journey 
	Then User pays 1000 USD