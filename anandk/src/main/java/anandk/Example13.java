package anandk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example13 {

	WebDriver driver;
	@Test
	public void enterDataInTextFields() throws InterruptedException{
		String path ="D:/Users/anandkuk/workspace/anandk/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://my.monsterindia.com/create_account.html?");
		driver.findElement(By.xpath("//*[@id='firstName_id']")).sendKeys("testcom");
		driver.findElement(By.xpath("//*[@id='lastName_id']")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("amj.jetgond.com");

		driver.findElement(By.xpath("//*[@id='passwd_id']")).click();;
		//*[@id='email_msg']/span
		//driver.findElement(By.xpath("//*[@id='box1']/div")).click();
		driver.findElement(By.xpath("//*[@id='s2id_location']/a")).click();;
		//*[@id='emailmsg_close']
		driver.findElement(By.xpath("//*[@id='emailmsg_close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit' and @aria-label='Log In']")).click();



	
	
	}
}
