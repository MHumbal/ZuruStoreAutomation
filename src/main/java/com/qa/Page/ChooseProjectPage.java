package com.qa.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChooseProjectPage extends BasePage{

	public ChooseProjectPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	//By Search_text = By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div/div[2]/div/div/div[1]/div/div[1]/div/input");
	By choose_btn = By.xpath("//button[contains(text(),'Choose')]");
	
	public void Click_choose_Project() throws InterruptedException {
		Thread.sleep(2000);
		doClick(choose_btn);
		Thread.sleep(3000);
	}
	}
	
