Feature: Readmore about the localitiy

Scenario:	Validate user is able see the readmore data

    Given the browser is open and the URL is navigating to the webpage
    # And the user is logged in
    When the user hovers on the MB Advice option
    And the user should be able to see sub-options in the MbAdvice
   	Then user should be click on localities and  should navigate to the localities in banglore
   	Then click on the read more option and see te read more data