package SampleMaven.SampleMaven.Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import SampleMaven.SampleMaven.SeleniumPractice.testSuite.BaseTest;

public class Welcome extends BaseTest {

	public static final String txtTitle="/html/body/div[1]/header/div/a/img']";
	public static final String txtZipCode="//*[@id='TG_ZipCode.Q_Zipcode.Zipcode']";

	public static final String btngetQuote="//*[@class='button evo-button']";



	public void verifyWelcome() {
		waitForSleep(5000);
		String title=driver.findElement(By.xpath("//*[@class='news']")).getText();
		System.out.println(title);
		Assert.assertTrue(title.contains("News"),"Title not matched");
	}

	public boolean verifyLogin(){
		return isDisplayed(btngetQuote);
	}

	public Account navigateToAccountPage(){	
		driver.findElement(By.xpath(txtZipCode)).sendKeys("43571");		
		driver.findElement(By.xpath(btngetQuote)).click();		
		return new Account();

	}

}
