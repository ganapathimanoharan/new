package org.pom;

import org.click.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends LibGlobal {
	
	public SearchHotel() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Search Hotel ']")
	private WebElement containsText;

	@FindBy(xpath = "//select[@id='location']")
	private WebElement dropDownLocation;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement dropDownHotels;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement dropDownRoomType;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement noOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement inDate;

	@FindBy(id = "datepick_out")
	private WebElement outDate;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultRoom;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childRoom;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submit;
	

	public WebElement getContainsText() {
		return containsText;
	}

	public WebElement getDropDownLocation() {
		return dropDownLocation;
	}

	public WebElement getDropDownHotels() {
		return dropDownHotels;
	}

	public WebElement getDropDownRoomType() {
		return dropDownRoomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void searchHotel(String location, String hotels, String roomType, String noOfRoom, String indate, String outdate, String roomAdult, String roomChild) {
	
	String text = getText(getContainsText());
	boolean b = boolea(text, "Search Hotel");
	assertion("Verify text Ok", b);
	System.out.println(text);
	selectByText(getDropDownLocation(), location);
	selectByText(getDropDownHotels(), hotels);
	selectByText(getDropDownRoomType(), roomType);
	selectByText(getNoOfRooms(), noOfRoom);
	typeText(getInDate(), indate);
	typeText(getOutDate(), outdate);
	selectByText(getAdultRoom(), roomAdult);
	selectByText(getChildRoom(), roomChild);
	click(getSubmit());
	}
}
