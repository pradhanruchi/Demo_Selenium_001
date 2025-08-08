package testngcars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lamborghini {
	@Test(groups="smoke")
	public void Launch() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.lamborghini.com/");
		Reporter.log("Lamborghinin launched",true);
	}

}
