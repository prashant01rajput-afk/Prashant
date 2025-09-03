package commondata.properties;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromeExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\rajpu\\eclipse-workspace\\vtiger-crm-framework-A11\\src\\test\\resources\\testScriptData.xlsx.xlsx");	
		
		 Workbook wb=WorkbookFactory.create(fis);
		 Sheet sh=wb.getSheet("org");
		 Row rb=sh.getRow(2);
		 Cell cl=rb.getCell(1);
		 String value=cl.getStringCellValue();
		 System.out.println(value);
		 
		 
		 
	
	 String BROWSER = wb.getSheet("org").getRow(0).getCell(1).getStringCellValue();
	
	System.out.println(BROWSER);
	
	
		
	}
	}



