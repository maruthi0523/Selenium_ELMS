package com.elms.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.elms.base.Testbase;
import com.elmspageobjects.AddOrganization;
import com.elmspageobjects.Loginpage;

public class AddOrganizationTest extends Testbase {
	Loginpage loginpage;	
    AddOrganization Addorgn;
public AddOrganizationTest() {

 }

	 @BeforeTest
		public void setup() throws InterruptedException {
			initialization();
			Addorgn =new AddOrganization();
			loginpage =new Loginpage();
 }
	 @Test(priority=1)
	  public void loginpage() throws InterruptedException{
	  loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
	  Thread.sleep(4000);
	  }
	 @Test(priority=2)
       public void ADDOrgnz() throws InterruptedException {
	  Addorgn.addorgnz(prop.getProperty("OrganizationName"), prop.getProperty("Imagepath"), prop.getProperty("Description"),prop.getProperty("SearchAddress"), prop.getProperty("Phone"));
	  Thread.sleep(10000);
  }
  
  @AfterTest
  public void teardown() throws IOException{
		driver.quit();
  }
}
