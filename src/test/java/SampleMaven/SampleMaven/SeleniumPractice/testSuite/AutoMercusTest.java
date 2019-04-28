package SampleMaven.SampleMaven.SeleniumPractice.testSuite;

import org.testng.Assert;
import org.testng.annotations.Test;

import SampleMaven.SampleMaven.Pages.Account;
import SampleMaven.SampleMaven.Pages.Login;
import SampleMaven.SampleMaven.Pages.Welcome;

public class AutoMercusTest extends BaseTest {
	Login login=null;
	Welcome welcome=null;
	
	@org.testng.annotations.BeforeMethod
	public void beforeMethod() {
		login=new Login();
		welcome=new Welcome();
		
	}


	@Test
	public void verifyLogin() {
		//System.out.println(clientId);
		Assert.assertTrue(login.loginIntoApplication("https://qa2.auto.marshpm.com/auto/Application?clientID=065").verifyLogin(),"Not able to login onto the application");
		Account acct=welcome.navigateToAccountPage();
		String acctTitle=acct.getAccountPage();
		Assert.assertEquals(acctTitle, "Create Account", "Account Page not opened");
		acct.fillForm();

	}
}
