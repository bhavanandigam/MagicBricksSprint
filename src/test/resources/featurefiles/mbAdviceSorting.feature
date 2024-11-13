Feature: Sorting Localities

Background:
    Given the browser is open and the URL is navigating to the webpage
    # And the user is logged in
    When the user hovers on the MB Advice option
    And the user should be able to see sub-options in the MbAdvice
   	Then user should be click on localities and  should navigate to the localities in banglore

Scenario: Sort localities by rating
    Then the user should be able to sort the localities using rating
    And the localities sorted by rating are displayed

Scenario: Sort localities by ranking
    Then the user should be able to sort the localities using ranking
    And the localities sorted by ranking are displayed
