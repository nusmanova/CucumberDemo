package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage {

	static WebElement  element = null;
	
//WebDriver driver;

//@FindBy (name ="q")
//WebElement search;

	
	
public static WebElement textbox_search (WebDriver driver) {
	element =driver.findElement(By.name("q"));
	return element;
	
	
	}

public static WebElement hits_enter (WebDriver driver) {
	element =driver.findElement(By.name("q"));
	return element;
	
}

}
		
	


