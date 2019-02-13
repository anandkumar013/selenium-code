package anandk;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example6 {

	WebDriver driver;
	@Test
	public void enterDataInTextFields(){
		String path ="D:/Users/anandkuk/workspace/anandk/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//li[@class='youtube']/a")).click();
		
		//String parentWindow = driver.getWindowHandle();

		
		Set<String> windowHandles=driver.getWindowHandles();
		Iterator<String> iterable = windowHandles.iterator();
		
		String parentWindow = iterable.next();
		String childWindow = iterable.next();
		
		driver.switchTo().window(childWindow);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//*[@id='footer']/div/section[2]/div/div/ul/li/a")).click();
		
//		for(String windowID : windowHandles){
//			driver.switchTo().window(windowID);
//			System.out.println(windowID);
//			driver.close();
//		}
//		
		
	}
}
