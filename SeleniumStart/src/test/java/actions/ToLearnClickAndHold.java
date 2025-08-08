package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickAndHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://yonobusiness.sbi/yonobusinesslogin");
		
		driver.findElement(By.id("password")).sendKeys("test@12345");
		
		WebElement eyeIcon = driver.findElement(By.xpath("//img[contains(@src,'icon_eye')]"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(eyeIcon).perform();

	}

}
