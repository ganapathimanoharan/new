package org.pom;

import org.click.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal {
	
	public SelectHotel() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement containsText;

	@FindBy(id = "radiobutton_0")
	private WebElement click1;

	@FindBy(id = "continue")
	private WebElement click2;

	public WebElement getContainsText() {
		return containsText;
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getClick2() {
		return click2;
	}

	public void selectHotel() {
	
		String text = getText(getContainsText());
		boolean b = boolea(text, "Select Hotel");
		assertion("Verify text Ok", b);
		sysout(text);
		click(getClick1());
		click(getClick2());

	}
}
