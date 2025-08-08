package companies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Infosys {
	@Test(groups="smoke")
	public void infosysLaunched(){
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.infosys.com/");
		Reporter.log("infosys launched",true);
	
	}

}
