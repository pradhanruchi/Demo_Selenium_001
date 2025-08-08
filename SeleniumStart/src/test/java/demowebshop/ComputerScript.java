package demowebshop;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerIementation1.class)

public class ComputerScript extends BaseClass {
	@Test
	public void computer()  {
		hp=new HomePage(driver);
		hp.getComputersLink().click();
		/*if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/computers")) {
			Reporter.log("Computer page is displayed",true);
		}else {
			Reporter.log("Computer page is not displayed",true);
	}*/
		Assert.assertEquals(driver.getTitle(), "Computer page is not displayed","hii");
	
		Reporter.log("computer page is displayed",true);
		
	}
}
