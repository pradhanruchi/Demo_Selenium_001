package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelaNumber {

	public static void main(String[] args) throws IOException {

		// Step 1:create FileInputStream object
		FileInputStream fis = new FileInputStream("./TestData/TestScriptData.xlsx");
		
		//Step 2:create respective file type object
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step 3: call read methods
		int price = (int) wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(price);
		
		boolean status = wb.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(status);
		
		LocalDateTime date = wb.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
		System.out.println(date);
		

	}

}
