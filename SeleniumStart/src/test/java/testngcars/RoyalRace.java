package testngcars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalRace {
	@Test(groups="regeration")
	public void launched() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://royalracing.com/");
		Reporter.log("RoyalRace launched",true);
	}

}
