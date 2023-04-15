package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class Avinash {	
		public static void main(String[] arg) {
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("cricbuzz");
		//driver.f
		//driver.get("https://www.google.com");
		driver.quit();
		
}

}
