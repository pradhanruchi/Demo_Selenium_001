package companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Oracle {
	@Test(groups="system")
	public void oracleLaunched() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.oracle.com/");
		Reporter.log("oracle launched",true);
	}

}
