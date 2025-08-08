package seleniumassignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ToLearnDragAndDrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement photoFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(photoFrame);

		WebElement img1 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement img2 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement trash = driver.findElement(By.id("trash"));

		Actions act = new Actions(driver);
		act.dragAndDrop(img1, trash).perform();
		act.dragAndDrop(img2, trash).perform();

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@id='menu']//a[text()='CheatSheets']")).click();

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().forward();
		Thread.sleep(1000);

		driver.findElement(By.linkText("SQL Cheat Sheet")).click();

		Set<String> allWindowIds = driver.getWindowHandles();

		for (String id : allWindowIds) {
			driver.switchTo().window(id);
			if (driver.getCurrentUrl().contains("https://www.globalsqa.com/sql-cheat-sheet/")) {
				break;
			}
		}
		act.scrollByAmount(0, 1000).perform();

		String timestamp = LocalDateTime.now().toString().replace(":", "-");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + timestamp + ".png");
		FileHandler.copy(temp, dest);

		// System.out.println( driver.getTitle());

		Thread.sleep(Duration.ofSeconds(10));
		driver.quit();
	}

}
