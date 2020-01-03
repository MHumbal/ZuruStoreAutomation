package com.qa.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Page.AllProjPage;
import com.qa.Page.ChooseProjectPage;
import com.qa.Page.UploadProjectPage;
import com.qa.Page.UserPage;
import com.qa.TestUtil.ProvideData;

public class UploadProjectTest extends BaseTest{
	
	@DataProvider(name="testdata")
	public Object[][] dataMethod() throws EncryptedDocumentException, IOException {
		Object[][] data = ProvideData.testData("C:\\Users\\ZTI\\eclipse-workspace - Copy\\JavaGenerics\\Data.xlsx", "Upload");
		System.out.println("data from provider: " + data);
		return data;
	}
	
	@Test(dataProvider = "testdata")
	public void upload_Project_Test(String coverImage, String Proj_Name, String Desc_text, String Proj_SS, String topology, int Rooms, int Price, int Bathroom, int Storey, int Building_Size) throws InterruptedException {
		//page.getInstance(HomePage.class).ClickAllProjButton();
		page.getInstance(AllProjPage.class).user_Page();
		page.getInstance(UserPage.class).upload();
		page.getInstance(ChooseProjectPage.class).Click_choose_Project();
		page.getInstance(UploadProjectPage.class).Upload_project(coverImage, Proj_Name, Desc_text, Proj_SS, topology, Rooms, Price, Bathroom, Storey, Building_Size);
		ArrayList<String> ar = page.getInstance(AllProjPage.class).GetSingleProjectData();
		System.out.println(ar);
		assertEquals(ar.get(0), Proj_Name);
		assertEquals(ar.get(1), "Ruchita Patel");
		assertEquals(ar.get(2), "$".concat(String.valueOf(Price)));
		assertEquals(ar.get(3), topology);
		String s = ar.get(4).substring(0, ar.get(4).length()-1);
		assertEquals(Integer.parseInt(s), Building_Size);
		assertEquals(Integer.parseInt(ar.get(5)), Storey);
		assertEquals(Integer.parseInt(ar.get(6)), Rooms);
		assertEquals(Integer.parseInt(ar.get(7)), Bathroom);
			
	}
}
