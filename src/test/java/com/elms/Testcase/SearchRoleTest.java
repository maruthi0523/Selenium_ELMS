package com.elms.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.elms.base.Testbase;
import com.elmspageobjects.Loginpage;
import com.elmspageobjects.SearchRole;

public class SearchRoleTest extends Testbase{
	Loginpage loginpage;
	SearchRole searchroles;
	
	
	public SearchRoleTest() {
	}	
	@BeforeTest
	public void setup() throws InterruptedException {
		initialization();
		searchroles =new SearchRole();
		loginpage =new Loginpage();
		Thread.sleep(3000);
	}
	@Test(priority=1)
	  public void loginpage() throws InterruptedException{
	  loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
	  Thread.sleep(8000);
	  }
	@Test(priority=2)
    public void SEARCHRolez() throws InterruptedException {
		searchroles.searchrolez(prop.getProperty("Searchrolename"), prop.getProperty("SearchOrg"));
		Thread.sleep(10000);
	}
	 @AfterTest
	  public void teardown() throws IOException{
		
			driver.quit();	
	 }	
}
