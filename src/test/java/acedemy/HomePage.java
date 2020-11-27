package acedemy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.LaningPage;
import pageobject.Login;
import sources.Base;

public class HomePage extends Base {
	
	@BeforeTest
	public void intializer() throws IOException
	{
		driver = intial();
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();	
	}

	@Test
	public void basepagenavigation()
	{
		
		
		LaningPage lan = new LaningPage(driver);
		lan.getlogin().click();
		
		Login log = new Login(driver);
		log.login().sendKeys("nagarahju@gmail.com");
		log.password().sendKeys("123845678");
		log.submit().click();
	
	}
	@AfterTest()
	public void teardown()
	{
		driver.close();
	}
}
