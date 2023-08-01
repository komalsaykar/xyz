package PageLayer;

import static UtilsLayer.UtilsClass.click;
import static UtilsLayer.UtilsClass.sendkeys;

import java.util.List;
import static UtilsLayer.SelectClass.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.JavaScriptExecutor;

public class PIMPagePersonalInfo extends BaseClass{

	@FindBy(xpath="//input[@name='lastName']/following::input[4]")
	private WebElement DLNumber;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[6]")
	private WebElement DLExpDate;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-selector']/li[2]//p")
	private WebElement DLExpYear;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-dropdown']/li")
	private List<WebElement> DLExpListofYear;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-selector']/li[1]")
	private WebElement DLExpMonth;
	
	@FindBy(xpath="//ul[@class='oxd-calendar-dropdown']/li")
	private List<WebElement> DLExpListofMonth;
	
	@FindBy(xpath="//div[@class='oxd-calendar-dates-grid']/div")
	private List<WebElement> DLExpListofDate;
	
	@FindBy(xpath="//input[@name='lastName']/following::input[6]")
	private WebElement SSNNo;
	
	@FindBy(xpath="//input[@name='lastName']/following::input[7]")
	private WebElement SINNo;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement Nationality;
	
	@FindBy(xpath="//div[@class='oxd-select-dropdown --positon-bottom']/div")
	private List<WebElement> ListofNationality;
	
	@FindBy(xpath="(//button[text()=' Save '])[2]/preceding::input[@type='radio']")
	private List<WebElement> Gender;
	
	@FindBy(xpath="(//button[text()=' Save '])[2]")
	private WebElement SaveOnPIMPage;
	
	public PIMPagePersonalInfo() {
		PageFactory.initElements(getDriver(), this);
	}

	public void PIMPagePersonalInfoFunctionality(String DLNum,String year, String month, String date, String SSNo, 
			String SINo, String nationality , String gender) throws InterruptedException {
		Thread.sleep(10000);
		JavaScriptExecutor.sendKeys(DLNumber, DLNum);
		Thread.sleep(5000);
	//sendkeys(DLNumber,DLNum);
	click(DLExpDate);
	
	click(DLExpYear);
	findElements(DLExpListofYear ,year );
	click(DLExpMonth);
	findElements(DLExpListofMonth , month);
	findElements(DLExpListofDate , date);
	Thread.sleep(5000);
	sendkeys(SSNNo,SSNo);
	sendkeys(SINNo, SINo);
	click(Nationality);
	
	findElements(ListofNationality , nationality);
	Thread.sleep(5000);
	
	findElements(Gender , gender);
	Thread.sleep(5000);
	click(SaveOnPIMPage);
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}
