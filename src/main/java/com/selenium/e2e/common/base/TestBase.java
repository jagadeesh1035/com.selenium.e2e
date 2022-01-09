package com.selenium.e2e.common.base;

import org.apache.log4j.Logger;
import org.testng.annotations.*;

public class TestBase extends CoreProperties{
	private static final Logger logger = Logger.getLogger(TestBase.class);
	
	
	@BeforeSuite
	public void setPrerequisites() {
		System.out.println("Before SUite method");
	}
	
}
