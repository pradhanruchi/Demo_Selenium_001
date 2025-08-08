package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Point position = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
		System.out.println(position);
		
	Point positionP = driver.findElement(By.xpath("//input[@value='Subscribe']")).getLocation();
	System.out.println(positionP);

	}

}
