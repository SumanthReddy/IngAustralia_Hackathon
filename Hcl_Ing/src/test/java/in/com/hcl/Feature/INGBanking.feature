Feature: Banking Application
@UITest
Scenario: Launch HomePage
Given user is on Homepage
When clicks on Bank and Save 
And user click on Personal Term Deposit
Then Personal Term Deposit Page is populated


@UITest
Scenario: Launch Personal Deposit Page
Given user is on Personal Deposit Page
When user clicks on OpenNow
#And user clicks on New Customer
Then user is on Open Personal Term Deposit Page



@UITest
Scenario: Launch New Customer Page
Given user is on Personal Term Deposit Page
When user fill the form with following details
|INDIA|Ram|Dasaradh|Raghuvamasha|02/02/2020|Ayodhya|INDIA|sita@gmail.com|991627785|6361550433|AYODHYA-001|Kousalya|
And clicks on continue
#Then 

@UITest
Scenario:  Invalid Date format Validation
Given User is on Personal Term Deposite Page
When User provides Invalid Date
|xxx|Ram|Dasaradh|Raghuvamasha|vvv|Ayodhya|INDIA|sita@gmail.com|991627785|6361550433|AYODHYA-001|Kousalya|
Then user should get error message




