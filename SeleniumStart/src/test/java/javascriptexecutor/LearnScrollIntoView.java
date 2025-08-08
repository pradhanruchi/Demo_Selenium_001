package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScrollIntoView {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.vtiger.com/");
	    driver.get("https://www.dream11.com/");
		
		//WebElement getStarted = driver.findElement(By.linkText("Get Started"));
		WebElement getStarted = driver.findElement(By.xpath("//div[@class='universal_heading']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", getStarted);

	}

}
