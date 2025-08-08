package assignment.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestScriptInstaLogin {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("TestData/instagram.properties");
		Properties prop = new Properties();
		prop.load(fis);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(prop.getProperty("url"));

		LoginPage wp = new LoginPage(driver);

		wp.getUserName().sendKeys(prop.getProperty("username"));
		wp.getPassWord().sendKeys(prop.getProperty("password"));
		wp.getLogIn().click();

		TakesScreenshot tc = (TakesScreenshot) driver;
		File temp = tc.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/InstaLogin.png");
		FileHandler.copy(temp, dest);
	}

}
