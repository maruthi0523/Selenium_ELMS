package com.elms.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.elms.base.Testbase;
import com.elmspageobjects.ForgotPassword;
import com.elmspageobjects.Loginpage;

public class ForgotPasswordTest extends Testbase{
	ForgotPassword password;
	public ForgotPasswordTest() {
	
	}
			@BeforeTest
		public void setup() throws InterruptedException {
			initialization();
			password =new ForgotPassword();
			
		
	}
			@Test(priority=1)
			  public void ForgotPswd () throws InterruptedException {
			password.forgotPswd(prop.getProperty("Emailid"));
				Thread.sleep(4000);
			  }

{
}

	@AfterTest
	public void Forgotpassword() throws IOException{
		driver.quit();
	
}
}

