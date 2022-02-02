package org.testng12;

import java.io.IOException;

import org.click.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mgana extends LibGlobal {

	@Test(dataProvider = "amazon")
	private void getData(String s1) {

		getDriverChrome();
		loadUrl("https://www.amazon.in/");
		maxWindow();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s1 + Keys.ENTER);

	}

	@DataProvider(name = "amazon")
	public Object[][] dataProvider() {
		return new Object[][] { { "iphone xr" }, { "nokia 1100" }
//			{ "sony headphones" }, { "huawei phone" },
//				{ "settle Rocket" }, { "fasttrack watch" }, { "sony 55 inch screen tv" }, { "shirt for men" },
//				{ "pendrive" }, { "harddisk" }, { "labtop" }, { "compaq 510 battery" }, { "keyboard for labtop" },
//				{ "screen cleaning liquid" }

		};

	}
}
