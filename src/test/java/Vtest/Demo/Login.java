package Vtest.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login 
{
	static WebDriver driver;
	@Test
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	

}
