package com.qa.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectDetailPage extends BasePage{

	public ProjectDetailPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	Actions action = new Actions(driver);

	By Like_btn = By.xpath("//p[@class='text-like']");
	By review_btn = By.xpath("//div[@class='review-message']");
	By rating_btn = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[3]/div/div[2]/div[6]/div[1]/div/div/div/div/div[2]/div/div[10]/div");
	By rating_title = By.xpath("//input[@class='review-new-title']");
	By rating_description = By.xpath("//textarea[@class='review-new-description']");
	By Save_btn = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[3]/div/div[2]/div[6]/div[1]/div/div/div/div/div[5]/div/button[2]");
	
	public void Click_Like() throws InterruptedException {
		Thread.sleep(2000);
		doClick(Like_btn);
		Thread.sleep(5000);
	}
	
	public void Add_Review() throws InterruptedException {
		Thread.sleep(2000);
		action.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		doClick(review_btn);
		Thread.sleep(3000);
		doClick(rating_btn);
		Thread.sleep(3000);
		doSendKeys(rating_title, "Ruchita_Auto");
		Thread.sleep(3000);
		doSendKeys(rating_description, "Ruchita_Automation");
		doClick(Save_btn);
	}
}
