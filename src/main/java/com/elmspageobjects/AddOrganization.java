package com.elmspageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import com.elms.base.Testbase;

public class AddOrganization extends Testbase {
	
	@FindBy(xpath = "//span[contains(text(),'Organizations')]")
	WebElement Organization;
	
	@FindBy (xpath = "/html/body/app-root/app-admin-layout/app-admin/page-container/div/div/app-organisation/div/div/div[3]/div/button")
	WebElement AddButton;
	
	@FindBy (xpath ="//*[@placeholder='Organization Name']")
	WebElement OrganizationName;
	
	@FindBy (xpath = "//input[@type='file']")
    WebElement UpImage;
	
	@FindBy (xpath = "//*[@formcontrolname='organisationParent']")
	WebElement ParentOrganization;
	
	@FindBy (xpath="//*[@value='723']")
	WebElement selectParentOrganization;

	
	@FindBy (xpath = "//*[@formcontrolname='description']")
	WebElement Description;
	
	@FindBy (xpath = "//*[@placeholder='Search Your Address']")
	WebElement Address;
	
	@FindBy (xpath = "//span[contains(text(),'CloudNow Technologies Pvt Ltd')]")
	WebElement SelectAddress;

	@FindBy(xpath ="//*[@formcontrolname='phone']")
	WebElement PhoneNUM;
	
	@FindBy(xpath ="/html/body/ngb-modal-window/div/div/app-organisation-manipulation/div/div/div/div[2]/form/div[9]/div/button[2]")
	WebElement Submit;
	
	public AddOrganization() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 25), this);
	}


public void addorgnz(String orgname, String Desc, String address, String phone, String Image) throws InterruptedException {
	Organization.click();
	Thread.sleep(500);
	AddButton.click();
	Thread.sleep(500);
	OrganizationName.sendKeys(orgname);
	Thread.sleep(1500);
	UpImage.sendKeys(Image);
	Thread.sleep(500);
	ParentOrganization.click();
	Thread.sleep(500);
	selectParentOrganization.click();
	Thread.sleep(1000);
	Description.sendKeys(Desc);
	Address.sendKeys(address);
	SelectAddress.click();
	PhoneNUM.sendKeys(phone);
	Submit.click();
	
}
}
















