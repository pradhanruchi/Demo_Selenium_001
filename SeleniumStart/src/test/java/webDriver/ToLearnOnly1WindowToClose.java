package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnOnly1WindowToClose {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(10000);
		
		driver.findElement(By.id("compare")).click();
		
		 Set<String> allWindowIds = driver.getWindowHandles();//capturing ids
		  
		 for(String id:allWindowIds) {
			 driver.switchTo().window(id);//Switching to each windows
			 Thread.sleep(1000);
			 //if(driver.getCurrentUrl().contains("amazon")){
				// driver.close();}
			 if(driver.getCurrentUrl().contains("flipkart")) {
				// driver.manage().window().maximize();
				 break; }
		 }
		 driver.manage().window().maximize();
	}
}
