package com.elmspageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.elms.base.Testbase;

public class SearchRole extends Testbase{
	
	@FindBy(xpath = "//span[contains(text(),'Roles')]")
	WebElement Roles;
	
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/app-admin/page-container/div/div/app-role/div/div/div[3]/div/input")
	WebElement SearchButton;

	public SearchRole() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 25), this);
	}
	public void searchrolez(String role, String org) throws InterruptedException {
		Roles.click();
		Thread.sleep(3000);
		SearchButton.sendKeys(role);
		SearchButton.clear();
		Thread.sleep(3000);
		SearchButton.sendKeys(org);
	}
}

