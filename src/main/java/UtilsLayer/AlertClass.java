package UtilsLayer;

import BaseLayer.BaseClass;

public class AlertClass extends BaseClass {
public static void clickOnOkButton()
{
	 getDriver().switchTo().alert().accept();
}
	
	public static void clickOnCancelButton()
	{
		getDriver().switchTo().alert().dismiss();
	}
	
	
	public static String caputerText()
	{
		String text=getDriver().switchTo().alert().getText();
		return text; 
	}
	
	public static void sendText(String value)
	{
		getDriver().switchTo().alert().sendKeys(value);
	}
	
	
	
	
	
}
