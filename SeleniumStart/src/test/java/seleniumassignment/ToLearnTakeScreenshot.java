package seleniumassignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnTakeScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("radha123@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("krishan");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
	    File temp = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./screenshots/"+timestamp+".png");
	    FileHandler.copy(temp, dest);
	}

}
