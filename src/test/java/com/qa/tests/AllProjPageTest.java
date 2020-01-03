package com.qa.tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.qa.Page.AllProjPage;
import com.qa.Page.HomePage;

public class AllProjPageTest extends BaseTest{

	@Test
	public void ClickProject_ButtonTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
	}
	
	@Test
	public void AllProject_ThumbanilTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<Boolean> ar = page.getInstance(AllProjPage.class).Project_Thumbanil();
		System.out.println(ar);
		if(ar.contains(false) | ar.contains(null)| ar.size() < 1) {
			System.out.println("TC failed");
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void AllProject_NameTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<String> ar = page.getInstance(AllProjPage.class).Project_Name();
		System.out.println(ar);
		if(ar.contains(null)| ar.size() < 1) {
			System.out.println("TC failed");
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void AllProject_OwnerNameTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<String> ar = page.getInstance(AllProjPage.class).Project_OwnerName();
		System.out.println(ar);
		if(ar.contains(null) | ar.size() < 1) {
			assertEquals(false, true);
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void AllProject_TypeTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<String> ar = page.getInstance(AllProjPage.class).Project_type();
		System.out.println(ar);
		if(ar.contains(null) | ar.size() < 1) {
			assertEquals(false, true);
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void AllProject_areaTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<String> ar = page.getInstance(AllProjPage.class).Project_area();
		System.out.println(ar);
		if(ar.contains("02") | ar.size() < 1 ) {
			assertEquals(false, true);
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void AllProject_FloorTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<String> ar = page.getInstance(AllProjPage.class).Project_Floor();
		System.out.println(ar);
		if(ar.contains("0") | ar.size() < 1 ) {
			assertEquals(false, true);
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void AllProject_BedroomsTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<String> ar = page.getInstance(AllProjPage.class).Project_Bedrooms();
		System.out.println(ar);
		if(ar.contains("0") | ar.size() < 1 ) {
			assertEquals(false, true);
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void AllProject_BathroomsTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<String> ar = page.getInstance(AllProjPage.class).Project_Bathrooms();
		System.out.println(ar);
		if(ar.contains("0") | ar.size() < 1 ) {
			assertEquals(false, true);
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void AllProject_PriceTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<String> ar = page.getInstance(AllProjPage.class).Project_Price();
		System.out.println(ar);
		if(ar.contains("$0") | ar.size() < 1 ) {
			assertEquals(false, true);
		}
		else {
			System.out.println("TC passed");
		}
	}

	@Test
	public void AllProject_Type_IconTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<Boolean> ar = page.getInstance(AllProjPage.class).Project_Type_Icon();
		System.out.println(ar);
		if(ar.contains(false) | ar.size() < 1 ) {
			assertEquals(false, true);
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void AllProject_area_IconTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<Boolean> ar = page.getInstance(AllProjPage.class).Project_area_Icon();
		System.out.println(ar);
		if(ar.contains(false) | ar.size() < 1 ) {
			assertEquals(false, true);
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void AllProject_Floor_IconTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<Boolean> ar = page.getInstance(AllProjPage.class).Project_Floor_Icon();
		System.out.println(ar);
		if(ar.contains(false) | ar.size() < 1 ) {
			assertEquals(false, true);
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void AllProject_Bedroom_IconTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<Boolean> ar = page.getInstance(AllProjPage.class).Project_Bedroom_Icon();
		System.out.println(ar);
		if(ar.contains(false) | ar.size() < 1 ) {
			assertEquals(false, true);
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void AllProject_Bathroom_IconTest() throws InterruptedException {
		page.getInstance(HomePage.class).ClickAllProjButton();
		ArrayList<Boolean> ar = page.getInstance(AllProjPage.class).Project_Bathroom_Icon();
		System.out.println(ar);
		if(ar.contains(false) | ar.size() < 1 ) {
			assertEquals(false, true);
		}
		else {
			System.out.println("TC passed");
		}
	}
	
	@Test
	public void User_Page_ClickTest() throws InterruptedException {
		page.getInstance(AllProjPage.class).user_Page();
	}
}
