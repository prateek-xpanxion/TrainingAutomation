package SampleMaven.SampleMaven.Pages;

import SampleMaven.SampleMaven.SeleniumPractice.testSuite.BaseTest;

public class Login extends BaseTest {
	
	
	public Welcome loginIntoApplication(String url) {
		driver.get(url);
		
		return new Welcome();
	}

}
