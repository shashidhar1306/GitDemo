package Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testbrowser2 {

	
	@Test
	public void TestCheckgoogle() throws MalformedURLException
	{
		MutableCapabilities caps= new MutableCapabilities();
		WebDriver driver= new RemoteWebDriver(  new URL("https:hub.browserstack.com/wd/hub"), caps);
	
		driver.get("https://rahulshettyacademy.com");
		Assert.assertTrue(driver.getTitle().matches("Rahul Shetty Academy"));
		
		System.out.println("print API-3");
		System.out.println("print Appium-3");
		//ttttt
		//yyyyy/
		//uuiiyi
	}
}
