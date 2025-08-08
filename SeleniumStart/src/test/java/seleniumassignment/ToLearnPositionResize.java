package seleniumassignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPositionResize {

    public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to(new URL("https://www.myntra.com/"));
		Point position = driver.manage().window().getPosition();

		driver.manage().window().setPosition(new Point(350,300));
		
		Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		
		driver.manage().window().setSize(new Dimension(500,400));
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.quit();

	}

}
