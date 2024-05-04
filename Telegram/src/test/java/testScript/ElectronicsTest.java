package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElectronicsTest {

	@Test //(priority = 0)
	public void register() {
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
	}
	
	@Test  (dependsOnMethods =  "register")//(priority = 1)
	public void login() {
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		//driver.get("abcd");
		driver.quit();
	}
	
	@Test(dependsOnMethods = "login") //(priority = 2)
	public void addtocart() {
		
		WebDriver driver=new ChromeDriver();
		System.out.println("AddtoCart");
		//driver.get("abcd");
		driver.quit();
	}
	
	@Test (dependsOnMethods = "addtocart") //(priority = 3)
	public void Payment() {
		
		WebDriver driver=new ChromeDriver();
		System.out.println("Payment");
	//	driver.get("abcd");
		driver.quit();
	}
	
	@Test (dependsOnMethods = "Payment")//(priority = 4)
	public void ConfirmOrder() {
		
		WebDriver driver=new ChromeDriver();
		System.out.println("ConfirmOrder");
		driver.quit();
	}
}
