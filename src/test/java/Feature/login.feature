Feature: FreeCRM Application Testing 

@login
Scenario: User log into the application
Given User launches the browser
When  user enter credentials aand click on login
Then user is on homepage

@contacts
Scenario: User adds contacts 
When User clicks on contacts tab on Homepage
Then user enters new contact details
|FirstName|LastName|Department|Phone|
|Mary1     |Peter   |QA		  |7823458767|
|Tom1	  |Tommy   |dev       |2343224323| 
And user clicks save



