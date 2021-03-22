package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class passwordPage {
	
	
public WebDriver driver;
	

	By password = By.cssSelector("input[id='login-passwd']");
	By login = By.cssSelector("button[id='login-signin']");
	
	
	

	
	public passwordPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	

}
