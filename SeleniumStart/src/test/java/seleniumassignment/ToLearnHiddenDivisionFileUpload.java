package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnHiddenDivisionFileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/");
		
		driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\prachi pradhan\\Desktop\\resume Ruchi.pdf");
		
		
		

	}

}
