package com.selenium.e2e.common.base;

import org.openqa.selenium.WebDriver;

public class TLDriverFactory extends CoreProperties{
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	/**
	 * Browsers
	 */
	public static final String FIREFOX = "FIREFOX";
	public static final String CHROME = "CHROME";
	public static final String IE = "IE";
	
	public static final String GRID = "GRID";
	public static final String MOBILE = "MOBILE";
	public static final String BROWSERSTACK = "BROWSERSTACK";
	
}
