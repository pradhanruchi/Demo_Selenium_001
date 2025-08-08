package demowebshop;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	
	public HomePage hp;
	public WelcomePage wp;
	public LoginPage lp;
	public Properties prop;
	public LogoutPage lop;

	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		FileInputStream fis=new FileInputStream("./TestData/demoworkshop.properties");
		prop= new Properties();
		prop.load(fis);
		String url=prop.getProperty("url");
			
		driver.get(url);
	}

	@BeforeMethod
	public void login() {
		wp = new WelcomePage(driver);
		wp.getLoginLink().click();

		lp = new LoginPage(driver);
		lp.getEmaiTF().sendKeys(prop.getProperty("email"));
		lp.getPasswordTF().sendKeys(prop.getProperty("password"));
		lp.getLoginBtn().click();
	}

	@AfterMethod
	public void logout() {
		lop=new LogoutPage(driver);
		lop.getLogout().click();
		
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
