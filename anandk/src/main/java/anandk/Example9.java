package anandk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example9 {

	WebDriver driver;
	@Test
	public void enterDataInTextFields(){
		String path ="D:/Users/anandkuk/workspace/anandk/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement table= driver.findElement(By.xpath("//*[@id='leftcontainer']/table"));
		int rows= driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")).size();
		System.out.println("row :\t"+rows);
		int colums= driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
		System.out.println("column :\t"+colums);

		String rowData = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[4]")).getText();
		System.out.println(rowData);
		//*[@id='leftcontainer']/table/tbody/tr
		
		//NCC
		String nccCurerent =driver.findElement(By.xpath("//a[contains(text(),'NCC')]/parent::*/following-sibling::td[3]")).getText();
		System.out.println(nccCurerent);
	}
}
