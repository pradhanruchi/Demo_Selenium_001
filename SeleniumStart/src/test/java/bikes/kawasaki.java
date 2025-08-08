package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class kawasaki {
	@Test
	public void launched() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.kawasaki.com/");
		Reporter.log("Kawasaki launched",true);
	}

}
