package com.crm.genericUtilities;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * it is developed using Apache Poi libraries, which used to handle microsoft excel sheet
 * @author Darshan
 *
 */
public class ExcelUtility {



	/**
	 * it is used to read data from excel-workbook based on below
	 * @return
	 */
	public String readDataFromExcel(String sheetName,int rowNum,int cellNum) throws Throwable{
		FileInputStream fileInputStream=new FileInputStream(IConstants.excelPath);
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String data = cell.toString();

		return data;
	}
	
	/**
	 * it is used to write data back to excel based on below parameter
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Throwable
	 */
	public void writeDataIntoExcel(String sheetName,int rowNum,int cellNum,String data) throws Throwable{
		FileInputStream fileInputStream=new FileInputStream(IConstants.excelPath);
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream fileOutputStream=new FileOutputStream(IConstants.excelPath);
		workbook.write(fileOutputStream);
	}

	public static String getData(String excelpath, String sheetName, int i, int j) throws Throwable {
		// TODO Auto-generated method stub
		String objArray=null;
		FileInputStream fileInputStream=new FileInputStream(IConstants.excelPath);
		Workbook workbook = WorkbookFactory.create(fileInputStream);
		objArray = workbook.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
		
		return objArray;
	}
}