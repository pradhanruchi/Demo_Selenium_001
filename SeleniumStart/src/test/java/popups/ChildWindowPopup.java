package popups;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/30");
		
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();//step 1
		
		for(String id:allWindowIds) {
			driver.switchTo().window(id);//step 2
			@Nullable
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains("flipkart")) {
				break;
			}
		}
         driver.close();
	}

}
