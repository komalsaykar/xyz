package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class SelectClass extends BaseClass{
	
	public static void findElements(List<WebElement> wb, String value) {
		for(WebElement abc : wb) {
			if(abc.getText().equalsIgnoreCase(value)) {
				abc.click();
				break;
			}
		}
		
	}

}
