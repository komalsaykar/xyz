package UtilsLayer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import BaseLayer.BaseClass;

public class RetryTransformSetUp extends BaseClass implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(RetryAnalizerClass.class);
	}

	
	
	
	
	
}
