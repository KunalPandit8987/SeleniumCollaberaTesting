package automationScriptsReadDataFromExcel;

import java.io.File;
/***
 * 
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author Kunal
 *
 */

public class ExcelUtility {
static String excelPath="./testResources/testData.xlsx";
	
	public static String readStringData(String sheetName, int rowNum, int cellNum)  {
		Workbook workbook = null;
		
		try {
			 File absPath = new File(excelPath);
			 FileInputStream fis = new FileInputStream(absPath);
			
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	public Boolean readBooleanData(String sheetName, int rowNum, int cellNum)  {
		Workbook workbook = null;
		
		try {
			 File absPath = new File(excelPath);
			 FileInputStream fis = new FileInputStream(absPath);
			
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
	}

	public Date readData(String sheetName, int rowNum, int cellNum)  {
		Workbook workbook = null;
		
		try {
			 File absPath = new File(excelPath);
			 FileInputStream fis = new FileInputStream(absPath);
			
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getDateCellValue();
	}
	public Double readDouble(String sheetName, int rowNum, int cellNum)  {
		Workbook workbook = null;
		
		try {
			 File absPath = new File(excelPath);
			 FileInputStream fis = new FileInputStream(absPath);
			
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
	}
}
