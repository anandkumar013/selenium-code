package anandk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example2 {

	WebDriver driver;
	@Test
	public void enterDataInTextFields(){
		String path ="D:/Users/anandkuk/workspace/anandk/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Anand");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("kumar");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("amj.jetgond@gmail.com");
		driver.findElement(By.xpath("//*[@type='submit' and @aria-label='Log In']")).click();



	
	
	}
}
