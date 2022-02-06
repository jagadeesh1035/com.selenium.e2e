package com.selenium.framework.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private DriverFactory() {}

	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

	public static synchronized void setDriver(WebDriver driver) {
		tlDriver.set(driver);
	}

	public static void unload() {
		tlDriver.remove();
	}

	public static synchronized void setDriver(Browser brwser) {
		switch (brwser) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			setDriver(new ChromeDriver());
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			setDriver(new FirefoxDriver());
			break;
		case IE:
			WebDriverManager.iedriver().setup();
			setDriver(new InternetExplorerDriver());
			break;
		default:
			System.out.println("No browser instance available");
			break;
		}
	}

	public static void quit() {
		if (Objects.nonNull(getDriver())) {
			getDriver().quit();
		}
	}

}
