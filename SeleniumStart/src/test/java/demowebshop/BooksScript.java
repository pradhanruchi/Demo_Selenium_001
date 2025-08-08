package demowebshop;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BooksScript extends BaseClass {
	@Test
	public void books()  {
		hp=new HomePage(driver);
		hp.getBooksLink().click();
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/books")) {
			Reporter.log("Books page is displayed",true);
		}else {
			Reporter.log("Books page is not displayed",true);
		}
	}

}
