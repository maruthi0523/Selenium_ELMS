package com.elmspageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.elms.base.Testbase;

public class EditOrganization extends Testbase{
	
	@FindBy(xpath = "//span[contains(text(),'Organizations')]")
	WebElement Organization;
	
	@FindBy (xpath ="//*[@id=\"dtBasicExample\"]/tbody/tr[5]/td[7]/div/button[1]")
	WebElement EditOrgButton;
	
      @FindBy(xpath = "")
	   WebElement 
	
	
	
	
	
	
	
}
