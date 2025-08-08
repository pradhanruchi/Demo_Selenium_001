package demowebshop;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerIementation1 extends BaseClass implements ITestListener {
	String timestamp = LocalDateTime.now().toString().replace(":", "-");

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test script is pass", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test script is pass", true);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + timestamp + "dwslistener.png");
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

}
