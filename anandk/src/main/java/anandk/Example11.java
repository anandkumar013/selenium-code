package anandk;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example11 {

	WebDriver driver;
	@Test
	public void enterDataInTextFields() throws ParseException{
		String path ="D:/Users/anandkuk/workspace/anandk/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		int rows= driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")).size();
		System.out.println("row :\t"+rows);
		int colums= driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
		System.out.println("column :\t"+colums);
		
		String firstPart = "//*[@id='leftcontainer']/table/tbody/tr[";
		String secondPart ="]/td[";
		String thirdPart = "]";
		
		
		
		for(int i=1 ;i<=rows ;i++){
			for(int j=1 ;j<=colums;j++){
				String finalXpath = firstPart+i+secondPart+j+thirdPart;
				//System.out.println(finalXpath);
				String text = driver.findElement(By.xpath(finalXpath)).getText();
				System.out.print(text+ " || ");
			}
			System.out.println();
		}
		
	}
}
