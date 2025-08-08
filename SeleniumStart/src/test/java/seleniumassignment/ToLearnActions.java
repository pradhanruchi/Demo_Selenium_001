package seleniumassignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ToLearnActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demoapps.qspiders.com/");

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.linkText("Right Click")).click();
		
		WebElement rightClick = driver.findElement(By.id("btn_a"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClick).perform();
		
		
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		String msg = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).getText();
		System.out.println(msg);
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Double Click")).click();
		WebElement doubleClick = driver.findElement(By.id("btn_b"));
		
		act.doubleClick(doubleClick).perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'You selected')]")).click();
		
		String timestamp = LocalDateTime.now().toString().replace(":", "_");

		TakesScreenshot ts = (TakesScreenshot)driver;
        File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+timestamp+".png");
		FileHandler.copy(temp, dest);
        
		
	}

}
