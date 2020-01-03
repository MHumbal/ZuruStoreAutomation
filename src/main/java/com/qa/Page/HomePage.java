package com.qa.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	By Home_text = By.className("title-home");
	By Home_TagLine = By.className("home-tag-line");
	By AllProj_btn = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[1]/nav/div/div[2]/ul/li[1]/a");
	By Searchbox = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[3]/div/div/div[1]/input");
	
	public String getHomePageTitle(){
		return driver.getTitle();
	}
	
	public String getHomeText() {
		return doGetText(Home_text);
	}
	
	public String getHomeTagLine() {
		return doGetText(Home_TagLine);
	}
	
	public void EnterTextSearchbox(String s) {
		doSendKeys(Searchbox, s);
		getWebElement(Searchbox).sendKeys(Keys.ENTER);
	}

	public void ClickAllProjButton() throws InterruptedException {
		Thread.sleep(4000);
		doClick(AllProj_btn);
		Thread.sleep(4000);
	}
	
}
