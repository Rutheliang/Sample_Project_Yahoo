package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
public WebDriver driver;
	
	By email = By.cssSelector("input[id='login-username']");
	By next = By.cssSelector("input[id='login-signin']");
	
	
	
	

	
	public loginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public passwordPage getNext() {
		driver.findElement(next).click();
		passwordPage pp = new passwordPage (driver);
		return pp;
	}
	
	
	
	
	

}
