/**
 * 
 */
package extentutility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import test.BaseTest;

/*
 * @author Avdhut Pawar
 * @date 2023-03-02
 * @description  
 */
public class Listenerrrr extends BaseTest implements ITestListener {
	
	ExtentReports extent = CustomRepoeterrrr.extentReporterGenrator();
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test is passed");
	}


	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}
	

}
