package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
		Thread.sleep(1000);
		
	    WebElement dream11 = driver.findElement(By.linkText("Dream11 winners"));
	
    	Actions act = new Actions(driver);
    	//act.scrollToElement(dream11).perform();
    	act.scrollByAmount(0, 1500).perform();
    	act.scrollByAmount(0, 1000).perform();
    	

	}

}
