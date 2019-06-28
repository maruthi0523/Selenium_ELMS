package com.elms.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.elms.base.Testbase;
import com.elmspageobjects.EditRole;
import com.elmspageobjects.Loginpage;

public class EditRoleTest extends Testbase{
	Loginpage loginpage;
	EditRole editrole;
	
	public EditRoleTest() {
	}	
		@BeforeTest
		public void setup() throws InterruptedException {
			initialization();
			editrole =new EditRole();
			loginpage =new Loginpage();
 	
	}
		 @Test(priority=1)
		  public void loginpage() throws InterruptedException{
		  loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
		  Thread.sleep(4000);
		  }
		 @Test(priority=2)
	       public void EDITRolez() throws InterruptedException {
			 editrole.editrolez(prop.getProperty("Editrole")); 
			 Thread.sleep(10000);
		 }
		 @AfterTest
		  public void teardown() throws IOException{
			
				driver.quit();
				
		  }
	}
