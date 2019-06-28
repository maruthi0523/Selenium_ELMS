package com.elmspageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.elms.base.Testbase;

public class EditRole extends Testbase{
	
	@FindBy(xpath = "//span[contains(text(),'Roles')]")
	WebElement Roles;
	
	@FindBy(xpath="//*[@id=\"dtBasicExample\"]/tbody/tr[1]/td[6]/div/button[1]")
	WebElement EditRolebutton;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-role-manupulation/div/div/div/div[2]/form/div[2]/div[2]/div/input")
	WebElement EditRoleName;
	
	@FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-role-manupulation/div/div/div/div[2]/form/div[4]/div[7]/div/div[2]/div[1]/label")
	WebElement CreateUser;
	
	@FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-role-manupulation/div/div/div/div[2]/form/div[4]/div[7]/div/div[2]/div[2]/label")
	WebElement ReadUser;
	
	@FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-role-manupulation/div/div/div/div[2]/form/div[5]/div/button[2]")
	WebElement submit;
	
	public EditRole() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 25), this);
	}
	public void editrolez(String role) throws InterruptedException {	
		Roles.click();
		EditRolebutton.click();
		Thread.sleep(500);
		EditRoleName.clear();
		Thread.sleep(500);
		EditRoleName.sendKeys(role);
		Thread.sleep(500);
		CreateUser.click();
		ReadUser.click();
		submit.click();	
	}	
}
