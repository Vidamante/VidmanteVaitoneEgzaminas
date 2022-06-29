package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;

public class Atsijungimas extends TestParameters {
	
	// aktorius užeina į pagrindinį langą,  suveda prisijungimo duomenis, paspaudžia "logout admin" (sėkmės scenarijus)
	
			@Test
			public void SekmingasAtsijungimas() throws Exception {
				driver.navigate().to("http://localhost:8080/skaiciuotuvas");
				
				HomePage hp = new HomePage (driver);
//				Thread.sleep(3000);
				hp.SignInData("ziddabb", "123123");
//				Thread.sleep(3000);
				hp.SubmitPrisijungti();
				hp.LogOut();
				hp.CatchAlertsLogOut();
				Thread.sleep(3000);
//				System.out.println("Mano testas");
			}

}
