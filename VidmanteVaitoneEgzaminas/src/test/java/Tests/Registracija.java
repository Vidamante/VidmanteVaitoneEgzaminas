package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;


public class Registracija extends TestParameters {
	
  @Test
  public void SekmingaRegistracija() throws Exception {
		
		driver.navigate().to("http://localhost:8080/prisijungti");
		HomePage hp = new HomePage(driver);//HomePage tai Pages susikurti ir apsirasyti metodai
		hp.SignUp();
		hp.SignUpData("vidmantevai", "stiprusslaptazodis", "stiprusslaptazodis");
		hp.SubmittApplication();
		System.out.println("Sign up successful.");
		Thread.sleep(3000);
}
  
  @Test
	//  Aktorius įveda egzistuojančios paskyros duomenis (nesėkmės atvejis)
	public void RegistracijaEgzistuojantisVartotojas() throws Exception{
		driver.navigate().to("http://localhost:8080/prisijungti");
		
		HomePage hp = new HomePage (driver);
		hp.SignUp();
		hp.SignUpData("vidmantev", "stiprusslaptazodis", "stiprusslaptazodis");
		hp.SubmittApplication();
		hp.CatchAlerts();
		Thread.sleep(3000);
	}
}
  