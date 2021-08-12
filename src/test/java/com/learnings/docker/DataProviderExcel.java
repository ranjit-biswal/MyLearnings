package com.learnings.docker;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderExcel {

	@Test(dataProvider = "TestData")
	public void getTest(String Name, String SurName, String State) {
		System.out.println(Name + " " + SurName + " " + State);

	}

	DataFormatter formatter = new DataFormatter();
	@DataProvider(name = "TestData")
	public Object[][] getData() throws IOException {

		FileInputStream fis = new FileInputStream(
				"D:\\workspace\\MyLearnings\\docker\\src\\test\\java\\resource\\UserDetails.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		int rowsCount = sh.getPhysicalNumberOfRows();
		XSSFRow row = sh.getRow(0);
		int columnCount = row.getLastCellNum();

		Object data[][] = new Object[rowsCount - 1][columnCount];
		for (int iRow = 0; iRow < rowsCount - 1; iRow++) {
			row = sh.getRow(iRow + 1);
			for (int iColumn = 0; iColumn < columnCount; iColumn++) {
				
				XSSFCell cell =row.getCell(iColumn);
				data[iRow][iColumn] = formatter.formatCellValue(cell);
			}
		}
		return data;

	}

}
