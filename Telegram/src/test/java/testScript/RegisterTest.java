package testScript;

import org.testng.annotations.Test;

import ObjectRepositry.HomePage;
import ObjectRepositry.LoginPage;
import genricUtility.BaseClass;

public class RegisterTest extends BaseClass {

	
	@Test
	public void Test_001() {
		
		HomePage home=new HomePage(driver);
	//	LoginPage login=new LoginPage(driver);
		
		home.getBooksLink().click();
	}
	
	
	@Test
	public void Test_002() {
		
		HomePage home=new HomePage(driver);
	//	LoginPage login=new LoginPage(driver);
		
		home.getJwelryLink().click();
	}
}
