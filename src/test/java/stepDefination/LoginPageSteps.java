package stepDefination;

import java.io.IOException;

import helper.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginPageSteps  {

	LoginPage login = new LoginPage();

	//public void user_launch_site_url() {
	//	setup();

	//}

	@When("user enter username and password")
	public void user_enter_username_and_password() throws IOException {
		login.user_enter_username_and_password();
	}

	@And("user click on login button")
	public void user_click_on_login_button() throws IOException {
		login.user_click_on_login_button();
	}

	@Then("validate user logged in successfully")
	public void validate_user_logged_in_successfully() {
		login.validate_user_logged_in_successfully();
	}

	@Then("Filter price high to low")
	public void filter_price_high_to_low() {
		login.filter_price_high_to_low();
	}
}
