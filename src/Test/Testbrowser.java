package Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testbrowser {

	@Test
	public void TestCheck() throws MalformedURLException
	{
		MutableCapabilities caps= new MutableCapabilities();
		WebDriver driver= new RemoteWebDriver(  new URL("https:hub.browserstack.com/wd/hub"), caps);
	
		driver.get("https://google.com");
		System.out.println("print Selenium");
		System.out.println("print API");
		System.out.println("print Appium");
		Assert.assertTrue(driver.getTitle().matches("Google"));
	}
}
