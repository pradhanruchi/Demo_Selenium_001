package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearnHardAssert {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Log", "Login page is not displayed");
		Reporter.log("Log in page is displayed", true);
		
		//boolean loginstatus = driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed();
       // Assert.assertEquals(loginstatus, true,"Login page is not dispalyed");
       //   Reporter.log("Login page is displayed ",true);
        
		driver.findElement(By.id("Email")).sendKeys("virat18@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("virat@rcb");
		driver.findElement(By.xpath("//input[@value'Log in']")).click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "Home page is not displayed");
		Reporter.log("Home page is not displayed", true);
	}

}
