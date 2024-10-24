@functional @smoke  @regression
Feature: ParaBank Login Testing
Description: User should already have an account
#Background:
 @positive @TC012
Scenario Outline:As a user , I want to login to the Parabank site with valid credentials 
so that i can use the bank website
Given Open the browser
And pass the parabank url"<url>"
When Enter the user name "<username>"
And Enter the password "<password>"
And Click on login button
Then Validate Login is successful
Given Quit all browser
Examples: 
| url                                              |username | password  |
|https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC |scratch  | batch38   |

@negative @TC02
Scenario Outline: As a user , i want to  login with only email
but no password so that an error message is displayed
Given Open the browser
And pass the parabank url"<url>"
When Enter the user name "<username>"
And Click on login button
Then Validate error message is displayed
Given Quit all browser
Examples: 
| url                                              |username | 
|https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC |scratch  | 
Scenario: 


