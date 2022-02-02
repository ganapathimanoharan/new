package org.sample;

import org.click.LibGlobal;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking extends LibGlobal {
	
	public CancelBooking() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderNo;

	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement containsText;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement click;

//	@FindBy(xpath = "//td[contains(text(),'Search Order Id ')]")
//	private WebElement containsText1;

	@FindBy(xpath = "//input[@name='order_id_text']")
	private WebElement txtBox;

	@FindBy(id = "search_hotel_id")
	private WebElement hotelId;

	@FindBy(xpath = "//input[contains(@name,'btn_id_')]")
	private WebElement click1;

	@FindBy(id = "search_result_error")
	private WebElement msgOk;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getContainsText() {
		return containsText;
	}

//	public WebElement getContainsText1() {
//		return containsText1;
//	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getTxtBox() {
		return txtBox;
	}

	public WebElement getHotelId() {
		return hotelId;
	}

	public WebElement getClick() {
		return click1;
	}

	public WebElement getMsgOk() {
		return msgOk;
	}

	public void cancelBooking() throws InterruptedException {

		sleep(5000);
		String attribute = getAttribute(getOrderNo());
		String text = getText(getContainsText());
		boolean b = boolea(text, "Booking Confirmation");
		assertion("Verify text Ok", b);
		sysout(text);
		click(click);
//		String text2 = getText(getContainsText1());
//		boolean c = boolea(text, "Search Order Id ");
//		assertion("Verify text Ok", c);
//		sysout(text2);
		typeText(getTxtBox(), attribute);
		click(getHotelId());
		click(getClick());
		alert();
		String text3 = getText(getMsgOk());
		sysout(text3);

	}
}
