package org.click;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavanFrame {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Elanchezhiyan\\eclipse-workspace\\Maven\\ExcelSheet\\FrameData.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("gana1");
		for(int i=0; i<sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for(int j=0; j<row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int code = cell.getCellType();
				
				if(code==1) {
					String string = cell.getStringCellValue();
					System.out.println(string);
				}
				if(code==0) {
					if(DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM-dd-yy");
					String format = dateFormat.format(date);
					System.out.println(format);
				}
					else{
					double d = cell.getNumericCellValue();
					long l =(long) d;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
				}
				
				}
				
			}
			System.out.println();
		}
	}
}


