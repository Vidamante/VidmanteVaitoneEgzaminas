package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;


public class VisiTestai extends TestParameters {
	
	@Test
	public void SekmingasAtsijungimas() throws Exception {
		driver.navigate().to("http://localhost:8080/skaiciuotuvas");
		
		HomePage hp = new HomePage (driver);
//sekminga registracija
		hp.SignUp();
		hp.SignUpData("vidmantevaitone", "stiprusslaptazodis", "stiprusslaptazodis");
		hp.SubmittApplication();
		System.out.println("Sign up successful."); //Sign up successful.
		Thread.sleep(3000);
		hp.LogOut();
		hp.CatchAlertsLogOut();
		Thread.sleep(3000);
//nesekminga registracija
		driver.navigate().to("http://localhost:8080/prisijungti");
		hp.SignUp();
		hp.SignUpData("vidmantev", "stiprusslaptazodis", "stiprusslaptazodis");
		hp.SubmittApplication();
		hp.CatchAlerts(); //Toks vartotojo vardas jau egzistuoja
		Thread.sleep(3000);
//sekmingas prisijungimas ir atsijungimas
		driver.navigate().to("http://localhost:8080/prisijungti");
		//Thread.sleep(3000);
		hp.SignInData("vidmantev", "stiprusslaptazodis");
		//Thread.sleep(3000);
		hp.SubmitPrisijungti();
		System.out.println("Sign up successful."); //Sign up successful.
		Thread.sleep(3000);
		hp.LogOut();
		hp.CatchAlertsLogOut();  //konsolėje: Sėkmingai atsijungėte
		Thread.sleep(3000);
//nesekmingas prisijungimas
		driver.navigate().to("http://localhost:8080/prisijungti");
		//Thread.sleep(3000);
		hp.SignInData("", "stiprusslaptazodis");
		//Thread.sleep(3000);
		hp.SubmitPrisijungti();
		hp.CatchAlertsLogin();   //Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi
		
	} 
		
	}

