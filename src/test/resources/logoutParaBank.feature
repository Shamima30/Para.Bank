@regression
Feature: Parabank logout testing
Description: User should have a login account
Background: User should be logged in 
@positive  @ tc23
Scenario: As a logged in user, i want to logout from the ParaBank
so that my account is safe
Given Open the browser
And pass the parabank url
||https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC |scratch  | 
|
When Enter the username 
|scratch|
And Enter the password
|batch38|
And Click on login button
And Click on logout button
Then Validate logout is successful
Given Quit all browser