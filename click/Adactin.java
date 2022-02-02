package org.click;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class Adactin {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		LibGlobal a = new LibGlobal();
		
		a.getDriverChrome();
		
		a.maxWindow();
		
		a.loadUrl("https://adactinhotelapp.com/");
		
		WebElement element = a.findElementByXpath("//input[@id='username']");
		String cellValueFromXL = a.getCellValueFromXL("Sheet1", 1, 0);
		a.typeText(element, cellValueFromXL);
		
		WebElement element2 = a.findElementByXpath("//input[@id='password']");
		String cellValueFromXL2 = a.getCellValueFromXL("Sheet1", 1, 1);
		a.typeText(element2, cellValueFromXL2);
		
		WebElement element3 = a.findElementByXpath("//input[@id='login']");
		a.click(element3);
		
		WebElement element4 = a.findElementByXpath("//select[@id='location']");
		String cellValueFromXL3 = a.getCellValueFromXL("Sheet1", 1, 2);
		a.selectByText(element4, cellValueFromXL3);
		
		WebElement element5 = a.findElementByXpath("//select[@id='hotels']");
		String cellValueFromXL4 = a.getCellValueFromXL("Sheet1", 1, 3);
		a.selectByText(element5, cellValueFromXL4);
		
		WebElement element6 = a.findElementByXpath("//select[@id='room_type']");
		String cellValueFromXL5 = a.getCellValueFromXL("Sheet1", 1, 4);
		a.selectByText(element6, cellValueFromXL5);
		
		WebElement element7 = a.findElementByXpath("//select[@id='room_nos']");
		String cellValueFromXL6 = a.getCellValueFromXL("Sheet1", 1, 5);
		a.selectByText(element7, cellValueFromXL6);
		
		WebElement element8 = a.findElementByXpath("//select[@id='adult_room']");
		String cellValueFromXL7 = a.getCellValueFromXL("Sheet1", 1, 6);
		a.selectByText(element8, cellValueFromXL7);
		
		WebElement element9 = a.findElementByXpath("//select[@id='child_room']");
		String cellValueFromXL8 = a.getCellValueFromXL("Sheet1", 1, 7);
		a.selectByText(element9, cellValueFromXL8);
		
		WebElement element10 = a.findElementByXpath("//input[@id='Submit']");
		a.click(element10);
		
		WebElement element11 = a.findElementById("radiobutton_0");
		a.click(element11);
		
		WebElement element12 = a.findElementById("continue");
		a.click(element12);
		
		WebElement element13 = a.findElementByXpath("//input[@id='first_name']");
		String cellValueFromXL9 = a.getCellValueFromXL("Sheet1", 1, 8);
		a.typeText(element13, cellValueFromXL9);
		
		WebElement element14 = a.findElementByXpath("//input[@id='last_name']");
		String cellValueFromXL10 = a.getCellValueFromXL("Sheet1", 1, 9);
		a.typeText(element14, cellValueFromXL10);
		
		WebElement element15 = a.findElementByXpath("//textarea[@id='address']");
		String cellValueFromXL11 = a.getCellValueFromXL("Sheet1", 1, 10);
		a.typeText(element15, cellValueFromXL11);
		
		WebElement element16 = a.findElementByXpath("//input[@id='cc_num']");
		String cellValueFromXL12 = a.getCellValueFromXL("Sheet1", 1, 11);
		a.typeText(element16, cellValueFromXL12);
		
		WebElement element17 = a.findElementByXpath("//select[@id='cc_type']");
		String cellValueFromXL13 = a.getCellValueFromXL("Sheet1", 1, 12);
		a.selectByText(element17, cellValueFromXL13);
		
		WebElement element18 = a.findElementById("cc_exp_month");
		String cellValueFromXL14 = a.getCellValueFromXL("Sheet1", 1, 13);
		a.selectByText(element18, cellValueFromXL14);
		
		WebElement element19 = a.findElementById("cc_exp_year");
		String cellValueFromXL15 = a.getCellValueFromXL("Sheet1", 1, 14);
		a.selectByText(element19, cellValueFromXL15);
		
		WebElement element20 = a.findElementByXpath("//input[@id='cc_cvv']");
		String cellValueFromXL16 = a.getCellValueFromXL("Sheet1", 1, 15);
		a.typeText(element20, cellValueFromXL16);
		
		WebElement element21 = a.findElementById("book_now");
		a.click(element21);
		
		a.sleep(5000);
		
		WebElement element22 = a.findElementById("order_no");
		String attribute = a.getAttribute(element22);
		System.out.println(attribute);
		
		
	
	}

}
