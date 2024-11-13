Feature: Login

Scenario: Validate that the user can login to the application

Given The Browser should be launched and URL should be navigated
When user should be able to hover on login link
And user should be able to click on login button and navigate to the login page
And user should be able to enter valid credentails and click on next button
And user should be able to click on continue
Then user should be logged in
And browser should be closed


