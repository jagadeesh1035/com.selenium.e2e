package com.selenium.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.selenium.core.BaseTest;
import com.selenium.framework.driver.DriverFactory;

public class GoogleSearchTwoTest extends BaseTest {
	
	@Test(enabled = false)
	public void searchHello() {
		wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(35));	
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@title='Search']")));
		DriverFactory.getDriver().findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello Java"+Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Search Results']/parent::div")));
		if(DriverFactory.getDriver().findElement(By.xpath("//h1[text()='Search Results']/parent::div")).isDisplayed()) {
			System.out.println("Search results are displayed");
		}else {
			System.out.println("Search results are not displayed");
		}
	}
	
	@Test
	public void searchHelloHello() {
		wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(35));	
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@title='Search']")));
		DriverFactory.getDriver().findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello Helloo Java"+Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Search Results']/parent::div")));
		if(DriverFactory.getDriver().findElement(By.xpath("//h1[text()='Search Results']/parent::div")).isDisplayed()) {
			System.out.println("Search results are displayed");
		}else {
			System.out.println("Search results are not displayed");
		}
	}
	@Test(enabled = false)
	public void searchHelloHelloHello() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@title='Search']")));
		DriverFactory.getDriver().findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello Hello Helloooo Java"+Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Search Results']/parent::div")));
		if(DriverFactory.getDriver().findElement(By.xpath("//h1[text()='Search Results']/parent::div")).isDisplayed()) {
			System.out.println("Search results are displayed");
		}else {
			System.out.println("Search results are not displayed");
		}
	}
	@Test
	public void searchHelloHelloHelloHello() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@title='Search']")));
		DriverFactory.getDriver().findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello HEeloo Hello hello hellooo Java"+Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Search Results']/parent::div")));
		if(DriverFactory.getDriver().findElement(By.xpath("//h1[text()='Search Results']/parent::div")).isDisplayed()) {
			System.out.println("Search results are displayed");
		}else {
			System.out.println("Search results are not displayed");
		}
	}
	
	
}
