package ObjectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {

	public JewelryPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[.='Black & White Diamond Heart']/../../../..//input")
	private WebElement BlackdimondheartAddToCartButton;
	
	@FindBy(xpath = "//a[.='Create Your Own Jewelry']/../../../..//input")
	private WebElement OwnJewelryAddToCartButton;
	
	@FindBy(xpath = "//a[.='Diamond Pave Earrings']/..")
	private WebElement DimondPaveButton;

	public WebElement getBlackdimondheartAddToCartButton() {
		return BlackdimondheartAddToCartButton;
	}

	public WebElement getOwnJewelryAddToCartButton() {
		return OwnJewelryAddToCartButton;
	}

	public WebElement getDimondPaveButton() {
		return DimondPaveButton;
	}
	

}
