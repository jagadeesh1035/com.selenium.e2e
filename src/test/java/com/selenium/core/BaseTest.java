package com.selenium.core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.selenium.framework.driver.Browser;
import com.selenium.framework.driver.DriverFactory;

public class BaseTest {
	protected WebDriverWait wait;
	protected DriverFactory driverFactory;
	
	@BeforeMethod
	public void browserSetup() {
		DriverFactory.setDriver(Browser.CHROME);
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.google.com");
		wait = new WebDriverWait(driver, Duration.ofSeconds(35));	
	}
	
	
	@AfterMethod
	public void tearDown() {
		DriverFactory.quit();
	}
}
