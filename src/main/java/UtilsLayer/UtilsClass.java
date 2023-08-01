package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{

	
	public static void sendkeys(WebElement wb, String value)
	{
		if(wb.isDisplayed()&& wb.isEnabled()){
			wb.sendKeys(value);
		}

	}
	
	public static void click(WebElement wb) {
		if(wb.isDisplayed()&& wb.isEnabled()) {
			wb.click();
		}
	}
	
	public static boolean logoStatus(WebElement wb) {
		return wb.isDisplayed();
	}
	
	public static String getTitle() {
		return getDriver().getTitle();
	}
	
	public static String getCurrentUrl() {
		return getDriver().getCurrentUrl();
	}
	
	public static boolean elementStatus(WebElement wb) {
		return (wb.isDisplayed() && wb.isEnabled());
	}
	
	public static String getText(WebElement wb) {
		return wb.getText();
	}
	
	public static String getAttribute(WebElement wb) {
		return wb.getAttribute("value");
	}
	
	public static void RadioButtonHandle(List<WebElement> wb, String Gender) {
		
		for(WebElement abc : wb) {
			String a= null;
			String bbb= abc.getAttribute("value");
			if(Gender.equalsIgnoreCase("Male")) {
				a="1";
			}
			else {
				a="2";
			}
			if(a.equalsIgnoreCase(bbb)) {
				JavaScriptExecutor.click(abc);
				break;
			}
		}
	}
	
	
}















