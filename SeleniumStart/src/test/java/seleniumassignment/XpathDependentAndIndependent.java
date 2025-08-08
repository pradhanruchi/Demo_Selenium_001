package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDependentAndIndependent {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//span[text()='Train tickets']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Live train status')]")).click();
		
		//driver.findElement(By.xpath("//div[text()='12791 SC DNR SF EXP']/..//div[@class='train-name']")).click();
		
		//driver.findElement(By.xpath("//button[text()='Show Availability']/..//button[@class='availability-button']")).click();
		driver.findElement(By.xpath("(//button[@class='availability-button'])[1]")).click();
	}

}
