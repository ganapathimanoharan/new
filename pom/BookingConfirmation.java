package org.pom;

import org.click.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends LibGlobal {
	
	public BookingConfirmation() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement pnr;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement click;
	
	public WebElement getPnr() {
		return pnr;
	}

	public WebElement getClick() {
		return click;
	}

	public void BookingPnr() {
	
		String attribute = getAttribute(getPnr());
		System.out.println(attribute);
		click(getClick());
	}
}
