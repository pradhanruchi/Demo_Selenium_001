package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method 
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
        driver.get("https://petdiseasealerts.org/forecast-map/#/");
        

	}

}
