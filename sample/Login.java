package org.sample;

import org.click.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends LibGlobal {

	public Login() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtUserName;

	@CacheLookup
	@FindBy(id = "email")
	private WebElement txtUserName1;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtUserName1() {
		return txtUserName1;
	}

	public void login(String userName, String userName1) {

		typeText(getTxtUserName(), userName);
		typeText(getTxtUserName1(), userName1);

	}

}
