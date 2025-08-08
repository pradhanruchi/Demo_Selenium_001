package seleniumassignment;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchRectIsDispalyed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Facebook")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			@Nullable
			String actUrl = driver.getCurrentUrl();
			if(actUrl.equals("https://www.facebook.com/nopCommerce")) {
				break;
			}
		}
		String backGroundclr = driver.findElement(By.xpath("//span[text()='Create new account']")).getCssValue("background-color");
		System.out.println(backGroundclr);
		
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		Set<String> allWindowIds1 = driver.getWindowHandles();
		
		for(String id:allWindowIds1) {
			driver.switchTo().window(id);
			
			@Nullable
			String actUrl = driver.getCurrentUrl();
			if(actUrl.equals("https://www.facebook.com/reg/?entry_point=logged_out_dialog&next=%2FnopCommerce")) {
				break;
			}
		}
		Thread.sleep(5000);
		boolean result = driver.findElement(By.xpath("//button[@name='websubmit']")).isDisplayed();
		System.out.println(result);
		 
	    /* if(driver.findElement(By.xpath("//button[@name='websubmit']")).isDisplayed()) {
	    	 System.out.println("Submit btn is displayed");
	     }
	     else {
	    	 System.out.println("Submit btn is not displayed");
	     }*/
	}

}
