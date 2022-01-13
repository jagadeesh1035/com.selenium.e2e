package com.selenium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(id = "username")
	private WebElement emailAddress;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "loginBtn")
	private WebElement loginButton;
	
	
	public void enterEmailAddress(String email) {
		emailAddress.sendKeys(email);
	}
	
	public void enterPassword(String pw) {
		password.sendKeys(pw);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
}
