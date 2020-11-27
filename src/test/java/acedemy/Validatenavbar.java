package acedemy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.LaningPage;
import pageobject.Login;
import sources.Base;

public class Validatenavbar extends Base {

	@Test
	public void basepagenavigation() throws IOException {
		driver = intial();
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();

		LaningPage lan = new LaningPage(driver);
		System.out.println(lan.msg().getText());

		File fl = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl, new File("user.dir+\\image1.png"));

	}
}
