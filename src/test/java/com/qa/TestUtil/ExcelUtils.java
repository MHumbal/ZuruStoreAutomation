package com.qa.TestUtil;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook wb = null;
	static XSSFSheet sheet = null;

	public ExcelUtils(String excelPath,String sheetName) {

		try {

			wb = new XSSFWorkbook(excelPath);
			sheet = wb.getSheet(sheetName);

		}catch(Exception e) {

			e.printStackTrace();

		}

	}

	public int getRowCount() {
		int rowCount = 0;
		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of Rows : "+rowCount);

		}catch(Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
		return rowCount;

	}

	public int getColumnCount() {
		int colCount = 0;
		try {

			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of Cols : "+colCount);

		}catch(Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
		return colCount;

	}

	public Cell getCellData(int rowNum, int colNum) {

		Cell cellData = null;

		try {
				cellData = sheet.getRow(rowNum).getCell(colNum);
		
		}catch(Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
		System.out.println("celdata from getcelldata" + cellData);
		return cellData;

	}
	
	

}
