Feature: FreeCRM Application Testing 

@login
Scenario Outline: User log into the application
Given User launches the browser
When  user enter "<username>" and "<password>" click on login
Then user is on homepage
And Click on Contacts Tab and delete the contacts



Examples:
|username|password|
|jeevikalai|Anuska123|
