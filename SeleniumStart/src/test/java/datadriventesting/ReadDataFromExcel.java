package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Step 1: Create FileInputStream Object
		FileInputStream fis=new FileInputStream("./TestData/TestScriptData.xlsx");
		
		// Step 2: Create respective file type object
		Workbook wb= WorkbookFactory.create(fis);
		
		// Step 3: call read methods
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
		String email = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(email);
		
		String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(password);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		
		

	}

}
