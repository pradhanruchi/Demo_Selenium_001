package seleniumTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PreTestSelenium {
	@Test
	public void launchpage() throws IOException, InterruptedException {
		String timestamp = LocalDateTime.now().toString().replace(":", "_");
		FileInputStream fis=new FileInputStream("./TestData/seleniumTest.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String mobileNumber=prop.getProperty("mobileNumber");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		
		driver.findElement(By.xpath("(//div[contains(@class,'cursor-pointer')])[1]")).click();
		driver.findElement(By.linkText("Fantasy Cricket")).click();
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys(mobileNumber);
		driver.findElement(By.linkText("GET APP LINK")).click();
		System.out.println(driver.findElement(By.id("errorMob")).getText());
		
		driver.switchTo().defaultContent();
		
		
		WebElement sc = driver.findElement(By.xpath("//a[text()='About Us']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",sc);
		sc.click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String ids:allWindowIds) {
			driver.switchTo().window(ids);
			
			if(driver.getTitle().equals("Home - Dream Sports")) {
				break;
			}
		}
		driver.findElement(By.xpath("//li[contains(@id,'menu-item')]//a[contains(text(),'Newsroom')]")).click();
		
		Select sel=new Select(driver.findElement(By.id("changebrand")));
		sel.selectByValue("ds-corporate");
		
		sel=new Select(driver.findElement(By.id("changedate")));
		sel.selectByValue("2020");
		
		Thread.sleep(Duration.ofSeconds(2));
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./screenshots/"+timestamp+"dream11.png");
		FileHandler.copy(temp, dest);
		
		
		
		
		
		
		
		
		   
		
		
		
		
			

		
		
		
				
	}

}
