package seleniumassignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ToLearnDropDown {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		driver.findElement(By.xpath("//*[local-name()='g' and @id='montana']")).click();
        driver.switchTo().defaultContent();
        
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		
		driver.findElement(By.id("user")).sendKeys("soni12376@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Pabc1234@");
		driver.findElement(By.id("cpass")).sendKeys("Pabc1234@");
		driver.findElement(By.id("firstName")).sendKeys("Ruchi");
		driver.findElement(By.id("lastName")).sendKeys("Pradhan");
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		
		Select sele=new Select(driver.findElement(By.id("user-type")));
		sele.selectByValue("4");
		
		driver.findElement(By.id("accept-tou")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
        Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + timestamp + ".png");
		FileHandler.copy(temp, dest);
		
		
	}

}
