Feature: Verify the login functionality
 
Scenario: Verify the login with valid credentials
Given Load the website "http://practice.automationtesting.in/"
When Click on myaccount button
And Enter username "rcbalam@gmail.com"
And Enter password "Ram@bvrm534201"
And click on login button
Then Click on signout