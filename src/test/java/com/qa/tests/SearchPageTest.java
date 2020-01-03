package com.qa.tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.Page.HomePage;
import com.qa.Page.Page;
import com.qa.Page.SearchPage;

public class SearchPageTest extends BaseTest{

	//Test verify that searched is same as project listed
	@Test
	public void SearchboxText_AllProjPage() throws InterruptedException {
		String search_text = "new";
		page.getInstance(HomePage.class).ClickAllProjButton();
		Thread.sleep(5000);
		page.getInstance(SearchPage.class).enterText(search_text);
		Thread.sleep(5000);
		List<WebElement> l = page.getInstance(SearchPage.class).getSuggestion();
		for (WebElement w : l) {
			//System.out.println(w.getText());
				Assert.assertTrue(w.getText().toUpperCase().contains(search_text.toUpperCase()));	
		}
		Thread.sleep(5000);
	}
	
	//Search for background project name
	@Test
	public void SearchboxText_HomePage() throws InterruptedException {
		String search_text = "new";

		page.getInstance(HomePage.class).EnterTextSearchbox(search_text);
		
		Thread.sleep(5000);
		List<WebElement> l = page.getInstance(SearchPage.class).getSuggestion();
		String Expected_String = page.getInstance(SearchPage.class).GetProjName();
		for (WebElement w : l) {
			System.out.println(w.getText().toUpperCase());
			Assert.assertTrue(w.getText().toUpperCase().contains(Expected_String.toUpperCase()));	
	}
	}
	
	//press enter and compare all the projects listed
	@Test
	public void SearchProjList() throws InterruptedException {
		String search_text = "new";
		page.getInstance(HomePage.class).ClickAllProjButton();
		Thread.sleep(5000);
		page.getInstance(SearchPage.class).enterText(search_text);
		Thread.sleep(5000);
		page.getInstance(SearchPage.class).getProjectList();
	}
}
