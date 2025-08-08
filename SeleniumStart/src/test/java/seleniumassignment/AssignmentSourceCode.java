package seleniumassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSourceCode {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		System.out.println(title);
        
		
		if(title.equals("Bus Ticket Booking Online at Cheapest Price with Top Bus Operators- redBus"))
			System.out.println("Welcome page is displayed");
		else {
			System.out.println("Welcome pge is not displayed");
		}
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
	}

}
