package com.elms.Testcase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.elms.base.Testbase;

public class GenerateExtendreports extends Testbase{
	ExtentHtmlReporter htmlReporter;
	protected ExtentReports extent;
	protected ExtentTest test;
	
	public GenerateExtendreports() {
		super();
	}
@BeforeTest
public void startReport() {
	htmlReporter = new ExtentHtmlReporter(System.getProperty("user+dir")+"/ExtentReports/LoginValidations.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	
	extent.setSystemInfo("OS", "windows");
	extent.setSystemInfo("Host", "Maruthi");
	extent.setSystemInfo("Environment", "QA");
	extent.setSystemInfo("User Name", "Maruthi");
	
	htmlReporter.config().setChartVisibilityOnOpen(true);
	htmlReporter.config().setDocumentTitle("AutomationTesting Demo Report");
	htmlReporter.config().setReportName("QA Report");
	htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlReporter.config().setTheme(Theme.DARK);
}
@AfterMethod

public void getResult(ITestResult result) {
	if (result.getStatus() == ITestResult.FAILURE) {
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:",ExtentColor.RED));  	
		test.fail(result.getThrowable());
	}
	 else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} 
	 else 
     {
test.log(Status.SKIP,
MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
test.skip(result.getThrowable());
}
	
}
@AfterTest
public void tearDown() {
	extent.flush();

}
}
