package anandk;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example12 {

	WebDriver driver;
	@Test
	public void enterDataInTextFields() throws ParseException{
		String path ="D:/Users/anandkuk/workspace/anandk/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> links  =driver.findElements(By.xpath("//a"));
	
		System.out.println(links.size());
		ListIterator<WebElement> listLterator = links.listIterator();
//		while(listLterator.hasNext()){
//			WebElement link = listLterator.next();
//			System.out.println(link.getAttribute("href"));
//		}
//		
		ArrayList<String> alist = new ArrayList<String>();
		ListIterator<WebElement> listLteratorq = links.listIterator();
		while(listLterator.hasNext()){
			WebElement link = listLterator.next();
			alist.add(link.getText());
			System.out.println(link.getText());
		}
		System.out.println(alist.size());
	}
	
}
