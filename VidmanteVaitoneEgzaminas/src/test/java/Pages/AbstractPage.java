package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {
	
	protected WebDriver driver;
	
	//super konstruktorius. Leidzia puslapiams ir testams bendrauti tarpusavyje
	public void Parameters(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
				
	}

}

