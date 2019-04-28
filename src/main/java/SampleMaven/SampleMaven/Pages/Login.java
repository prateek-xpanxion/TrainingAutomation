package SampleMaven.SampleMaven.Pages;

import SampleMaven.SampleMaven.SeleniumPractice.testSuite.BaseTest;

public class Login extends BaseTest {
	
	
	public Welcome loginIntoApplication(String url) {
		driver.get(url);
		waitForSleep(500);
		return new Welcome();
	}

}
