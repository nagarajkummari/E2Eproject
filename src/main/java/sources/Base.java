package sources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	public Properties pro;
public WebDriver intial() throws IOException
{	
	pro = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\VENKAT\\eclipse-workspace\\E2Eproject\\src\\main\\java\\sources\\data.properties");
	
	pro.load(fis);
	
	String browserName = pro.getProperty("browser");
	//String url = pro.getProperty("url");
	
	if(browserName.equals("chrome"))
	{		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
	else if(browserName.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		driver = new FirefoxDriver();	
	}
	else if(browserName.equals("IE"))
	{
		// implement the code of IE driver
	}
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
	}
	
}
