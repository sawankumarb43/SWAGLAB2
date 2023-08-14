package stepDefination;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import page.BasketPage;

public class BasketPageSteps {
	BasketPage basket = new BasketPage();

	@And("user add product into the basket from PLP page")
	public void user_add_product_into_the_basket_from_plp_page() {
		basket.user_add_product_into_the_basket_from_plp_page();
		basket.validateBasketCount();

	}

	@Given("user navigate to cart page")
	public void user_navigate_to_cart_page() {
		basket.clickOncheckoutBtn();

	}
}
