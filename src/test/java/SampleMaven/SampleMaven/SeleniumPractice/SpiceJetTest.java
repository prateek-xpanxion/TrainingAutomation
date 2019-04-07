package SampleMaven.SampleMaven.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpiceJetTest {
	public WebDriver driver=null;
	
	@Test
	public void initialize() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		boolean oneWayButton = false;
		boolean roundTripButton= false;
		
		if (oneWayButton) {			
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='spclearDate']")).isEnabled(), "Return Date Lable is disabled.");
		System.out.println("Return Date Lable is disabled");
		}
		if (roundTripButton=true) {
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).isEnabled(), "Return Date Lable is enabled.");	
			System.out.println("Return Date Lable is enabled");
		}
		
	}

}
