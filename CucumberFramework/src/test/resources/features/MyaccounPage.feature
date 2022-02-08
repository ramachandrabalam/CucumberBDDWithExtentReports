Feature: Verify the My account page

Background:
Given Load the website "http://practice.automationtesting.in/"
And Click on myaccount button
When Enter username "rcbalam@gmail.com" and password "Ram@bvrm534201"
And click on login button

Scenario: Verify the menu list

When Menu contains the following items
| Dashboard |
| Orders    |
| Downloads |
| Addresses |
| Addresses |

Then verify the items are 5