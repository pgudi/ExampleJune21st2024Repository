# Feature Name:
# Author:
# Spring Name:
# Developer Name:

@Execute
Feature: Verify Login and Logout functionality
Scenario: Verify Login functionality
Given I launch chrome browser
And I navigate application url
When I enter username in username text field
And I enter password in password text field
And I click on login in button
Then I find the home page
And I minimize flyout window

Scenario: Verify logout functionality
Given I find the home page
When I click on logout link
Then I find the login page
And I close Application
