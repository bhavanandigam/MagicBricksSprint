
Feature: See all projects that are in a locality

Scenario: Validate user is able to navigate project and view all the details

  Given the browser is open and the URL is navigating to the webpage
  # And the user is logged in
  When the user hovers on the MB Advice option
  And the user should be able to see sub-options in the MbAdvice
  Then user should be click on localities and  should navigate to the localities in banglore
  And the user should click on the see all projects button
  And the user should click on a project
  And click on the Amenities link and return to the project details page
  Then click on the Specifications
