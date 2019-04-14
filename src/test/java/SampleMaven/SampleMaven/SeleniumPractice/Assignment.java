package SampleMaven.SampleMaven.SeleniumPractice;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment {
	public static WebDriver driver=null;
	@Test
	public void initialize() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String url= "https://qa2.auto.marshpm.com/auto/Application?clientID=065";
		driver.get(url);
		Thread.sleep(2000);
        Random r= new Random();
        int random=r.nextInt(899999)+100000;
		driver.findElement(By.className("input-group-field")).sendKeys("43571");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='input-group-button']//button[@class='button evo-button']")).click();
		driver.findElement(By.xpath("//*[@id='TG_Register.G_PIName.Q_FirstName.FirstName']")).sendKeys("Deepali");
		driver.findElement(By.xpath("//*[@id='TG_Register.G_PIName.Q_MiddleInitial.Initial']")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id='TG_Register.G_PIName.Q_LastName.LastName']")).sendKeys("Tarange");
		
		Select s = new Select(driver.findElement(By.id("TG_Register.G_PIName.Q_Suffix.Suffix")));
		s.selectByVisibleText("Jr");
		//s.deselectAll();
		
		driver.findElement(By.xpath("//*[@id='TG_Register.G_PIName.Q_DOB.DOB']")).sendKeys("10/24/1991");
		driver.findElement(By.xpath("//*[@id='TG_Register.G_PIName.G_EMPID.Q_EMPID.EMPID']")).sendKeys(String.valueOf(random));
		driver.findElement(By.xpath("//*[@id='TG_Register.G_PIName.Q_PersonalEmail.PersonalEmail']")).sendKeys(new Random().nextInt(5)+"@gmail.com");
		driver.findElement(By.xpath("//*[@id='TG_Register.G_LoginInfo.Q_UserName.UserName']")).sendKeys("Deep"+random);
		driver.findElement(By.xpath("//*[@id='TG_Register.G_LoginInfo.Q_UsernameConfirm.UsernameConfirm']")).sendKeys("Deep"+random);
		driver.findElement(By.xpath("//*[@id='TG_Register.G_LoginInfo.Q_Password.Password']")).sendKeys("P@ssword12");
		driver.findElement(By.xpath("//*[@id='TG_Register.G_LoginInfo.Q_PasswordConfirm.PasswordConfirm']")).sendKeys("P@ssword12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='submit'] //span[@class='evo-button-text']")).click();
		
		
		
		
		
		}
	
	}
