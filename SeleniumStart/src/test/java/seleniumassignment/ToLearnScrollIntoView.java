package seleniumassignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnScrollIntoView {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		driver.get("https://www.dream11.com/");
		
		WebElement getStarted = driver.findElement(By.linkText("Help & Support"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", getStarted);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+timestamp+".png");
		FileHandler.copy(temp, dest);
		
		driver.findElement(By.linkText("Help & Support")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			Thread.sleep(1000);
			@Nullable
			String actUrl = driver.getCurrentUrl();
			if(actUrl.equals("https://get.dream11.help/hc/en-us")) {
				break;
			}
		}
		WebElement searchBtn = driver.findElement(By.xpath("//form[@class='search search-full desktop_serch']/.//input[@name='commit']"));
		String backGroundclr = searchBtn.getCssValue("background-color");
		System.out.println(backGroundclr);
		
	Rectangle rect = searchBtn.getRect();
	System.out.println(rect.getX());
	System.out.println(rect.getY());
	System.out.println(rect.getHeight());
	System.out.println(rect.getWidth());
	
	WebElement searchTf = driver.findElement(By.xpath("//form[@class='search search-full desktop_serch']/.//input[@placeholder='Type your query here…']"));
	JavascriptExecutor je = (JavascriptExecutor)driver;
	je.executeScript("arguments[0].value='cricket'", searchTf);
	Thread.sleep(1000);
	
	je.executeScript("arguments[0].click()", searchBtn);
	Thread.sleep(1000);
	
	temp = ts.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(temp, dest);
	
	}

}
