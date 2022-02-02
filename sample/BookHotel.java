package org.sample;

import org.click.LibGlobal;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends LibGlobal {

	public BookHotel() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement containsText;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement ccNumber;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement ccType;

	@FindBy(id = "cc_exp_month")
	private WebElement ccExpMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement ccExpYear;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement ccCVV;

	@FindBy(id = "book_now")
	private WebElement click;

	public WebElement getContainsText() {
		return containsText;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNumber() {
		return ccNumber;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCcCVV() {
		return ccCVV;
	}

	public WebElement getClick() {
		return click;
	}

	public void bookHotel(String fName, String lName, String add, String ccNum, String cardType, String month,
			String year, String cvv) throws InterruptedException {

		String text = getText(getContainsText());
		boolean b = boolea(text, "Book A Hotel");
		assertion("Verify text Ok", b);
		sysout(text);
		typeText(getFirstName(), fName);
		typeText(getLastName(), lName);
		typeText(getAddress(), add);
		typeText(getCcNumber(), ccNum);
		selectByText(getCcType(), cardType);
		selectByText(getCcExpMonth(), month);
		selectByText(getCcExpYear(), year);
		typeText(getCcCVV(), cvv);
		click(getClick());

	}

}
