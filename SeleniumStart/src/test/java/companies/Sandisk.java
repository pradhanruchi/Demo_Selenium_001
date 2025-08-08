package companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sandisk {
	@Test(groups= "regression")
	public void sandiskLaunched() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.sandisk.com/");
		Reporter.log("sandisk launched",true);
		
		
	}

}
