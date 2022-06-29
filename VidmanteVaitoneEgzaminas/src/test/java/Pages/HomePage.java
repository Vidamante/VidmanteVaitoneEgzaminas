package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
	//1. lokatoriai
	
	By sukurtiPaskyra = By.xpath("/html/body/div/form/div/h4/a");
	By inputUserName = By.id("username");
	By inputPassword = By.id("password");
	By inputPasswordConfirm = By.id("passwordConfirm");
	By sukurtiClick = By.xpath("//*[@id=\"userForm\"]/button");
	By textMessage = By.xpath("//*[@id=\"username.errors\"]");
	By prisijungtiClick = By.xpath("/html/body/div/form/div/button");
	By inputUserName2 = By.xpath("/html/body/div/form/div/input[1]");
	By inputPassword2 = By.xpath("/html/body/div/form/div/input[2]");
	By logOut = By.xpath("/html/body/nav/div/ul[2]/a");
	
	
	
	//2. konstruktorius
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//3. Metodai/funkcijos
	
	public void SignUp() {
		driver.findElement(sukurtiPaskyra).click();
}
	
	public void SignUpData(String username, String password, String password2) { //duomenu ivedimas teste rankomis
		driver.findElement(inputUserName).sendKeys(username);
		driver.findElement(inputPassword).sendKeys(password);
		driver.findElement(inputPasswordConfirm).sendKeys(password2);
	}
	
	public void SubmittApplication() throws Exception {
		Thread.sleep(3000);
		driver.findElement(sukurtiClick).click();
		Thread.sleep(3000);
	}
	
	public void CatchAlerts() throws Exception { // pranešimo teksto nuskaitymas 
		
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//*[@id=\"username.errors\"]")).getText();
        System.out.println(text);

	}
	
	public void SignInData(String username2, String password2) throws Exception { //duomenu ivedimas rankutem
		driver.findElement(inputUserName2).sendKeys(username2);
		Thread.sleep(3000);
		driver.findElement(inputPassword2).sendKeys(password2);
		Thread.sleep(3000);
		
	}
	public void SubmitPrisijungti() throws Exception {
		Thread.sleep(3000);
		driver.findElement(prisijungtiClick).click();
		Thread.sleep(3000);
	}
	
	public void CatchAlertsLogin() throws Exception { // pranešimo teksto nuskaitymas 
		
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("/html/body/div/form/div/span[2]")).getText();
        System.out.println(text);
	}
	
	public void LogOut() {
		driver.findElement(logOut).click();
}
	
	public void CatchAlertsLogOut() throws Exception { // pranešimo teksto nuskaitymas 
		
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("/html/body/div/form/div/span[1]")).getText();
        System.out.println(text);
	}
}