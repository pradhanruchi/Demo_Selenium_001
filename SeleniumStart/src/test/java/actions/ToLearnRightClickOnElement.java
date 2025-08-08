package actions;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnRightClickOnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	 
	WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions act = new Actions(driver);
	act.contextClick(element).perform();
	 
	driver.findElement(By.xpath("//span[text()='Copy']")).click();
	 

	}

}
