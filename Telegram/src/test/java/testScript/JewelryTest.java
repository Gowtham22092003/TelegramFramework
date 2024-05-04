package testScript;

import org.testng.annotations.Test;

import ObjectRepositry.HomePage;
import ObjectRepositry.JewelryPage;
import genricUtility.BaseClass;

public class JewelryTest extends BaseClass {
	
	
	@Test
	public void jewelry_001() {
		
		HomePage home=new HomePage(driver);
		
		JewelryPage jewelry=new JewelryPage(driver);
		
		
		home.getJwelryLink().click();
		
		getWebapageScreenshot(driver);
		
		getwebElementScreenshots(jewelry.getBlackdimondheartAddToCartButton());
		
		
	}

}
