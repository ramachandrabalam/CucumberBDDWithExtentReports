Feature: Verify the My account page

Scenario: Verify the menu list
Given Load the website "http://practice.automationtesting.in/"
When Click on myaccount button
And Enter username "rcbalam@gmail.com"
And Enter password "Ram@bvrm534201"
And click on login button
And Menu contains the following items
| Dashboard |
| Orders    |
| Downloads |
| Addresses |
| Addresses |
| Logout	  |

Then verify the items are 6