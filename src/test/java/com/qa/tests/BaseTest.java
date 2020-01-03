package com.qa.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.Page.LoginPage;
import com.qa.Page.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	public Properties prop;
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().fullscreen();
		prop = new Properties();
		page = new Page(driver, wait);
		FileInputStream ip = new FileInputStream("./src/main/java/com/qa/config/config.properties");
		prop.load(ip);
		driver.get(prop.getProperty("url"));
		LoginPage lp = new LoginPage(driver, wait);
		lp.doLogin(prop.getProperty("uname"), prop.getProperty("pwd"));
		Thread.sleep(5000);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
