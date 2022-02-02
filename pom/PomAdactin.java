package org.pom;

import org.click.LibGlobal;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class PomAdactin extends LibGlobal {

	static WebElement driver;

	@BeforeClass
	public static void beforeClass() {

		getDriverChrome();
		loadUrl("https://adactinhotelapp.com/");
		maxWindow();

	}

	@AfterClass
	public static void afterClass() {

		quitWindow();

	}

	@Test
	public void loginPage() throws InterruptedException {

		Login login = new Login();
		login.login("ganapathi12345", "I280DX");

		SearchHotel searchHotel = new SearchHotel();
		searchHotel.searchHotel("Sydney", "Hotel Creek", "Standard", "1 - One", "31/01/2022", "14/02/2022", "3 - Three",
				"3 - Three");

		SelectHotel selectHotel = new SelectHotel();
		selectHotel.selectHotel();

		BookHotel bookHotel = new BookHotel();
		bookHotel.bookHotel("Ganapathi", "Manoharan", "Greens Techonology", "9988776655445566", "American Express",
				"May", "2022", "5566");

		CancelBooking cancelBooking = new CancelBooking();
		cancelBooking.cancelBooking();
	}
}
