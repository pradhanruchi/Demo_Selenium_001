package seleniumassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnExcelFile2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/TestScriptData3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		FileInputStream pFis = new FileInputStream("./TestData/commondata.properties");
		Properties prop = new Properties();
		prop.load(pFis);
		
		String email = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(email);
		
		 String password = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
         System.out.println(password);
         
       String fullname = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
       System.out.println(fullname);
       
       String username = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
       System.out.println(username);
              
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		driver.get(url);

		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys(fullname);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		
		
		
		
		
		
	}

}
