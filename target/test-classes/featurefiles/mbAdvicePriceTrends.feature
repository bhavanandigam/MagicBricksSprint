Feature: Price Trends for sale

Scenario:	Validate user is able to navigate to price and trends and choose them for sale

Given the browser is open and the URL is navigating to the webpage
# And the user is logged in
When the user hovers on the MB Advice option
And the user should be able to see sub-options in the MbAdvice
Then user should be click on localities and  should navigate to the localities in banglore
And user should be able to click on the explorelocality 
And user is navigate to the locality page
Then click on the Price and Trends option
Then click on the <radiobutton> in the for sale section

Examples:
	
	|	radiobutton	|
	|	1						|
	|	2						|
	|	3						|
	|	4						| 