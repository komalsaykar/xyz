package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtendsReports extends BaseClass{

	public static ExtentReports setUp(String ReportName) {
		String path =System.getProperty("user.dir")+"//ExtentReports//"+ReportName+date()+".html";
		
		ExtentSparkReporter esr= new ExtentSparkReporter(path);
		
		ExtentReports report = new ExtentReports();
		report.attachReporter(esr);
		return report;
		
	}
	public static String date() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		
	}
	
	public static String takescreenshot(String folderName, String Screenshot) throws IOException {
		File f = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"//"+folderName+"//"+Screenshot+date()+".png";
		
		FileUtils.copyFile(f,new File (path));
		return path;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
