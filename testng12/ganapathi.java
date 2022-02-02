package org.testng12;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.click.LibGlobal;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ganapathi extends LibGlobal {

	//@Parameters({ "username", "password" })
	@Test(priority = 1)
	private void login() throws IOException {

		getDriverEdge();
		loadUrl("https://adactinhotelapp.com/");
		maxWindow();
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s1);
//
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(s2);
//
//		driver.findElement(By.xpath("//input[@id='login']")).click();

	}

//	@Parameters({ "location", "hotels", "roomtype", "roomnos", "adultroom", "childroom" })
//	@Test(priority = 2)
//	private void searchHotel(String s1, String s2, String s3, String s4, String s5, String s6) throws IOException {
//		WebElement element = driver.findElement(By.xpath("//select[@id='location']"));
//		Select se = new Select(element);
//		se.selectByVisibleText(s1);
//
//		WebElement element2 = driver.findElement(By.xpath("//select[@id='hotels']"));
//		Select se1 = new Select(element2);
//		se1.selectByVisibleText(s2);
//
//		WebElement element3 = driver.findElement(By.xpath("//select[@id='room_type']"));
//		Select se2 = new Select(element3);
//		se2.selectByVisibleText(s3);
//
//		WebElement element4 = driver.findElement(By.xpath("//select[@id='room_nos']"));
//		Select se3 = new Select(element4);
//		se3.selectByVisibleText(s4);
//
//		WebElement element5 = driver.findElement(By.xpath("//select[@id='adult_room']"));
//		Select se4 = new Select(element5);
//		se4.selectByVisibleText(s5);
//
//		WebElement element6 = driver.findElement(By.xpath("//select[@id='child_room']"));
//		Select se5 = new Select(element6);
//		se5.selectByVisibleText(s6);
//
//		driver.findElement(By.xpath("//input[@id='Submit']")).click();
//	}
//
//	@Parameters
//	@Test(priority = 3)
//	private void selectHotel() {
//
//		driver.findElement(By.id("radiobutton_0")).click();
//
//		driver.findElement(By.id("continue")).click();
//
//	}
//
//	@Parameters({ "firstName", "lastName", "address", "cardno", "cardtype", "expmonth", "expyear", "cvvno" })
//	@Test(priority = 4)
//	private void bookHotel(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
//
//		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(s1);
//
//		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(s2);
//
//		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(s3);
//
//		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys(s4);
//
//		driver.findElement(By.xpath("//select[@id='cc_type']")).sendKeys(s5);
//		
////		WebElement element = driver.findElement(By.xpath("//select[@id='cc_type']"));
////		Select se = new Select(element);
////		se.selectByVisibleText(s5);
//
//		WebElement element2 = driver.findElement(By.id("cc_exp_month"));
//		Select se2 = new Select(element2);
//		se2.selectByVisibleText(s6);
//
//		WebElement element3 = driver.findElement(By.id("cc_exp_year"));
//		Select se3 = new Select(element3);
//		se3.selectByVisibleText(s7);
//
//		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys(s8);
//
//		driver.findElement(By.id("book_now")).click();
//	}
//
//	@Parameters
//	@Test(priority = 5)
//	private void cancelHotel() throws InterruptedException {
//
//
//		WebElement element = driver.findElement(By.id("order_no"));
//		String attribute = getAttribute(element);
//		System.out.println(attribute);
//
//		driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
//
//		driver.findElement(By.xpath("//input[@name='order_id_text']")).sendKeys(attribute);
//
//		driver.findElement(By.id("search_hotel_id")).click();
//
//
//		driver.findElement(By.xpath("//input[contains(@name,'btn_id_')]")).click();
//
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//
//		WebElement element28 = driver.findElement(By.id("search_result_error"));
//		String text = element28.getText();
//		System.out.println(text);
//
//	}

}
