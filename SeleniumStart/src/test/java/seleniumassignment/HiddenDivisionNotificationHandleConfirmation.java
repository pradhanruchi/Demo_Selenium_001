package seleniumassignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class HiddenDivisionNotificationHandleConfirmation {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-popup-blocking");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dell.com/en-in");
		
		WebElement itIn = driver.findElement(By.xpath("//span[contains(text(),'IT Infrastructure')]"));
		WebElement industry = driver.findElement(By.xpath("//button[contains(text(),'Industry')]"));
		
		
		Actions act=new Actions(driver);
		
		act.moveToElement(itIn).perform();
		act.moveToElement(industry).perform();
		
		driver.findElement(By.linkText("Manufacturing")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/Dell.png");
		FileHandler.copy(temp, dest);
		
//		Thread.sleep(Duration.ofSeconds(30));
//		driver.findElement(By.xpath("//button[@class='email-close-btn']")).click();
		
		driver.findElement(By.partialLinkText("Find a Store")).click();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Service Centre')]")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Carry-In Service Locator | Dell India")) {
				break;
			}
		}
	     System.out.println(driver.getTitle());
		
		boolean enable = driver.findElement(By.id("submit-btn")).isEnabled();
		System.out.println(enable);
		
		
		
		
		
		
		

	}

}
