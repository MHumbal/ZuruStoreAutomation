package com.qa.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	By Login_btn = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[4]/a/div/button/div/div/span");
	By email_ID = By.id("login-input-field");
	By pwd = By.id("passowrd-input-field");
	By Submit_btn = By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[2]/div[3]/div");
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	} 

	public void doLogin(String userName, String Password) throws InterruptedException{
		doClick(Login_btn);
		doSendKeys(email_ID, userName);
		doSendKeys(pwd, Password);
		Thread.sleep(2000);
		doClick(Submit_btn);
	}

	
}
