package com.elmspageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.elms.base.Testbase;

public class AddRole extends Testbase {
	@FindBy(xpath = "//span[contains(text(),'Roles')]")
	WebElement Roles;
	
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/app-admin/page-container/div/div/app-role/div/div/div[3]/div/button")
	WebElement Addrolebutton;
	
	@FindBy(xpath = "//*[@formcontrolname='organisationId']")
	WebElement Organizationname;
	
	@FindBy(xpath = "//*[@value='845']")
	WebElement SelectOrganization;
	
	@FindBy(xpath ="/html/body/ngb-modal-window/div/div/app-role-manupulation/div/div/div/div[2]/form/div[2]/div[2]/div[1]/input")
    WebElement RoleName;
	
	@FindBy (xpath = "//*[@formcontrolname='description']")
	WebElement Description;
	
	@FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-role-manupulation/div/div/div/div[2]/form/div[4]/div[2]/div/div[2]/div[1]/label")
	WebElement Createcourse;
	
	@FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-role-manupulation/div/div/div/div[2]/form/div[4]/div[2]/div/div[2]/div[2]/label" )
	WebElement CourseRead;
	
	@FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-role-manupulation/div/div/div/div[2]/form/div[4]/div[5]/div/div[2]/div[1]/label")
	WebElement Sectioncreate;
	
	@FindBy (xpath ="/html/body/ngb-modal-window/div/div/app-role-manupulation/div/div/div/div[2]/form/div[4]/div[5]/div/div[2]/div[2]/label")
	WebElement Sectionread;
	
	@FindBy (xpath ="/html/body/ngb-modal-window/div/div/app-role-manupulation/div/div/div/div[2]/form/div[4]/div[6]/div/div[2]/div[1]/label")
	WebElement Createtopic;
	
	@FindBy (xpath ="/html/body/ngb-modal-window/div/div/app-role-manupulation/div/div/div/div[2]/form/div[4]/div[6]/div/div[2]/div[2]/label")
	WebElement TopicRead;
	
	@FindBy (xpath = "/html/body/ngb-modal-window/div/div/app-role-manupulation/div/div/div/div[2]/form/div[5]/div/button[2]")
	WebElement submit;
	
	public AddRole() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 25), this);
	}
	
	public void addrolez(String role ,String descri) {
		Roles.click();
		Addrolebutton.click();
		Organizationname.click();
		SelectOrganization.click();
		RoleName.sendKeys(role);
		Description.sendKeys(descri);
		Createcourse.click();
		CourseRead.click();
		Sectioncreate.click();
		Sectionread.click();
		Createtopic.click();
		TopicRead.click();
		submit.click();	
		
}	
}
