package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JavaScriptExecutor extends BaseClass {
	

		public static void sendKeys(WebElement wb, String value) {
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].value='" + value + "';", wb);

		}

		public static void click(WebElement wb) {
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", wb);

		}

	}


