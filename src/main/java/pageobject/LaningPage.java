package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaningPage {
	
	public WebDriver driver;
	
	By signin = By.xpath("//span[contains(text(),'Login')]");
	By title = By.xpath("//div[@class='text-center']/h2");
	
	
	
	public LaningPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getlogin()
	{
		return driver.findElement(signin);
	}
	public WebElement msg()
	{
		return driver.findElement(title);
	}
	
}
