package page;



import static org.junit.Assert.assertEquals;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import helper.Base;

public class BasketPage extends Base {
	public void user_add_product_into_the_basket_from_plp_page()  {

		WebElement addToCartBTn = driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-fleece-jacket"));
		addToCartBTn.click();

	}

	public void validateBasketCount() {
		WebElement basketcount = driver.findElement(By.cssSelector("span.shopping_cart_badge"));
		String actualCount = basketcount.getText();
		assertEquals("1", actualCount);
		
		
	}

	public void clickOncheckoutBtn() {
		WebElement basketIcon = driver.findElement(By.cssSelector("a.shopping_cart_link"));
		basketIcon.click();
		//WebElement productRemove=driver.findElement(By.cssSelector("button#remove-sauce-labs-fleece-jacket"));
		//productRemove.click();
		
		
		WebElement CheckoutBtn = driver.findElement(By.cssSelector("button#checkout"));
		CheckoutBtn.click();
	}
	public void user_navigate_to_cart_page() {
	
		WebElement continueBtn=driver.findElement(By.cssSelector("button#continue-shopping"));
		continueBtn.click();
	// }
//	public void fillUserform() {
//		WebElement country = driver.findElement(By.cssSelector(""));
	//	selectByVisibleText(country, "India");
	//	WebElement state = driver.findElement(By.cssSelector(""));
		//selectByVisibleText(state, "UP");
		//WebElement city = driver.findElement(By.cssSelector(""));
		//selectByVisibleText(city, "Noida");
		//WebElement personIcon = driver.findElement(By.cssSelector(""));
		//mouseHover(personIcon);
		
	
	//}

}
}
