package SampleMaven.SampleMaven.Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import SampleMaven.SampleMaven.SeleniumPractice.testSuite.BaseTest;

public class Welcome extends BaseTest {
	
	public static final String txtTitle="//a[@title='Jet Airways']";
	
	
	public void verifyWelcome() {
		String title=driver.findElement(By.xpath(txtTitle)).getText();
		System.out.println(title);
		Assert.assertEquals(title, "jet airways logo (opens the homepage)","Title not matched");
	}

}
