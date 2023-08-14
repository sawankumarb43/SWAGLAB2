package page;


import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import helper.Base;

public class LoginPage extends Base {
	

	public void user_enter_username_and_password() throws IOException {
		  WebElement username=driver.findElement(By.cssSelector("input#user-name"));
		    username.sendKeys(prop.getProperty("username"));
		   WebElement password= driver.findElement(By.cssSelector("input#password"));
		   password.sendKeys(prop.getProperty("password"));
		
		  
				
		   takescreenShot();
	  
	}

	
	public void user_click_on_login_button() throws IOException {
	WebElement Loginbtn= 	driver.findElement(By.cssSelector("input#login-button"));
	Loginbtn.click();
	//WebElement FilterBtn=driver.findElement(By.cssSelector("select.product_sort_container"));
	//FilterBtn.click();
//	Select s= new Select(FilterBtn);
	//s.selectByVisibleText("Price (high to low)");
//	takescreenShot();
	
			
	 
	}

	
	public void validate_user_logged_in_successfully() {
	    
	}

public void filter_price_high_to_low() {
	//WebElement FilterBtn=  driver.findElement(By.cssSelector("select.product_sort_container"));
	// Select s= new Select(FilterBtn);
	// s.selectByVisibleText("Price(high to low)");
}
}

