package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String tagname = driver.findElement(By.linkText("Register")).getTagName();
		System.out.println(tagname);
		
		String search = driver.findElement(By.linkText("Search")).getTagName();
		System.out.println(search);

	}

}
