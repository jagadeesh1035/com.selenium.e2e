package com.selenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.selenium.core.BaseTest;

public class GoogleSearchTwoTest extends BaseTest {
	
	@Test(enabled = false)
	public void searchHello() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@title='Search']")));
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello Java"+Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Search Results']/parent::div")));
		if(driver.findElement(By.xpath("//h1[text()='Search Results']/parent::div")).isDisplayed()) {
			System.out.println("Search results are displayed");
		}else {
			System.out.println("Search results are not displayed");
		}
	}
	
	@Test
	public void searchHelloHello() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@title='Search']")));
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello Helloo Java"+Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Search Results']/parent::div")));
		if(driver.findElement(By.xpath("//h1[text()='Search Results']/parent::div")).isDisplayed()) {
			System.out.println("Search results are displayed");
		}else {
			System.out.println("Search results are not displayed");
		}
	}
	@Test(enabled = false)
	public void searchHelloHelloHello() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@title='Search']")));
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello Hello Helloooo Java"+Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Search Results']/parent::div")));
		if(driver.findElement(By.xpath("//h1[text()='Search Results']/parent::div")).isDisplayed()) {
			System.out.println("Search results are displayed");
		}else {
			System.out.println("Search results are not displayed");
		}
	}
	@Test
	public void searchHelloHelloHelloHello() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@title='Search']")));
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello HEeloo Hello hello hellooo Java"+Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Search Results']/parent::div")));
		if(driver.findElement(By.xpath("//h1[text()='Search Results']/parent::div")).isDisplayed()) {
			System.out.println("Search results are displayed");
		}else {
			System.out.println("Search results are not displayed");
		}
	}
	
	
}
