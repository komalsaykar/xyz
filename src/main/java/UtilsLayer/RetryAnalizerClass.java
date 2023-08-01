package UtilsLayer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import BaseLayer.BaseClass;

public class RetryAnalizerClass extends BaseClass implements IRetryAnalyzer  {

	@Override
	public boolean retry(ITestResult result) {
		int counter=0;
		int max=4;
		
		if(counter<max)
		{
			return true;
		}
		return false;
		
	}

}
