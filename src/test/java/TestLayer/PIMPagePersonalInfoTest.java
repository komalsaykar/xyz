package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.PIMPagePersonalInfo;

public class PIMPagePersonalInfoTest extends BaseClass {

	@Test
	public void validatePIMPersonalInfo() throws InterruptedException {
		PIMPagePersonalInfo  PIMinfo  =  new PIMPagePersonalInfo();
		PIMinfo.PIMPagePersonalInfoFunctionality("2356","2023", "Oct", "23", "7896", "5524", "Indian", "Male");
	}
}
