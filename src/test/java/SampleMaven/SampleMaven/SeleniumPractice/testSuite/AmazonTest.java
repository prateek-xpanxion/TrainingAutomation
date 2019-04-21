package SampleMaven.SampleMaven.SeleniumPractice.testSuite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SampleMaven.SampleMaven.PropertyLoader;
import SampleMaven.SampleMaven.Listerners.CustomListerner;
import SampleMaven.SampleMaven.Pages.Home;
import SampleMaven.SampleMaven.Pages.Login;


@Listeners(CustomListerner.class)
public class AmazonTest extends BaseTest {
	Login login=null;
	Home home=null;
	
	@org.testng.annotations.BeforeMethod
	public void beforeMethod() {
		login=new Login();
		home=new Home();
	}

	@Test(enabled=false)
	public void initialize() {

		String url="https://www.jetairways.com/EN/IN/home.aspx";
		driver.get(url);
		//Boolean logo = driver.findElement(By.xpath("//[@class='spicejet_logo']")).isDisplayed();
		//Boolean b= driver.findElement(By.class("//[@class='spicejet_logo']"));
		boolean flag=driver.findElement(By.xpath("//a[@title='Jet Airways']")).isDisplayed();
		Assert.assertTrue(flag, "Page not opened");
		String title=	driver.findElement(By.xpath("//a[@title='Jet Airways']")).getText();
		System.out.println(title);
		Assert.assertEquals(title, "jet airways logo (opens the homepage)","Title not matched");
		String actUrl=driver.getCurrentUrl();
		System.out.println(actUrl);
		Assert.assertEquals(actUrl, url,"Both url no matched. Expected url was: "+url);
		Assert.assertTrue(driver.getPageSource().length()>0,"PageSource not found");

	}
	
	@Test
	public void verifyLogin() {
		//System.out.println(clientId);
		login.loginIntoApplication("https://www.jetairways.com/EN/IN/home.aspx").verifyWelcome();
		Assert.assertTrue(false, "Just testing purpose for screen shot");
		
		Assert.assertTrue(home.isReturnSelected(),"By default two way is not selected");
		Assert.assertTrue(home.isTxtReturnenabled(),"return field is disbaled");
		
	}
	@Test
	public void verifyLogin2() {
	//	System.out.println(clientId);
		login.loginIntoApplication("https://www.jetairways.com/EN/IN/home.aspx").verifyWelcome();
		Assert.assertTrue(false, "Just testing purpose for screen shot");
		
		Assert.assertTrue(home.isReturnSelected(),"By default two way is not selected");
		Assert.assertTrue(home.isTxtReturnenabled(),"return field is disbaled");
		
	}
	
	@DataProvider
	private Iterator<Object[]> getTestData() {
		List<Object[]> profileContent = new ArrayList<Object[]>();
		String testData;
		try {
			testData = new PropertyLoader().getKey("clientId");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			testData=null;
			e.printStackTrace();
		}
		if(testData.contains(",")) {
			String[] testArray=testData.split(",");
			for(int i = 0; i < testArray.length; i++) {
				profileContent.add(new String[] { testArray[i] });
			}
		}
		else {
			profileContent.add(new String[] {testData});
		}
		return profileContent.iterator();
	}

}
