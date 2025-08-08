package seleniumassignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchSizeWindowClose {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(30000);
		
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		Dimension size = null;
		Point posit=null;
		
		for(String id:allWindowIds)
		{
			driver.switchTo().window(id);
			//Thread.sleep(10000);
			if(driver.getCurrentUrl().contains("flipkart")) {
			    size = driver.manage().window().getSize();
			}
			if(driver.getCurrentUrl().contains("ebay")) {
			    posit = driver.manage().window().getPosition();
			}
		}
		
		 System.out.println("Size of Flipkart Window"+size);
		 System.out.println("Position of Ebay Window"+posit);
		 
		 
		driver.quit();
	
		/*
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			Thread.sleep(10000);
			driver.close();
			
		}
		*/
		
		
	}

}
