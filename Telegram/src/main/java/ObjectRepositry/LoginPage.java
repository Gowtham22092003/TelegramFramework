package ObjectRepositry;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import genricUtility.BaseClass;

	public class LoginPage{

		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id = "Email")
		private WebElement loginemailTextfield;
		

		@FindBy(id = "Password")
		private WebElement loginPasswordTextfield;
		
		
		@FindBy(xpath = "//input[@class='button-1 login-button']")
		private WebElement loginpageloginbutton;

		
		
		public WebElement getLoginemailTextfield() {
			return loginemailTextfield;
		}

		public WebElement getLoginPasswordTextfield() {
			return loginPasswordTextfield;
		}

		public WebElement getLoginpageloginbutton() {
			return loginpageloginbutton;
		}

		
	}

