package genricUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ObjectRepositry.HomePage;
import ObjectRepositry.LoginPage;

public class BaseClass extends UtilityMethods {

	public WebDriver driver;
	
	@BeforeSuite
	public void Bs() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void Bt() {
		
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void LaunchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void login() {
	
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		
		home.getLoginlink().click();
		login.getLoginemailTextfield().sendKeys("gautham12345@gmail.com");
		login.getLoginPasswordTextfield().sendKeys("Gautham223344");
		login.getLoginpageloginbutton().click();
		
		System.out.print("Before method");
		
		
	}
	
	@AfterSuite
	public void as() {
		System.out.println("after suite");
	}
	
	@AfterTest
	public void at() {
		
		System.out.println("after test");
	}
	
	@AfterClass
	public void ac() {
		
		driver.quit();
		System.out.println("after class");
	}
	
	@AfterMethod
	public void am() {
		
		HomePage home=new HomePage(driver);
		home.getLogoutlink().click();
		System.out.println("after method");
	}
	
	
	
}
