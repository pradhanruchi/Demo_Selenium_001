package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Dimension size = driver.findElement(By.xpath("//input[@value='Search']")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		Dimension sizeS = driver.findElement(By.xpath("//input[@value='Subscribe']")).getSize();
		System.out.println(sizeS.getHeight());
		System.out.println(sizeS.getWidth());

	}

}
