package com.qa.Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterPage extends BasePage{
	public FilterPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	By Building_Type = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[1]/div/div[2]/div[1]");
	By SchoolType_Click = By.xpath("//*[@id=\"filter-search-dropdown-collapse\"]/div/div[1]/button[1]/span[2]");
	By Home_AllProjButoon = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[3]/div/i[2]");
	By AllProject_List = By.xpath("//div[contains(@class, 'new-project-card')]");
	
	
	public void Home_AllProjButoon_Click() {
		doClick(Home_AllProjButoon);
	}
	
	public void Building_Type() throws InterruptedException {
		doClick(Building_Type);
		Thread.sleep(2000);
		doClick(SchoolType_Click);
	}

}
