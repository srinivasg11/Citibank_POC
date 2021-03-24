package com.report;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportUtil {
	static ExtentReports extent;
	static ExtentTest test;

	public static void startTest() {
		System.out.println("Start of Extent Report");
		extent = new ExtentReports(System.getProperty("user.dir") + "report/ExtentHTML_Report.html");
		test = extent.startTest("CitiBank_POC");
		test.log(LogStatus.PASS, "Test Case is Passed");
		test.log(LogStatus.FAIL, "Test Case is Failed");
		test.log(LogStatus.SKIP, "Test Case is Skipped");
	}

	public static void endTest() {
		extent.endTest(test);
		extent.flush();
	}
	
	
}