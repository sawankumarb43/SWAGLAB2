package page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;


import helper.Base;

public class CheckoutPage extends Base {
	public By FirstName = By.cssSelector("input#first-name");
	public By LastName = By.cssSelector("input#last-name");
	public By ZipCode = By.cssSelector("input#postal-code");
	public By ContinueBtn = By.cssSelector("input#continue");
	public By finishBtn = By.cssSelector("button#finish");
	public By successMessage = By.cssSelector("h2.complete-header");
	public By ErrorMessage = By.cssSelector("[data-test='error']");

	public void user_enter_information(String fname, String lname, String pcode) {
		waitForExpectedElement(FirstName).sendKeys(fname);
		waitForExpectedElement(LastName).sendKeys(lname);
		waitForExpectedElement(ZipCode).sendKeys(pcode);
		waitForExpectedElement(ContinueBtn).click();

		// WebElement firstName =
		// driver.findElement(By.cssSelector("input#first-name"));
		// firstName.sendKeys(fname);
		// WebElement lastName = driver.findElement(By.cssSelector("input#last-name"));
		// lastName.sendKeys(lname);
		// WebElement ZipCode = driver.findElement(By.cssSelector("input#postal-code"));
		// ZipCode.sendKeys(pcode);
		// WebElement ContinueBtn =
		// driver.findElement(By.cssSelector("input#continue"));
		// ContinueBtn.click();
	}

	public void clickOnContinueBtn() throws IOException {
		takescreenShot();
		// WebElement finishBtn = driver.findElement(By.cssSelector("button#finish"));
		waitForExpectedElement(finishBtn).click();
	}

	public void validateOrderConfirmation() {
		// WebElement successMessage =
		// driver.findElement(By.cssSelector("h2.complete-header"));

		waitForExpectedElement(successMessage);
		String confirmationmessage = driver.findElement(successMessage).getText();
		assertEquals("Thank you for your order!", confirmationmessage);
	}

	public void validateErrorMessage() {
	//	WebElement ErrorMessage = driver.findElement(By.cssSelector("[data-test='error']"));
		
		boolean error = waitForExpectedElement(ErrorMessage).isDisplayed();
		assertTrue(error);

		// selectByVisibleText(ErrorMessage,"Noida");
		// selectByIndex(ErrorMessage, 1);
		// selectByValue(ErrorMessage, "India");

	}
}
