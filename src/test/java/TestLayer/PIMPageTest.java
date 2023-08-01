package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;

public class PIMPageTest extends BaseClass{
	@Test
	public void validatePIMPageFunctionality() {
		PIMPage pimpage =new PIMPage();
		pimpage.PIMPageFunctionality("komal", "mayur", "saykar");
		System.out.println(pimpage.EmpID);
	}

}
