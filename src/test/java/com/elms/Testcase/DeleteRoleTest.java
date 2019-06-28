package com.elms.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.elms.base.Testbase;
import com.elmspageobjects.DeleteRole;
import com.elmspageobjects.Loginpage;

public class DeleteRoleTest extends Testbase{
	Loginpage loginpage;
	DeleteRole deleterole;
	
	public DeleteRoleTest() {
	}	
	
	@BeforeTest
	public void setup() throws InterruptedException {
		initialization();
		deleterole =new DeleteRole();
		loginpage =new Loginpage();
}
	 @Test(priority=1)
	  public void loginpage() throws InterruptedException{
	  loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
	  Thread.sleep(6000);
	  deleterole.deleterolez();
	  Thread.sleep(10000);
	 }
	/* @Test(priority=2) Pasted in above loginpage method 
     public void DELETERolez() throws InterruptedException {
		 deleterole.deleterolez();
		 Thread.sleep(15000);
	 }*/
	 
	 @AfterTest
	  public void teardown() throws IOException{
			driver.quit();
	  }	 
}
