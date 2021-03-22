package Website;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import pageObjects.loginPage;
import pageObjects.mailPage;
import pageObjects.passwordPage;
import pageObjects.websitePage;
import resources.base;

public class VerifyTitleInbox extends base {
	
	public WebDriver driver;
	@BeforeTest
	
	public void initialize () throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	
	public void maiInboxlTitle() throws IOException {
		
		landingPage land = new landingPage (driver);
		land.GetSignin().click(); // the same as driver.findElement(By.css...)
		loginPage lp = new loginPage (driver);
		lp.getEmail().sendKeys("ruthel_rodriguez");
		passwordPage pp = lp.getNext();
		pp.getPassword().sendKeys("Lingtot@052515");
		pp.getLogin().click();
		
		websitePage wp = new websitePage (driver);
		wp.checkMail().click();
		
		
		mailPage mp = new mailPage (driver);
		//compare the text from the browser with actual value
		AssertJUnit.assertEquals(mp.getTitle().getText(), "Inbox");
	
		
	}
	@AfterTest
	public void teardown() {
		
		driver.close();
	}

}
