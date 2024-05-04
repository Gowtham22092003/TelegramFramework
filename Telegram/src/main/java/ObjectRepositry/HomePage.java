package ObjectRepositry;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver,this);		
	}
	
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	@FindBy(linkText = "Books")
	private WebElement BooksLink;
	
	@FindBy(linkText = "Jewelry")
	private WebElement jwelryLink;
	
	
	public WebElement getJwelryLink() {
		return jwelryLink;
	}


	public WebElement getBooksLink() {
		return BooksLink;
	}


	public WebElement getLogoutlink() {
		return logoutlink;
	}


	public WebElement getLoginlink() {
		return loginlink;
	}

	
}


