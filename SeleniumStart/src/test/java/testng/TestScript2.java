package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass {
	@Test
	public void clickOnComputers() {
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		/*if(driver.getTitle().equals("Demo Web Shop.Computers")) {
			Reporter.log("Computers page is displayed",true);
		}else {
			Reporter.log("Computers page is not displayed",true);
		}*/
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers");
		Reporter.log("Computer page is displayed",true);
	}
	

}
