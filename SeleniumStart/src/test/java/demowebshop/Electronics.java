package demowebshop;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Electronics extends BaseClass {
	@Test
	public void electronics() {
		hp=new HomePage(driver);
		hp.getElectronicsLink().click();
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/electronics")) {
			Reporter.log("Electronics page is displayed",true);
		}else {
			Reporter.log("Electronics page is not displayed",true);
		}
	}
}
