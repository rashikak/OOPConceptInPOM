package com.mytests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mypages.BasePage;
import com.mypages.Page;

public class BaseTest {

	
	WebDriver driver;
	public Page page;
	
	@BeforeMethod
	@Parameters(value={"browser"})
	public void SetUpTest(String browser) throws InterruptedException
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Driver_Server\\exefiles\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://erp.letseduvate.com/");
			 }
		Thread.sleep(4000);
		page=new BasePage(driver);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
