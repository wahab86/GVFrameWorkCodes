Feature: Retail MacBook pro feature



@MacBookTest
Scenario: Validate the image of MacBook pro

	Given 	User is on the retail Webpage
	Then 	User Search "MacBook pro"
	And 	User click the search button
	Then 	User should see the MacBook Pro image
	

	