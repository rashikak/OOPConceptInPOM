/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Rashika_Kowtikwar
 *
 */
public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By emailid = By.name("username");

	private By password = By.name("password");
	private By signin = By.xpath("//span[text()='Sign In']");
	private By pageheader = By.xpath("//h1[text()='Sign in']");

	public WebElement getEmailId() {
		return getElement(emailid);

	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getLoginButton() {
		
		return getElement(signin);
		
	}

	public WebElement getHeader() {
		return getElement(pageheader);
	}
	
	public String getLoginPageTitle()
	{
		return getPageTitle();
	}
	public HomePage doLogin(String usrname,String pwd)
	{
		getEmailId().sendKeys(usrname);
		getPassword().sendKeys(pwd);
		getLoginButton().click();
		return getInstance(HomePage.class);
	}
	public String getLoginPageHeader()
	{
	return getPageheader(pageheader);
	
	}
	public void doLogin()
	{
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
	}
}
