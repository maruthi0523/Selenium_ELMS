package com.elms.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Testbase {
   
	public static WebDriver driver;
	public static Properties prop;
	
	public  Testbase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream (System.getProperty("user.dir")+"/src/main/java/com/elms"
					+ "/config/Configproperties");
			prop.load(ip);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			}catch (Exception e) {
				e.printStackTrace();
			// TODO: handle exception
		}
	}
	public static void initialization() {
		String browserName = prop.getProperty("browser") ;
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","..//Elms_automation//Drivers//chromedriver");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","../Elms_automation/Drivers/geckodriver" );
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
	}
	
}
