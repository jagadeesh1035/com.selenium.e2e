package com.selenium.core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	@BeforeMethod
	public void browserSetup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		wait = new WebDriverWait(driver, Duration.ofSeconds(35));	
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
