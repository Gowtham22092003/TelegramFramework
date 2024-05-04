package ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BooksPage  {

	public BooksPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
		
	}
	

}
