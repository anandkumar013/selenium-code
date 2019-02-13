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

public class Example10 {

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
		String secondPart ="]/td[4]";
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=1 ; i<rows ;i++){
			String xpathForm = firstPart+i+secondPart;
			System.out.println("xpath ;\t"+xpathForm);
			String price = driver.findElement(By.xpath(xpathForm)).getText();
			
			NumberFormat numberFormat = NumberFormat.getNumberInstance();
			Number num = numberFormat.parse(price);
			price = num.toString();
			System.out.println(price);
			
			Double dPrice = Double.parseDouble(price);
			int intPrice = dPrice.intValue();
			
			arrayList.add(intPrice);
			
		}
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.println(arrayList.get(0));

		System.out.println(arrayList.get(arrayList.size()-1));
	}
}
