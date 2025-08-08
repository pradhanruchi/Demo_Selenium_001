package assignment.testng;

import java.time.Duration;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssignmentTestNG {

	@Test(priority = 1)
	public void createAccount() {
		Reporter.log("create a account",true);	
	}
	
	@Test(priority = 2)
	public void editAccount() {
		Reporter.log("edit a account",true);
	}
	
	@Test(priority = 3)
	public void deleteAccount() {
		Reporter.log("delete a account",true);
	}
	

}
