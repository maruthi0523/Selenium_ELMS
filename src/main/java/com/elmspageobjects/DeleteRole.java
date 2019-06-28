package com.elmspageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.elms.base.Testbase;

public class DeleteRole extends Testbase{
	
	@FindBy(xpath = "//span[contains(text(),'Roles')]")
	WebElement Roles;
    
	@FindBy(xpath = "//*[@id=\"dtBasicExample\"]/tbody/tr[6]/td[6]/div/button[2]/i")
	WebElement RoleDeletebutton;
	
	@FindBy(xpath= "/html/body/ngb-modal-window/div/div/div[3]/button[2]")
	WebElement DeleteButton;
	
	public DeleteRole() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 25), this);
	}
	public void deleterolez() {
		Roles.click();
		RoleDeletebutton.click();
		DeleteButton.click();
	}
}
