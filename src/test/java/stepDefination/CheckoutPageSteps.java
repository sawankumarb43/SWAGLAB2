package stepDefination;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.CheckoutPage;

public class CheckoutPageSteps {
	CheckoutPage checkout= new CheckoutPage();
	
	@Given("user enter information {string} {string} {string}")
	public void user_enter(String fname, String lname, String pcode) {
	checkout.user_enter_information(fname, lname, pcode);
	    
	}
	@Given("user place order with cash on delivery mode")
	public void user_place_order_with_cash_on_delivery_mode() throws IOException {
		checkout.clickOnContinueBtn();
	}
	@Then("validate order confirmation")
	public void validate_order_confirmation() {
		checkout.validateOrderConfirmation();
	}
	@Then ("validate error message")
	public void validate_error_message() {
		checkout.validateErrorMessage();
	}
}
