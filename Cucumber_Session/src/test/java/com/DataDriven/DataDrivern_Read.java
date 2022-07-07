package com.DataDriven;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import org.apache.poi.ss.usermodel.*;

public class DataDrivern_Read {
	
	public static void readAllData() throws IOException 
	{
		System.out.println("***All Data***");	
		File file = new File("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\MavenProjectSession\\src\\test\\java\\com\\DataDriven\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("TestData1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			
			Row row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) 
			{
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if(cellType.equals(CellType.STRING))
				{
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else if(cellType.equals(CellType.NUMERIC))
				{
					double numericCellValue = cell.getNumericCellValue();
					int num = (int) numericCellValue;
					System.out.println(num);
				}
			}	
		}
	}
	
	public static String getCellData(String sheetname, String ColumnName,int rowNumber) throws Exception
	{
		System.out.println("***Get Single Cell Data***");
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\DataDriven\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		Row row = sheet.getRow(0);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		int columnNumber=0;
		String stringCellValue=null;
		for (int i = 0; i < physicalNumberOfCells; i++) 
		{
			Cell cell = row.getCell(i);
			if(cell.getStringCellValue().equals(ColumnName))
			{
				columnNumber =i;
				break;
			}
			else if(i==physicalNumberOfCells-1)
				throw new Exception("No Such ColumnName is Present");
		}
		Cell cell = wb.getSheet(sheetname).getRow(rowNumber).getCell(columnNumber);
		try {
		stringCellValue = cell.getStringCellValue();
		}
		catch(Exception e)
		{
			double numericCellValue = cell.getNumericCellValue();
			int num =(int) numericCellValue;
			stringCellValue = ""+num;
		}
		return stringCellValue;
	}

	public static void main(String[] args) throws Exception 
	{
		readAllData();
//		String cellData = getCellData("TestData1","birthyear",6);
//		System.out.println("\n"+cellData);
	}

}
