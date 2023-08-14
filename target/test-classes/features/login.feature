Feature: Validate Login functionality

@Reg1
Scenario: Verify Successful login with valid details
Given user enter "<username>" and "<password>"
And user click on login button
Then validate user logged in successfully
