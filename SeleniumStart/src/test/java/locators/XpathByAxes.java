package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
     
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/prachi%20pradhan/OneDrive/Desktop/MovieTable.html");
		
		String position = driver.findElement(By.xpath("//td[text()='Bahubali']/preceding-sibling::td")).getText();
		System.out.println(position);
	}

}
