package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

public class HomePageTest extends BaseClass{
	HomePage homepage;
	@Test(priority=1)
	public void validateUrl() {
		homepage = new HomePage();
		String a=homepage.homePageUrl();
		Assert.assertEquals(a.contains("dashboard"), true);
	}
	
	@Test(priority=2)
	public void validateTitle() {
		
		String b=homepage.homePageTitle();
		Assert.assertEquals(b.equals("OrangeHRM"), true);
	}
	
	@Test(priority=3)
	public void validateLogo() {
		
		boolean c=homepage.homePageLogo();
		Assert.assertEquals(c, true);
	}
	
	@Test(priority=4)
	public void validateAdminlink() {
		
		Assert.assertEquals(homepage.adminLink(), true);
	}
	
	@Test(priority=5)
	public void validatePIMlink() {
		
		Assert.assertEquals(homepage.PIMLink(), true);
	}
	
	@Test(priority=6)
	public void validateLogOutclick() {
		
		Assert.assertEquals(homepage.clickonLogOutDropDown(), true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
