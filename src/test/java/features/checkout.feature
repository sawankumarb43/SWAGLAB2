Feature: Validate checkout funtionality

@Reg
Scenario: validate checkout with valid details
Given user enter username and password
And user click on login button
And user add product into the basket from PLP page
And user navigate to cart page
And user enter information "sawan" "Kumar" "560064"
And user place order with cash on delivery mode
Then validate order confirmation

@Reg
Scenario: validate checkout with blank values
Given user enter username and password
And user click on login button
And user add product into the basket from PLP page
And user navigate to cart page
And user enter information "" "" ""
Then validate error message