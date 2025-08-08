package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class TestScript extends BaseClass {
	
	@Test
	/*public void login() {
		Reporter.log("Open bowser and enter url",true);
		Reporter.log("Click on login link",true);
		Reporter.log("Enter valid credentials",true);
		Reporter.log("Click on login button",true);
		Assert.assertEquals(true,false,"Home page is not displayed");
		Reporter.log("Home page is displayed",true);
	}*/
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("virat1rcb@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("virat@rcb");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home page is not displayed");
		Reporter.log("Home page is displayed",true);
	}

}
