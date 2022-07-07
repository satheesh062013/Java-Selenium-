package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver_WRITE {
	
	public static void write_Data(String newSheetName) throws IOException
	{
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\DataDriven\\TestData_WRITE.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);	
		try {
		Sheet createSheet = wb.createSheet(newSheetName);
		System.out.println("The new Sheet is Created with:   "+newSheetName);
		}
		catch(Exception e)
		{
			System.out.println("The Given SheetName is Already Exists. Try the New One");
			e.printStackTrace();
		}	
		String cellValues[][] = {
								   {"FIRSTNAME","SURNAME","BIRTH_YEAR","GENDER"},//Row 0 & Cell(0,1,2,3) Values
								   {"Satheeshkumar","Sekar","1988","Male"},		 //Row 1 & Cell(0,1,2,3) Values
								   {"Saipranav","Satheeshkumar","2017","Male"},	 //Row 2 & Cell(0,1,2,3)Values
								   {"Karthika","Satheeshkumar","1990","FeMale"}, //Row 3 & Cell(0,1,2,3)Values
								   {"Subbulakshmi","Sekar","1962","FeMale"}, 	 //Row 4 & Cell(0,1,2,3)Values
								   {"Sekar","Veerasamy","1960","Male"},		 	 //Row 5 & Cell(0,1,2,3) Values
								 };
		
		int No_OfRows = cellValues.length;
		System.out.println("No.Of Rows Present: "+No_OfRows);
		
		int No_OfColumns = cellValues[0].length;
		System.out.println("No.Of Columns Present: "+No_OfColumns);
		
		for (int i = 0; i < No_OfRows; i++) 
		{
			Row createRow = wb.getSheet(newSheetName).createRow(i);
			
			for (int j = 0; j < No_OfColumns; j++) 
			{
				Cell createCell = createRow.createCell(j);
				createCell.setCellValue(cellValues[i][j]);
			}
		}
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
	}

	public static void main(String[] args) throws IOException {
		write_Data("TestData's");
	}
}
