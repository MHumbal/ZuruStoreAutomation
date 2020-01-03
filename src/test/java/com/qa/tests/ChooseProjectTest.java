package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.Page.AllProjPage;
import com.qa.Page.ChooseProjectPage;
import com.qa.Page.UserPage;

public class ChooseProjectTest extends BaseTest{

	@Test
	public void Choose_Project_Test() throws InterruptedException {
		page.getInstance(AllProjPage.class).user_Page();
		page.getInstance(UserPage.class).upload();
		page.getInstance(ChooseProjectPage.class).Click_choose_Project();	
		
	}
}
