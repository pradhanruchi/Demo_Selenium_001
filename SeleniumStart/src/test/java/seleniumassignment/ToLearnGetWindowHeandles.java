package seleniumassignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHeandles {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		String title=driver.getTitle();
		System.out.println(title);
		//System.out.println(driver.getTitle()); all use like this
		
		driver.manage().window().setSize(new Dimension(500, 400));
		
		String windowId=driver.getWindowHandle();
		System.out.println(windowId);
		
		driver.quit();
		
		
		
	}

}
