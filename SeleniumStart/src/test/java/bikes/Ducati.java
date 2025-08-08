package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ducati {
	@Test
	public void launched() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ducati.com/");
		Reporter.log("Ducati launched",true);
	}

}
