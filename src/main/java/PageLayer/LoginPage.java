package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy (name= "username")
	private WebElement Uname;

	@FindBy (name= "password")
	private WebElement Pword;
	
	@FindBy (xpath= "//button[text()=' Login ']")
	private WebElement Login;
	
public 	LoginPage() {
	PageFactory.initElements(getDriver(), this);
}
	
	public void loginFunctionality(String uname, String pword) {
		sendkeys(Uname, uname);
		sendkeys(Pword, pword);
		click(Login);
	}

}
