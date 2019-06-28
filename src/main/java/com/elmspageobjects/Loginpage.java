package com.elmspageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.elms.base.Testbase;

public class Loginpage extends Testbase{
	@FindBy(xpath="//input[@formcontrolname='emailId']")
	WebElement Emailid;
	
	@FindBy(xpath= "//*[@formcontrolname='passwordHash']")	
	WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SiginButton;
    public Loginpage() {
    	PageFactory.initElements(driver, this);
    }
    public void  login(String email, String pswd) {
    	Emailid.sendKeys(email);
    	Password.sendKeys(pswd);
    	SiginButton.click();
    	
    
  }
}









