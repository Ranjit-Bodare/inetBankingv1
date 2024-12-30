package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver ldriver;
	
	Loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	
	}
	
	@FindBy(id="email")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(id="passwd")
	@CacheLookup
	WebElement txtpassward;

	@FindBy(id="SubmitLogin")
	@CacheLookup
	WebElement btnlogin;
	
	public void setUsername(String uname) {
		txtUsername.sendKeys(uname);	
		
	}
	
	
	public void setpassward(String pwd) {
		txtUsername.sendKeys(pwd);	
		
	}
	
	public void clicksubmit() {
		btnlogin.click();	
		
	}
	
	

}
