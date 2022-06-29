package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;


public class Prisijungimas extends TestParameters {
	
	// aktorius užeina į pagrindinį langą,  suveda prisijungimo duomenis (sėkmės scenarijus)
	
		@Test
		public void SekmingasPrisijungimas() throws Exception {
			driver.navigate().to("http://localhost:8080/prisijungti");
			
			HomePage hp = new HomePage (driver);
//			Thread.sleep(3000);
			hp.SignInData("vidmantev", "stiprusslaptazodis");
//			Thread.sleep(3000);
			hp.SubmitPrisijungti();
			Thread.sleep(3000);
			System.out.println("Sign in successful.");
			Thread.sleep(3000);
			hp.LogOut();
		}
		
		@Test
		//  Aktorius prisijungimo lange neįveda jokio vartotojo vardo  (nesėkmės atvejis)
		public void NesekmingasPrisijungimas() throws Exception{
			driver.navigate().to("http://localhost:8080/prisijungti");
			
			HomePage hp = new HomePage (driver);
//			Thread.sleep(3000);
			hp.SignInData("", "stiprusslaptazodis");
//			Thread.sleep(3000);
			hp.SubmitPrisijungti();
			hp.CatchAlertsLogin();
			
		} 
}
