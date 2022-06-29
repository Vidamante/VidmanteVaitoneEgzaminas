package Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

public class TestParameters {
	
	protected static WebDriver driver;
	

	@BeforeTest
	public void SetUp() {
		driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
				
	}
	
	/*@BeforeTest
	public static void SetUp () {
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		driver = new FirefoxDriver(options);//3 eilutes paleidzia testa, bet narsykle atidaroma
		driver = new FirefoxDriver(); //paleidzia narsykle
	}*/
	
	@AfterTest
	public void TearDown() {
		driver.manage().deleteAllCookies();
		driver.close();
	}
	

}
