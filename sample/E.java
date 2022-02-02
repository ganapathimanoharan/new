package org.sample;

import org.click.LibGlobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class E extends LibGlobal {

	@BeforeClass
	public static void beforeClass() {
	
		getDriverChrome();
		loadUrl("https://www.facebook.com/");
		

	}

	@AfterClass
	public static void afterClass() {
	
		quitWindow();
	}

	@Test
	public void test1() {
		
		Login a = new Login();
		
		typeText(a.getTxtUserName(), "ganapathi");
		long startWithOutCatch = System.currentTimeMillis();
		for(int i= 0; i<1000; i++) {
			String attribute = getAttribute(a.getTxtUserName());
		}
		long endWithOutCatch = System.currentTimeMillis();
		sysout("WithOutCatch" + (endWithOutCatch-startWithOutCatch)/1000);
		navigateRef();
		typeText(a.getTxtUserName1(), "ganapathi manoharan");
		long startWithCatch = System.currentTimeMillis();
		for(int i= 0; i<1000; i++) {
			String attribute = getAttribute(a.getTxtUserName1());
		}
		long endWithCatch = System.currentTimeMillis();
		sysout("WithCatch" + (endWithCatch-startWithCatch)/1000);
		
		
		
	}

}
