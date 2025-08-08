package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnStale {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		DemoWebShopWelcomePage wp=new DemoWebShopWelcomePage(driver);
		wp.getSerachTF().sendKeys("mobiles",Keys.ENTER);
		wp.getSerachTF().sendKeys("Shoes");
		 
	
		
		
	}

}
