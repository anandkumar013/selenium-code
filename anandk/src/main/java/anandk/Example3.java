package anandk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Example3 {


	WebDriver driver;
	@Test
	public void enterDataInTextFields(){
		String path ="D:/Users/anandkuk/workspace/anandk/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement elementDay =driver.findElement(By.xpath("//*[@id='day']"));
		  Select select = new Select(elementDay);
		  select.selectByValue("10");
		  
		  WebElement elementMonth =driver.findElement(By.xpath("//*[@id='month']")); ////*[@id="month"]
		   select = new Select(elementMonth);
		  select.selectByIndex(3);
		  
		  WebElement elementYear =driver.findElement(By.xpath("//*[@id='year']")); ////*[@id="year"]
		   select = new Select(elementYear);
		  select.selectByVisibleText("2016");

	}
}	
	
