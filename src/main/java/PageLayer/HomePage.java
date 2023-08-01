package PageLayer;

import static UtilsLayer.UtilsClass.click;
import static UtilsLayer.UtilsClass.elementStatus;
import static UtilsLayer.UtilsClass.getCurrentUrl;
import static UtilsLayer.UtilsClass.getTitle;
import static UtilsLayer.UtilsClass.logoStatus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//img[@alt='client brand banner']")
	private WebElement Logo;
	
	@FindBy (xpath="(//a[@class='oxd-main-menu-item'])[1]")
	private WebElement AdminLink;
	
	@FindBy (xpath="(//a[@class='oxd-main-menu-item'])[2]")
	private WebElement PIMLink;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement LogOutDropDown;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement LogOutLink;
	
	public HomePage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public String homePageTitle() {
		return getTitle();
	}
	
	public String homePageUrl() {
		return getCurrentUrl();
	}
	
	public boolean homePageLogo() {
		return logoStatus(Logo);
	}
	
	public boolean adminLink() {
		return elementStatus(AdminLink);
	}
	
	public boolean PIMLink() {
		return elementStatus(PIMLink);
	}
	
	public boolean clickonLogOutDropDown() {
		 click(LogOutDropDown);
		 return elementStatus(LogOutLink);
	}
	
	
}
