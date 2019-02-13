package anandk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example7 {

	WebDriver driver;
	
	String  String = "May 2019";
	String date = "21";
	@Test
	public void enterDataInTextFields() throws InterruptedException{
		String path ="D:/Users/anandkuk/workspace/anandk/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://www.phptravels.net/");
		driver.findElement(By.xpath("//input[@name='checkin']")).click();
		WebElement mon=driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[2]"));
		
		while(true){
			if(mon.getText().equals(String)){
				break;
			}
			else{
				driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[3]")).click();
				Thread.sleep(1000);

			}
		}
		driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/tbody/tr/td[contains(text(),'"+date+"')]")).click();
		Thread.sleep(100);
		
		
	}
}
