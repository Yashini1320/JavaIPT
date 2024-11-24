package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public static String readParticularCellData(String sheetname,int rows, int columns) throws InvalidFormatException, IOException {
		File file = new File("C:\\Users\\VASANTH\\OneDrive\\Desktop\\Yash\\Advanced\\TaskExcel.xlsx");
		Workbook book = new XSSFWorkbook(file);
		
		Sheet sheet = book.getSheet("Sheet1");
		 Row row = sheet.getRow(rows);
		 Cell cell = row.getCell(columns);
		 DataFormatter dataformat = new DataFormatter();
		 String Data = dataformat.formatCellValue(cell);
		// String Data = cell.getStringCellValue();
		 System.out.println(Data);
		return Data;
		 	
	}
	
//	public static void getAllCellData() throws InvalidFormatException, IOException {
//		File file = new File("C:\\Users\\VASANTH\\OneDrive\\Desktop\\Yash\\Advanced\\TaskExcel.xlsx");
//		Workbook book = new XSSFWorkbook(file);
//		book.getSheet("Sheet1");
//	
//	}

	public static void main (String[] args) throws InvalidFormatException, IOException {
		String particularData = readParticularCellData("Sheet",2,1);
		System.out.println(particularData);
		
	}

}
