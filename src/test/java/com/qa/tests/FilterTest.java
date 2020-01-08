package com.qa.tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.qa.Page.AllProjPage;
import com.qa.Page.FilterPage;
import com.qa.Page.HomePage;

public class FilterTest extends BaseTest{

	@Test
	public void TopologyFilterTest() throws InterruptedException {
		Thread.sleep(5000);
		page.getInstance(FilterPage.class).Home_AllProjButoon_Click();
		Thread.sleep(5000);
		page.getInstance(FilterPage.class).Building_Type();
		Thread.sleep(5000);
		
		ArrayList<String> ar = page.getInstance(AllProjPage.class).Project_type();
		System.out.println(ar);
		
		for(String s: ar) {
			if(s.contentEquals("School")) {
				System.out.println("TC passed");
			}
			
			else
			{
				System.out.println("Failed");
			}
		}
		 
		 
//		if(ar.contains(null) | ar.size() < 1) {
//			assertEquals(false, true);
//		}
//		else {
//			System.out.println("TC passed");
//		}
		
	}
}
