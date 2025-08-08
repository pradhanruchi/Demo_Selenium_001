package seleniumassignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLeranDataDrivenTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./TestData/commondata.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		
		System.out.println(email);
		System.out.println(password);
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        
        
        Thread.sleep(Duration.ofSeconds(5));
        
      TakesScreenshot ts = (TakesScreenshot)driver;
      File temp = ts.getScreenshotAs(OutputType.FILE);
      File dest = new File("./screenshots/facebook.png");
      FileHandler.copy(temp, dest);    
	}
} 
