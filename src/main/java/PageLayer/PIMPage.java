package PageLayer;

import static UtilsLayer.UtilsClass.click;
import static UtilsLayer.UtilsClass.getAttribute;
import static UtilsLayer.UtilsClass.sendkeys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class PIMPage extends BaseClass {

	@FindBy (xpath="(//a[@class='oxd-main-menu-item'])[2]")
	private WebElement PIMLink;
	
	@FindBy (xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement AddEmp;
	
	@FindBy (name="firstName")
	private WebElement Fname;
	
	@FindBy (name="middleName")
	private WebElement Mname;
	
	@FindBy (name="lastName")
	private WebElement Lname;
	
	@FindBy (xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement EmpId;
	
	@FindBy (xpath="//button[text()=' Save ']")
	private WebElement SaveButton;
	
	
	public PIMPage() {
		PageFactory.initElements(getDriver(), this);
	}
	public static String EmpID;
	public void PIMPageFunctionality(String FirstName, String MiddleName, String LastName) {
		click(PIMLink);
		click(AddEmp);
		sendkeys(Fname, FirstName);
		sendkeys(Mname, MiddleName);
		sendkeys(Lname, LastName);
		EmpID=getAttribute(EmpId);
		

		click(SaveButton);
		
		
	}
	
}
