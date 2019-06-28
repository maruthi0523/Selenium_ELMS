package com.elmspageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.elms.base.Testbase;

public class ForgotPassword  extends Testbase{
	@FindBy(xpath = "//*[@routerlink='/forgotPassword']")
	WebElement ForgotPassword ;
	
	@FindBy(xpath = "//*[@placeholder='Email Id']")
	WebElement EnterEmailId;
	
	@FindBy (xpath ="//button[@type='submit']")
	WebElement SubmitButton;
	
	@FindBy(xpath = "//*[@class='btn btn-lg btn-rounded btn-form-add']")
	WebElement Siginbutton;
	
	public ForgotPassword() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 25), this);
	}

	public void forgotPswd(String Emailid) {
		ForgotPassword.click();
		EnterEmailId.sendKeys(Emailid);
		SubmitButton.click();
		Siginbutton.click();
	}
		
	}
	

