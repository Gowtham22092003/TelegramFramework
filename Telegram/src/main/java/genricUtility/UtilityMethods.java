package genricUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {

	
	// TO TAKE WEBPAGE SCREENSHOT
	public static void getWebapageScreenshot(WebDriver driver) {
		
	
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File perm=new File("./Screenshots/"+getTime()+".png");
		
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//TO TAKE WEBELEMENT SCREENSHOT
	public static void getwebElementScreenshots(WebElement element) {
		
		File temp = element.getScreenshotAs(OutputType.FILE);
		

		File perm = new File("./Screenshots/"+getTime()+".png");
		
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	
	//SWITCH TO WINDOW BY TITLE
	public static void SwitchToWindowByTitle(WebDriver driver,String title) {
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String window : allwindows) {
			
			driver.switchTo().window(window);
			
			String actualtitle = driver.getTitle();
			
			if (actualtitle.contains(title)){
				break;
				
			}
		}
		
	}
	
	
	//SWITCH TO WINDOW BY URL
	public static void SwitchToWindowByUrl(WebDriver driver,String Url) {
		
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String window : allwindows) {
				
			driver.switchTo().window(window);
				
			String actualUrl = driver.getCurrentUrl();
			if (actualUrl.contains(Url)) {
				break;
			}
		}
	}
	
	//SELCT THE DROPDWON BY INDEX
	public static void selectOptionByIndex(WebElement dropdown,int index) {
		
		Select select=new Select(dropdown);
		select.selectByIndex(index);
	}
	
	//SELECT THE DROPOWN BY VALUE
	public static void selectOptionByValue(WebElement dropdown,String value) {
		
		Select select=new Select(dropdown);
		select.selectByValue(value);
		
	}
	
	//SELECT THE DROPDOWN BY VISIBILETEXT
	public static void selectOptionByVisibleText(WebElement dropdown,String VisibleText) {
		
		Select select=new Select(dropdown);
		select.selectByVisibleText(VisibleText);
	}
	
	public static String getTime() {
		return LocalDateTime.now().toString().replace(":", "_").replace("-", "_");
	}
	
}
