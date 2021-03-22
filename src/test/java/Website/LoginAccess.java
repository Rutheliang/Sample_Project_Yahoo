package Website;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import pageObjects.loginPage;
import pageObjects.passwordPage;
import resources.base;

public class LoginAccess extends base {
	
public WebDriver driver;
	
	@BeforeTest
	
	public void initialize () throws IOException {
		driver = intializeDriver();
		
	}
	
	@Test
	
	public void basePageNavigation() throws IOException {
		driver.get(prop.getProperty("url"));
		
		//one is inheritance
		//creating object to that class and invoke methods of it
		
		landingPage land = new landingPage (driver);
		land.GetSignin().click(); // the same as driver.findElement(By.css...)
		
		loginPage lp = new loginPage (driver);
		lp.getEmail().sendKeys("ruthel_rodriguez");
		passwordPage pp = lp.getNext();
		pp.getPassword().sendKeys("Lingtot@052515");
		pp.getLogin().click();
		
		
		
		
		
		
		
	}

	@AfterTest
	public void teardown() {
		
	driver.close();
	}
	
	
		
		

}
