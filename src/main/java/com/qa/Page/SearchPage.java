package com.qa.Page;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage{
	
	public SearchPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	By textbox_Searchbox = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[1]/div/div[1]/div/div[1]/input");
	By autosuggestion = By.id("typehead");
	By Project_Name = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div[1]/h3[1]");
	By AllProject_List_Search = By.xpath("//div[contains(@class, 'new-project-card')]");

	public void enterText(String s) {
		doSendKeys(textbox_Searchbox, s);	
		getWebElement(textbox_Searchbox).sendKeys(Keys.ENTER);
	}
	
	public List<WebElement> getSuggestion() {
		List<WebElement> e = driver.findElements(autosuggestion);
		return e;
	}
	
	public String GetProjName() {
		return doGetText(Project_Name);
	}
	
	public void getProjectList() {
			ArrayList<String> ar = new ArrayList<String>();
			List<WebElement> l = driver.findElements(AllProject_List_Search);
			for(int i=1;i<=l.size();i++) {
				By Proj_Name = By.xpath("//div[contains(@class, 'new-project-card')][" + i + "]//div[@class = 'project-name']");
				ar.add(doGetText(Proj_Name));
			}
			System.out.println(ar);
	}
}

