package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCssRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		String backgroundcolor = driver.findElement(By.xpath("//button[@class='button buttonBlue']")).getCssValue("background-image");
        System.out.println(backgroundcolor);
        
       Rectangle rect = driver.findElement(By.xpath("//button[@class='button buttonBlue']")).getRect();
       System.out.println(rect.getHeight());
       System.out.println(rect.getWidth());
       System.out.println(rect.getX());
       System.out.println(rect.getY());
	}

}
