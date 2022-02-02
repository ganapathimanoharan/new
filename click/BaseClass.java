package org.click;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {
	public void writeData(String sheetname, int rowno, int cellno, String data) throws IOException {
	
		File file = new File("C:\\Users\\Elanchezhiyan\\eclipse-workspace\\Maven\\ExcelSheet\\gana.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell createCell = row.createCell(cellno);
		createCell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

}
