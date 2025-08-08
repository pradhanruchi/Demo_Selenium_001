package assignment.pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) throws IOException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis= new FileInputStream("./TestData/demoworkshop.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		FileInputStream excel=new FileInputStream("./TestData/demoworkshop.xlsx");
		Workbook wb= WorkbookFactory.create(excel);
		
		
			
		driver.get(prop.getProperty("url"));
		
		
		WelcomePage wp=new WelcomePage(driver);
		wp.getRegisterLink().click();
		
		RegisterPage rp= new RegisterPage(driver);
		rp.getFirstName().sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
		rp.getLastName().sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
		rp.getEmail().sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue());
		rp.getPassword().sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue());
		rp.getConfirmPassword().sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue());
		rp.getRegisterButton().click();
	}

}
