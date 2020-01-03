package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.Page.AllProjPage;
import com.qa.Page.HomePage;
import com.qa.Page.ProjectDetailPage;

public class ProjectDetailTest extends BaseTest{

	@Test
	public void Like_Project_Test() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		page.getInstance(AllProjPage.class).FirstProjectClick();
		page.getInstance(ProjectDetailPage.class).Click_Like();	
	}
	
	@Test
	public void Add_Comment_Test() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		page.getInstance(AllProjPage.class).FirstProjectClick();
		page.getInstance(ProjectDetailPage.class).Add_Review();	
	}
}
