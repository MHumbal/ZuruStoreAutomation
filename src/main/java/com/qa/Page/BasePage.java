package com.qa.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page{

	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	public void doClick(By locator) {
		driver.findElement(locator).click();
	}
	
	public void doSendKeys(By locator, String text) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(text);
	}
	
	public String doGetText(By locator) {
		return driver.findElement(locator).getText();
	} 
	
	public WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	} 
	
	public boolean ElementDisplayed(By locator) {
		
		boolean searchIconEnabled = driver.findElement(locator).isDisplayed();
		if(searchIconEnabled == true) {
		return true;
		}
		
		else{
			return false;
			}
	}
}
