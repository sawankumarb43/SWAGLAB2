package cucumberOptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameImplementaion {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//driver.switchTo().frame("packageListFrame");
		driver.switchTo().frame(0);
		WebElement firstLink = driver.findElement(By.xpath("//ul[@title='Packages']/li[1]/a"));
		firstLink.click();
		
		driver.switchTo().defaultContent();
		
		//driver.switchTo().frame("classFrame");
		driver.switchTo().frame(2);
		WebElement HelpLink=  driver.findElement(By.xpath("(//ul[@title='Navigation'])[1]/li[8]/a"));
		HelpLink.click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("");
	}

}
