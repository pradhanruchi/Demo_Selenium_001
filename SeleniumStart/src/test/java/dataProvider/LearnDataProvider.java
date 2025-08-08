package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {
	
	/*@DataProvider
	public String[][] dataSender() {
		String[][]data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
	}*/
	
	@Test(dataProviderClass = DataStorage.class,dataProvider = "dataSender")
	public void login(String[] cred) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys(cred[0]);
		driver.findElement(By.id("password")).sendKeys(cred[1]);
	}

}
