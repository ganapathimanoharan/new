package org.click;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAuto {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement dropSkills = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select se = new Select(dropSkills);
		List<WebElement> options = se.getOptions();
		int size = options.size();
		System.out.println(size);
		File file = new File("C:\\Users\\Elanchezhiyan\\eclipse-workspace\\Maven\\ExcelSheet\\Auto.xlsx");
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Ganaa");
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String text = element.getText();
			System.out.println(text);
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
		}
			FileOutputStream o = new FileOutputStream(file);
			workbook.write(o);
	}
}
		