package com.qa.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserPage extends BasePage {

	public UserPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	By Username = By.xpath("//div[@class='profile-user-name']");
	By Profession = By.xpath("//div[@class='profile-user-profession']");
	By upload_btn = By.xpath("//div[@class='upload-icon-wrp']");
	
	public String getUsername(){
		return doGetText(Username);
	} 
	
	public String getProfession(){
		return doGetText(Profession);
	} 
	
	public void upload() throws InterruptedException {
		Thread.sleep(3000);
		doClick(upload_btn);
	}
	
	
}
