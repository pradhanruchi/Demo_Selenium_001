package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("ruchipr123@gamil.com");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("Ruchi123@");
		 
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		
	}

}
