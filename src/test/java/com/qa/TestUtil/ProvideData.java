package com.qa.TestUtil;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

public class ProvideData {
	
	public static Object[][] testData(String excelPath, String sheetName) throws EncryptedDocumentException, IOException {

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColumnCount();

		Object data[][] = new Object[rowCount-1][colCount];

		int i, j;
		for(i=1; i<rowCount; i++) {
			System.out.println();
			for(j=0; j<colCount; j++) {
				
				Cell c= excel.getCellData(i, j);

				if(c.getCellType() == CellType.NUMERIC) {
					int d = (int) c.getNumericCellValue();
					data[i-1][j] = d;
					//System.out.println("cellData.getCellType(): " + c.getCellType());
				}
				
				if(c.getCellType() == CellType.STRING) {
					String d1 = c.toString(); 
					data[i-1][j] = d1;
					//System.out.println("cellData.getCellType(): " + c.getCellType());
				}
			}

		}
		System.out.println("Data from testData" + data);
		return data;
	}

}
