package seleniumassignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSourceCodeSize {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.instagram.com/");
		
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		
		Dimension  size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		driver.manage().window().setSize(new Dimension(450,250));
		
	}

}
