package com.selenium.e2e.common.base;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class coreProperties {

	protected WebDriver driver;
	public static ThreadLocal<Properties> properties = new ThreadLocal<Properties>();

	public static final Logger logger = Logger.getLogger(coreProperties.class);
}
