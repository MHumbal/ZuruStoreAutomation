package com.qa.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadProjectPage extends BasePage{

	public UploadProjectPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	Actions action = new Actions(driver);
	
	By Choose_Cover_Image = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[1]/div[1]/input");
	By Proj_Name_textbox = By.name("name");
	By Desc_textbox =By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Font'])[1]/following::div[30]");
	By Proj_Screenshot = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div[1]/div/div[1]/div/div[2]/div/input");
	By topology = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[3]/div/div/div[5]/div/div/div[1]/div/div/div/div[2]/select");
	By Rooms_textbox = By.name("rooms");
	By Price_textbox = By.name("price");
	By Building_size = By.name("buildingSize");
	By Bathroom_textbox = By.name("bathrooms");
	By Storey_textbox = By.name("storeys");
	By Status_Building = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[3]/div/div/div[5]/div/div/div[13]/div/div/div/div[2]/select/option[4]");
	By publish_btn = By.xpath("//button[contains(text(),'Publish')]");
	
	public void Upload_project(String coverImage, String Proj_Name, String Desc_text, String Proj_SS, String topology_type, int Rooms, int Price, int Bathroom, int Storey, int building_size) throws InterruptedException {
		Thread.sleep(2000);
		getWebElement(Choose_Cover_Image).sendKeys(coverImage);
		doSendKeys(Proj_Name_textbox, Proj_Name);
		Thread.sleep(2000);
		doClick(Desc_textbox);
		Thread.sleep(2000);
		getWebElement(Desc_textbox).sendKeys(Desc_text);
		Thread.sleep(2000);
		getWebElement(Proj_Screenshot).sendKeys(Proj_SS);
		Thread.sleep(2000);
		Select s_topology = new Select(driver.findElement(topology));
		s_topology.selectByVisibleText(topology_type);
	    Thread.sleep(2000);
	    getWebElement(Building_size).sendKeys(String.valueOf(building_size));
	    Thread.sleep(2000);
	    getWebElement(Rooms_textbox).sendKeys(String.valueOf(Rooms));
	    Thread.sleep(2000);
	    getWebElement(Price_textbox).sendKeys(String.valueOf(Price));
	    getWebElement(Storey_textbox).sendKeys(String.valueOf(Storey));
	    getWebElement(Bathroom_textbox).sendKeys(String.valueOf(Bathroom));
	    doClick(Status_Building);
	    doClick(publish_btn);
	    Thread.sleep(10000);
	}
	

	
}
