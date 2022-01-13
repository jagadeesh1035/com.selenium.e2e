package com.selenium.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath = "//a[@class='homepage-nav-login'][text()='Log in']")
	private WebElement loginButton;
	
	
	public void clickLoginLink() {
		loginButton.click();
	}
}
