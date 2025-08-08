package seleniumassignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnExcelFile {

	public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./TestData/TestScriptData1.xlsx");
	
	FileInputStream getProp=new FileInputStream("./TestData/commondata.properties");
	Properties prop = new Properties();
	prop.load(getProp);
	
	String url = prop.getProperty("url");
	System.out.println(url);
	
	Workbook wb = WorkbookFactory.create(fis);
	
	String firstname = wb.getSheet("Register").getRow(1).getCell(0).getStringCellValue();
	System.out.println(firstname);
	
	String lastname = wb.getSheet("Register").getRow(1).getCell(1).getStringCellValue();
	System.out.println(lastname);
	
	String email = wb.getSheet("Register").getRow(1).getCell(2).getStringCellValue();
	System.out.println(email);
	
	String password = wb.getSheet("Register").getRow(1).getCell(3).getStringCellValue();
	System.out.println(password);
	
	String confirmpassword = wb.getSheet("Register").getRow(1).getCell(4).getStringCellValue();
	System.out.println(confirmpassword);
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(url);
	
	driver.findElement(By.linkText("Register")).click();
	
	driver.findElement(By.id("FirstName")).sendKeys(firstname);
	driver.findElement(By.id("LastName")).sendKeys(lastname);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(password);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
	driver.findElement(By.id("register-button")).click();

	
	}

}
