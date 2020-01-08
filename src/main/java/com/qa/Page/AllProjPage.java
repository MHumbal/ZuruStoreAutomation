package com.qa.Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllProjPage extends BasePage{

	public AllProjPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	Actions action = new Actions(driver);
	By Project_btn = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[1]/nav/div/div[2]/ul/li[1]/a");
	By AllProject_List = By.xpath("//div[contains(@class, 'new-project-card')]");
	By Search_click = By.className("projects");
	By user_Page_btn = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[1]/nav/div/div[2]/ul/li[5]/a/img");
	By firstProject = By.xpath("//div[contains(@class, 'new-project-card')][1]");
	
	By Uploaded_Project_Name = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/div[1]/div[1]");
	By Uploaded_Project_Owner = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/div[1]/div[2]");
	By Uploaded_Project_Price = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[2]/div[2]");
	By Uploaded_Project_Type = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[4]/div[1]/span[2]");
	By Uploaded_Project_Area = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[4]/div[2]/span[2]");
	By Uploaded_Project_floors = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[4]/div[3]/span[2]");
	By Uploaded_Project_rooms = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[4]/div[4]/span[2]");
	By Uploaded_Project_bathroom = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[4]/div[5]/span[2]");
	
	
	public void FirstProjectClick() {
		doClick(firstProject);
	}
	public ArrayList<Boolean> Project_Thumbanil() throws InterruptedException{
		ArrayList<Boolean> ar = new ArrayList<Boolean>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By Proj_Thumbanile = By.xpath("//div[contains(@class, 'new-project-card')][" + i + "]//child:: img");
			ar.add(ElementDisplayed(Proj_Thumbanile));
		}
		return ar;
	}
	
	public ArrayList<Boolean> Project_Type_Icon() throws InterruptedException{
		ArrayList<Boolean> ar = new ArrayList<Boolean>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By Type_Icon = By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div/div[2]/div[2]/div[1]/div[" + i + "]/div/div[4]/div[1]/span[1]");
			ar.add(ElementDisplayed(Type_Icon));
		}
		return ar;
	}
	
	public ArrayList<Boolean> Project_area_Icon() throws InterruptedException{
		ArrayList<Boolean> ar = new ArrayList<Boolean>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By area_Icon = By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div/div[2]/div[2]/div[1]/div[" + i + "]/div/div[4]/div[2]/span[1]");
			ar.add(ElementDisplayed(area_Icon));
		}
		return ar;
	}
	
	public ArrayList<Boolean> Project_Floor_Icon() throws InterruptedException{
		ArrayList<Boolean> ar = new ArrayList<Boolean>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By Floor_Icon = By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div/div[2]/div[2]/div[1]/div["+ i +"]/div/div[4]/div[3]/span[1]");
			ar.add(ElementDisplayed(Floor_Icon));
		}
		return ar;
	}
	
	public ArrayList<Boolean> Project_Bedroom_Icon() throws InterruptedException{
		ArrayList<Boolean> ar = new ArrayList<Boolean>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By Bedroom_Icon = By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div/div[2]/div[2]/div[1]/div[" + i +"]/div/div[4]/div[4]/span[1]");
			ar.add(ElementDisplayed(Bedroom_Icon));
		}
		return ar;
	}
	
	public ArrayList<Boolean> Project_Bathroom_Icon() throws InterruptedException{
		ArrayList<Boolean> ar = new ArrayList<Boolean>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By Bathroom_Icon = By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div/div[2]/div[2]/div[1]/div["+ i +"]/div/div[4]/div[5]/span[1]");
			ar.add(ElementDisplayed(Bathroom_Icon));
		}
		return ar;
	}
	
	public ArrayList<String> Project_Name() throws InterruptedException{
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By Proj_Name = By.xpath("//div[contains(@class, 'new-project-card')][" + i + "]//div[@class = 'project-name']");
			ar.add(doGetText(Proj_Name));
		}
		return ar;
	}
	
	public ArrayList<String> Project_OwnerName() throws InterruptedException{
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By OwnerName = By.xpath("//div[contains(@class, 'new-project-card')][" + i + "]//div[@class = 'project-owner']");
			ar.add(doGetText(OwnerName));
		}
		return ar;
	}

	public ArrayList<String> Project_type() throws InterruptedException{
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By type = By.xpath("//*[@id=\"wrapper\"]/div/div/div/div[2]/div[2]/div/div["+ i +"]/div/div[4]/div[1]/span[2]");
			ar.add(doGetText(type));
		}
		return ar;
	}
	
	public ArrayList<String> Project_area() throws InterruptedException{
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By area = By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div/div[2]/div[2]/div[1]/div["+ i +"]/div/div[4]/div[2]/span[2]");
			ar.add(doGetText(area));
		}
		return ar;
	}

	public ArrayList<String> Project_Floor() throws InterruptedException{
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By floor = By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div/div[2]/div[2]/div[1]/div["+ i +"]/div/div[4]/div[3]/span[2]");
			ar.add(doGetText(floor));
		}
		return ar;
	}
	
	public ArrayList<String> Project_Bedrooms() throws InterruptedException{
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By bedrooms = By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div/div[2]/div[2]/div[1]/div["+ i +"]/div/div[4]/div[4]/span[2]");
			ar.add(doGetText(bedrooms));
		}
		return ar;
	}
	
	public ArrayList<String> Project_Bathrooms() throws InterruptedException{
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By bathrooms = By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div/div[2]/div[2]/div[1]/div["+ i +"]/div/div[4]/div[5]/span[2]");
			ar.add(doGetText(bathrooms));
		}
		return ar;
	}
	
	public ArrayList<String> Project_Price() throws InterruptedException{
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> l = driver.findElements(AllProject_List);
		for(int i=1;i<=l.size();i++) {
			By price = By.xpath("//*[@id=\"wrapper\"]/div/div[2]/div/div[2]/div[2]/div[1]/div["+ i +"]/div/div[2]/div[2]");
			ar.add(doGetText(price));
		}
		return ar;
	}
	
		
	public ArrayList<String> GetSingleProjectData() {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add(doGetText(Uploaded_Project_Name));
		ar.add(doGetText(Uploaded_Project_Owner));
		ar.add(doGetText(Uploaded_Project_Price));
		ar.add(doGetText(Uploaded_Project_Type));
		ar.add(doGetText(Uploaded_Project_Area));
		ar.add(doGetText(Uploaded_Project_floors));
		ar.add(doGetText(Uploaded_Project_rooms));
		ar.add(doGetText(Uploaded_Project_bathroom));
		return ar;
	}
	
	public void user_Page() throws InterruptedException {
		Thread.sleep(3000);
		doClick(user_Page_btn);
	}
}
