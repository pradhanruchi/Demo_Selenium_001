package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWebElement {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usernameTF = driver.findElement(By.id("username"));
		usernameTF.clear();
		usernameTF.sendKeys("Virat");
		
		WebElement passwordTF = driver.findElement(By.id("password"));
		passwordTF.clear();
		passwordTF.sendKeys("virat@18");
		
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys("Sign in",Keys.ENTER);
		
		String text = driver.findElement(By.xpath("//span[@class=' failureMessage']")).getText();
		System.out.println(text);
		
	}

}
