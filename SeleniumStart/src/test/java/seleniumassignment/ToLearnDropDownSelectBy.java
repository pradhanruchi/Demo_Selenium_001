package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnDropDownSelectBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://x.com/");
		
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		WebElement month = driver.findElement(By.xpath("//span[text()='Month']/../..//select[@aria-invalid='false']"));
		Select monsel = new Select(month);
		monsel.selectByVisibleText("December");
		
		WebElement day = driver.findElement(By.xpath("//span[text()='Day']/../..//select[@aria-invalid='false']"));
		Select daysel = new Select(day);
		daysel.selectByValue("16");
		
		WebElement year = driver.findElement(By.xpath("//span[text()='Year']/../..//select[@aria-invalid='false']"));
		Select yearsel = new Select(year);
		yearsel.selectByValue("2024");
		

	}

}
