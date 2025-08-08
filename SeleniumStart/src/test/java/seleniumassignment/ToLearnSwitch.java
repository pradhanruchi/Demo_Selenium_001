package seleniumassignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);
		
		driver.findElement(By.id("compare")).click();
	
		Set<String> allWIndowIds = driver.getWindowHandles();
		
		for(String id:allWIndowIds) {
			driver.switchTo().window(id);
			if(!(driver.getCurrentUrl().contains("shoppersstack"))) {
				driver.close();
			}
		}
	
		
		
	/*	String parent = driver.getWindowHandle();
		
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds=driver.getWindowHandles();
		
		for(String id:allWindowIds) {
			
			if(!(parent.equals(id)))
			{	
					driver.switchTo().window(id);
					driver.close();
			}
		}  */
		
	}

}
