package com.elms.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.elms.base.Testbase;
import com.elmspageobjects.AddRole;
import com.elmspageobjects.Loginpage;

public class AddRoleTest extends Testbase{
	Loginpage loginpage;
	AddRole addroles;
	
	public AddRoleTest() {
		}
	
	@BeforeTest
	public void setup() throws InterruptedException {
		initialization();
		addroles=new AddRole();
		loginpage =new Loginpage();	
	}
	 @Test(priority=1)
	 public void loginpage() throws InterruptedException{
		  loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
		  Thread.sleep(4000);
		  }
	 @Test(priority=2) 
	 public void ADDRolez() throws InterruptedException {
		 addroles.addrolez(prop.getProperty("Rolename"), prop.getProperty("Description"));
		 Thread.sleep(10000);
	 }
	 @AfterTest
	  public void teardown() throws IOException{
			driver.quit();
}
}
	


