package automationScriptsReadDataFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelLib {
	static String excelPath = "./testResources/testData.xlsx";

	public static String readStringData(String sheetName, int rowNum, int cellNum) {
	
		Workbook workbook = null;
		
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		   } catch (FileNotFoundException e) {
			e.printStackTrace();
				
			} catch (EncryptedDocumentException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		
			return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		}
	}

