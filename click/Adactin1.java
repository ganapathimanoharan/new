package org.click;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin1 {

	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void afterClass() {
		//driver.quit();

	}

	@Before
	public void beforeMethod() {
		long start = System.currentTimeMillis();
		System.out.println(start);

	}

	@After
	public void afterMethod() {
		long end = System.currentTimeMillis();
		System.out.println(end);

	}

	@Test
	public void login() throws InterruptedException {

		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys("ganapathi12345");

		WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
		txtPass.sendKeys("I280DX");

		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
		btnLogin.click();
		
		Thread.sleep(5000);

	}

}
