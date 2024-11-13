Feature:	Property worth

Scenario:	 Validate user is able to calculate the property worth

Given the browser is open and the URL is navigating to the webpage
    # And the user is logged in
    When the user hovers on the MB Advice option
    And the user should be able to see sub-options in the MbAdvice
   	Then user should be click on localities and  should navigate to the localities in banglore
   	Then user should be able to click on propertyworth button in a locality
   	And fill the requirments
   	
					
