package anandk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {

	WebDriver driver;
	@Test
	public void enterDataInTextFields(){
		String path ="D:/Users/anandkuk/workspace/anandk/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test@gmail.com");;
	}
}
