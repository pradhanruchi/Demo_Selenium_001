package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Rectangle rect1 = driver.findElement(By.xpath("//input[@value='Search']")).getRect();
		System.out.println(rect1.getHeight());
		System.out.println(rect1.getWidth());
		System.out.println(rect1.getX());
		System.out.println(rect1.getY());
		
		Rectangle rect = driver.findElement(By.xpath("//input[@value='Vote']")).getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());

	}

}
