/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Rashika_Kowtikwar
 *
 */
public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By pageheader = By.xpath("//h5[text()=' Eduvate']");
	
	public WebElement getHeader() {
		return getElement(pageheader);
	}
	
	public String getHomePageTitle()
	{
		return getPageTitle();
	}
	
	public String getHomePageHeader()
	{
	return getPageheader(pageheader);
	
	}
}
