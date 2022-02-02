package org.click;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class AdactinJunit extends LibGlobal {

	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		getDriverChrome();
		loadUrl("https://adactinhotelapp.com/");
		maxWindow();

	}

	@AfterClass
	public static void afterClass() {

		// quitWindow();

	}

	@Test
	public void login() throws IOException, InterruptedException {

		WebElement element = findElementByXpath("//input[@id='username']");
		typeText(element, getCellValueFromXL("Sheet1", 1, 0));

		WebElement element2 = findElementByXpath("//input[@id='password']");
		typeText(element2, getCellValueFromXL("Sheet1", 1, 1));

		WebElement element3 = findElementByXpath("//input[@id='login']");
		click(element3);

		WebElement element27 = findElementByXpath("//td[text()='Search Hotel ']");
		String text2 = element27.getText();
		boolean b = text2.contains("Search Hotel");
		Assert.assertTrue("Verify Tittle", b);
		sysout(text2);

		WebElement element4 = findElementByXpath("//select[@id='location']");
		selectByText(element4, getCellValueFromXL("Sheet1", 1, 2));

		WebElement element5 = findElementByXpath("//select[@id='hotels']");
		selectByText(element5, getCellValueFromXL("Sheet1", 1, 3));

		WebElement element6 = findElementByXpath("//select[@id='room_type']");
		selectByText(element6, getCellValueFromXL("Sheet1", 1, 4));

		WebElement element7 = findElementByXpath("//select[@id='room_nos']");
		selectByText(element7, getCellValueFromXL("Sheet1", 1, 5));

		WebElement element8 = findElementByXpath("//select[@id='adult_room']");
		selectByText(element8, getCellValueFromXL("Sheet1", 1, 6));

		WebElement element9 = findElementByXpath("//select[@id='child_room']");
		selectByText(element9, getCellValueFromXL("Sheet1", 1, 7));

		WebElement element10 = findElementByXpath("//input[@id='Submit']");
		click(element10);

		WebElement element29 = findElementByXpath("//td[text()='Select Hotel ']");
		String text3 = element29.getText();
		boolean c = text3.contains("Select Hotel");
		Assert.assertTrue("Verify Tittle", c);
		sysout(text3);

		WebElement element11 = findElementById("radiobutton_0");
		click(element11);

		WebElement element12 = findElementById("continue");
		click(element12);

		WebElement element30 = findElementByXpath("//td[text()='Book A Hotel ']");
		String text4 = element30.getText();
		boolean d = text4.contains("Book A Hotel");
		Assert.assertTrue("Verify Tittle", d);
		sysout(text4);

		WebElement element13 = findElementByXpath("//input[@id='first_name']");
		typeText(element13, getCellValueFromXL("Sheet1", 1, 8));

		WebElement element14 = findElementByXpath("//input[@id='last_name']");
		typeText(element14, getCellValueFromXL("Sheet1", 1, 9));

		WebElement element15 = findElementByXpath("//textarea[@id='address']");
		typeText(element15, getCellValueFromXL("Sheet1", 1, 10));

		WebElement element16 = findElementByXpath("//input[@id='cc_num']");
		typeText(element16, getCellValueFromXL("Sheet1", 1, 11));

		WebElement element17 = findElementByXpath("//select[@id='cc_type']");
		selectByText(element17, getCellValueFromXL("Sheet1", 1, 12));

		WebElement element18 = findElementById("cc_exp_month");
		selectByText(element18, getCellValueFromXL("Sheet1", 1, 13));

		WebElement element19 = findElementById("cc_exp_year");
		selectByText(element19, getCellValueFromXL("Sheet1", 1, 14));

		WebElement element20 = findElementByXpath("//input[@id='cc_cvv']");
		typeText(element20, getCellValueFromXL("Sheet1", 1, 15));

		WebElement element21 = findElementById("book_now");
		click(element21);

		sleep(5000);

		WebElement element22 = findElementById("order_no");
		String attribute = getAttribute(element22);
		System.out.println(attribute);

		WebElement element31 = findElementByXpath("//td[text()='Booking Confirmation ']");
		String text5 = element31.getText();
		boolean e = text5.contains("Booking Confirmation");
		Assert.assertTrue("Verify Tittle", e);
		sysout(text5);

		WebElement element23 = findElementByXpath("//a[text()='Booked Itinerary']");
		click(element23);

		WebElement element24 = findElementByXpath("//input[@name='order_id_text']");
		typeText(element24, attribute);

		WebElement element25 = findElementById("search_hotel_id");
		click(element25);

		sleep(5000);

		WebElement element26 = findElementByXpath("//input[contains(@name,'btn_id_')]");
		click(element26);

		alert();

		WebElement element28 = findElementById("search_result_error");
		String text = element28.getText();
		sysout(text);

	}

}
