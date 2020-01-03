package com.qa.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.Page.HomePage;

public class HomePageTest extends BaseTest{

	@Test
	public void HomePageTitleTest() {
		String title = page.getInstance(HomePage.class).getHomePageTitle();
		assertEquals(title, "Store");
	}
	
	@Test
	public void getHomeTextTest() {
		String text = page.getInstance(HomePage.class).getHomeText();
		assertEquals(text, "Home");
	}
	
	@Test
	public void getHomeTagLineTest() {
		String text = page.getInstance(HomePage.class).getHomeTagLine();
		assertEquals(text, "DESIGN • BUILD • LIVE");
	}
	
	@Test
	public void ClickAllProjButtonTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
	}
}
