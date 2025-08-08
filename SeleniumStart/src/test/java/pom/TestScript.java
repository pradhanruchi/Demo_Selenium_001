package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp= new WelcomePage(driver);
		wp.getLoginLink().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys("virat18rcb@gmail.com");
		lp.getPassword().sendKeys("virt@rcb");
		lp.getLogin().click();
		
		
		

}
}