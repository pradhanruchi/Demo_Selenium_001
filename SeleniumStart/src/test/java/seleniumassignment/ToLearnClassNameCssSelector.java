package seleniumassignment;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClassNameCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
		
		String eTitle="Demo Web Shop. Login";
		@Nullable
		String aTitle = driver.getTitle();
		
		if(eTitle.equals(aTitle)) {
			System.out.println("Login page is displayed");
		}
			else {
				System.out.println("Login page not displayed");
			}
		
		driver.findElement(By.className("email")).sendKeys("ruchipradhan09@gmail.com");
		driver.findElement(By.className("password")).sendKeys("ruchi123@");
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		}
		
	}

