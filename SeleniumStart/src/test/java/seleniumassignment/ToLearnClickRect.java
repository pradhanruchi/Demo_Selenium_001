package seleniumassignment;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClickRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		driver.findElement(By.linkText("Vtiger")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();// step 1: capture window ids
		                                                     
		for(String id:allWindowIds) {                        // step 2: use for each loop to get single ids
			driver.switchTo().window(id);                  
			@Nullable                                        // step 3: capture url and use condition
			String actUrl = driver.getCurrentUrl();
			if(actUrl.equals("https://www.vtiger.com/")) {
				break;
			}
		}
		
		Rectangle rect = driver.findElement(By.xpath("//a[contains(text(), 'GET A DEMO')]")).getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
	}

}
