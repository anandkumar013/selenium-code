package anandk;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Example5 {

	

	WebDriver driver;
	@Test
	public void enterDataInTextFields(){
		String path ="D:/Users/anandkuk/workspace/anandk/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");

		WebElement features= driver.findElement(By.xpath("//*[@href='/features']"));
		 Actions actions= new Actions(driver);
		 actions.moveToElement(features).build().perform();
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		 driver.findElement(By.linkText("Work Scope Management")).click();
	}
}