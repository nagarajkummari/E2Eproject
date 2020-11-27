package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	

	By username = By.id("user_email");
	
	By pass = By.id("user_password");
	
	By go  = By.xpath("//input[@type='submit']");
	
	public WebElement login()
	{
		return driver.findElement(username);
	}
	public WebElement password()
	{
		return driver.findElement(pass);
	}
	public WebElement submit()
	{
		return driver.findElement(go);
	}

}
