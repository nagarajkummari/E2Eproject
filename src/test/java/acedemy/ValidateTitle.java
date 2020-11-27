package acedemy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.LaningPage;
import pageobject.Login;
import sources.Base;

public class ValidateTitle extends Base {

	@Test
	public void basepagenavigation() throws IOException
	{
		driver = intial();
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		
		LaningPage lan = new LaningPage(driver);
		//System.out.println(lan.msg().getText());
		Assert.assertEquals(lan.msg().getText(), "FEATURE COurses");
		
	
		
		
	}
}
