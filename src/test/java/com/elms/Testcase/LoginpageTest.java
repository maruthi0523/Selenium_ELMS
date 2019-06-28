package com.elms.Testcase;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.elms.base.Testbase;
import com.elmspageobjects.Loginpage;

import rp.com.google.common.io.BaseEncoding;
import rp.com.google.common.io.Resources;


public class LoginpageTest extends GenerateExtendreports
{
	Testbase tb = new Testbase();
	WebDriver driver;
	String baseurl;
	Properties prop;
	Loginpage loginpage;

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginpageTest.class);
			
public  LoginpageTest() {
	super();	
}
	@BeforeTest
	public void setup()throws Exception {

		tb = new Testbase();
		
		//System.out.println(baseurl); {
	tb.initialization();
		loginpage =new Loginpage();
			
	}
	
		
  @Test
  public void loginpage() throws InterruptedException, Exception{
	  test = extent.createTest("validLogin", "Check with Valid Details");
	  Assert.assertTrue(true);
	  //tb.Testbase();
  loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
  Thread.sleep(4000);
  LOGGER.info("Welcome to letskodeit.com");  //for normal information
  
  LOGGER.info("RP_MESSAGE#BASE64#{}#{}",BaseEncoding.base64().encode(Resources.asByteSource(Resources.getResource
          ("Screenshots/elms.jpg")).read()),"Home page");  //with screenshot

  }
  @AfterTest
  public void teardown() throws IOException{
		driver.close();
	  
  }
}

