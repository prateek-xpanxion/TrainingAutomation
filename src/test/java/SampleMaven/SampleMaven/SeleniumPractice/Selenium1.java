package SampleMaven.SampleMaven.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium1 {
	
	public WebDriver driver=null;
	
	@Test
	public void initialize() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		boolean logo=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		//Assert.assertTrue(logo,"page not opened");
		//Assert.assertEquals("prateek", "prateek","not matched");
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium webdriver");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li[1]/div[1]/div/span")).click();
		//WebElement webElement= driver.findElement(By.ByXPath)
		
		driver.close();
		driver.quit();
		
		
	}

}
