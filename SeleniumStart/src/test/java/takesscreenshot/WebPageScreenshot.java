package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot {

	public static void main(String[] args) throws IOException {
       String timestamp = LocalDateTime.now().toString().replace(":", "-");	
       
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
       
		//driver.get("https://www.flipkart.com/"); //while repalce previous url to new url
		driver.get("https://www.redbus.in/");
        
        TakesScreenshot ts = (TakesScreenshot)driver;
        File temp = ts.getScreenshotAs(OutputType.FILE);//temprory screenshot
        File dest = new File("./screenshot/"+timestamp+".png");//here destionation
        FileHandler.copy(temp, dest);
        
        

	}

}
