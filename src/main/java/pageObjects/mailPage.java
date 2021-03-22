package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mailPage {
	
public WebDriver driver;
	

	By titleInbox = By.cssSelector("a[title='Inbox']");
	
	


	
	public mailPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getTitle() {
		return driver.findElement(titleInbox);
	}
	
	


}
