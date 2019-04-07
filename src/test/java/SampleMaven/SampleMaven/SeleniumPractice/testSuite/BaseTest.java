package SampleMaven.SampleMaven.SeleniumPractice.testSuite;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import SampleMaven.SampleMaven.PropertyLoader;

public class BaseTest {


	public static WebDriver driver=null;


	public void initilizedriver(String browser) {

		if(browser.equalsIgnoreCase(("chrome"))) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase(("mozilla"))) {
			System.setProperty("webdriver.chrome.driver", "path of mozilla driver");
			driver=new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	@BeforeMethod
	public void BeforeMethod() throws FileNotFoundException, IOException {
		String ss=new PropertyLoader().getKey("browser");
		initilizedriver(ss);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}


}
