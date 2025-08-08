package webDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		String title =driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
        System.out.println("Welcome page is displayed");
	
	else {
		System.out.println("Welcome page is not displayed");
	}
	}
}
