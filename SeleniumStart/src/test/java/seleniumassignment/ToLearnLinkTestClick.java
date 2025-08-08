package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLinkTestClick {

	public static void main(String[] args) {    

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String gender="f";
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		if(gender.equals("m")) 
			
			driver.findElement(By.id("gender-male")).click();
		else
			driver.findElement(By.id("gender-female")).click();
		
		driver.findElement(By.name("FirstName")).sendKeys("Ruchi");
		driver.findElement(By.name("LastName")).sendKeys("Pradhan");
		driver.findElement(By.id("Email")).sendKeys("ruchilife13@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Ruchi13@");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Ruchi13@");
		driver.findElement(By.name("register-button")).click();
		
		driver.close();
		
		
		
		
	}

}
