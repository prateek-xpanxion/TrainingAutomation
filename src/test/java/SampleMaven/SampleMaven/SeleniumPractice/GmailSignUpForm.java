package SampleMaven.SampleMaven.SeleniumPractice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class GmailSignUpForm extends Gmail{
	
	public static final String btnNext="//*[@id='accountDetailsNext']";
	
	@Test
	public void gmailRegistration() {
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement userName = driver.findElement(By.xpath("//input[@name='Username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='Passwd']"));
		WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		//WebElement next = driver.findElement(By.id(btnNext));
		WebElement next = driver.findElement(By.className("CwaK9"));
		
		firstName.sendKeys("Rupesh");
		lastName.sendKeys("Pune");
		userName.sendKeys("25rupeshp");
		password.sendKeys("Rupesh123");
		confirmPassword.sendKeys("Rupesh123");
		
		firstName.getText();
		lastName.getText();
		userName.getText();
		password.getText();
		confirmPassword.getText();
		
		next.click();
		
		WebElement phoneNumber = driver.findElement(By.xpath("//*[@id='phoneNumberId']"));
		phoneNumber.sendKeys("9421782781");
		phoneNumber.getText();
		WebElement next1 = driver.findElement(By.className("CwaK9"));
		next1.click();
		
		
		//firstName.clear();
		//lastName.clear();
	}

}
