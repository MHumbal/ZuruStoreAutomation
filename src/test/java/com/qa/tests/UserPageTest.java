package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.Page.AllProjPage;
import com.qa.Page.HomePage;
import com.qa.Page.UserPage;

public class UserPageTest extends BaseTest{
	
	@Test
	public void getUsernameTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		page.getInstance(AllProjPage.class).user_Page();
		Thread.sleep(3000);
		String s = page.getInstance(UserPage.class).getUsername();
		System.out.println(s);
	}
	
	@Test
	public void getProfessionTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		page.getInstance(AllProjPage.class).user_Page();
		Thread.sleep(3000);
		String s = page.getInstance(UserPage.class).getProfession();
		System.out.println(s);
	}	
}
