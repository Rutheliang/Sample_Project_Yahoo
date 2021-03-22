package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
public WebDriver driver;
	
//By signin = By.xpath("//div[contains(@class,'yb_x2y12')]");
By signin = By.xpath("//div[@role='toolbar']//a[@class='_yb_1toyv']");
	

	

	public landingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement GetSignin() {
		return driver.findElement(signin);
	}

}
