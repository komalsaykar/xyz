package UtilsLayer;


	
	import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseLayer.BaseClass;

	public class ListnerClass extends BaseClass  implements ITestListener {

		ExtentReports reports;
		ExtentTest extTest;
		
		@Override
		public void onStart(ITestContext context) {
			reports= ExtendsReports.setUp(context.getSuite().getName()); 
			
		}
		@Override
		public void onTestStart(ITestResult result) {
			extTest =reports.createTest("Test is started"+ result.getMethod().getMethodName());
			
		}
		@Override
		public void onTestSuccess(ITestResult result) {
			extTest.log(Status.PASS, "Test is pass"+ result.getMethod().getMethodName());
			try {
				extTest.addScreenCaptureFromPath(ExtendsReports.takescreenshot("passcreenshot",result.getMethod().getMethodName()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public void onTestFailure(ITestResult result) {
			extTest.log(Status.FAIL, "Test is fail"+ result.getMethod().getMethodName());
			try {
				extTest.addScreenCaptureFromPath(ExtendsReports.takescreenshot("failscreenshot",result.getMethod().getMethodName()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Override
		public void onTestSkipped(ITestResult result) {
			extTest.log(Status.SKIP, "Test is skip"+ result.getMethod().getMethodName());
		}

		
		@Override
		public void onFinish(ITestContext context) {
			reports.flush();
			
		}
		
		
			
		
		
	}


