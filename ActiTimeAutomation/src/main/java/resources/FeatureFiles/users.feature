# Feature Name:
# Author:
# Spring Name:
# Developer Name:

Feature: Verify Login and Logout functionality
Scenario: Verify Login functionality
Given I launch chrome browser
And I navigate application url
When I enter username in username text field
And I enter password in password text field
And I click on login in button
Then I find the home page
And I minimize flyout window
Given I find the home page
And I click on User tab
And I click on Add User Option
And I enter FirstName in firstName text field
And I enter LastName in lastName text field
And I enter email in email text field
And I enter login user in login username text field
And I enter user password in password text field
And I enter retypepassword in password text field
When I click on Create User button
Then I find the create User in the User List Page
And I click on Username in the User List Page
And I click on delete button to delete the User
And I click on Ok button in the Alert to delete the User
When I click on logout link
Then I find the login page
And I close Application