/**
 * 
 */
package com.mytests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

/**
 * @author Rashika_Kowtikwar
 *
 */
public class LoginTest extends BaseTest{
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest()
	{
		String title=page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("title is"+title);
		assertEquals(title, "OMS");
		
	}
	@Test(priority=2)
	public void verifyLoginPageHeaderTest()
	{
		String header=page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println("title is"+header);
		assertEquals(header, "Sign in");
		
	}
	@Test(priority=3)
	public void dologinTest() throws InterruptedException
	{
		HomePage homePage=page.getInstance(LoginPage.class).doLogin("1405060518", "1405060518");
		
		Thread.sleep(5000);
		String homepageheader=homePage.getHomePageHeader();
		System.out.println("Homepageheader is"+homepageheader);
		assertEquals(homepageheader, "Eduvate beta");
		
	}
}
