package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class websitePage {
	
public WebDriver driver;
	

	By navBar = By.cssSelector("div[id='ybar-navigation']");
	By mail = By.xpath("//a[@aria-label='Check your mail']/span[2]");
	
	


	
	public websitePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getNavBar() {
		return driver.findElement(navBar);
	}
	
	public WebElement checkMail() {
		return driver.findElement(mail);
	}

	

}
