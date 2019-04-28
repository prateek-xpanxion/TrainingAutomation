package SampleMaven.SampleMaven.Pages;

import org.openqa.selenium.By;

import SampleMaven.SampleMaven.SeleniumPractice.testSuite.BaseTest;

public class Account extends BaseTest{

	public static final String accountText="//h2";
	public static final String firatNameTxt="//*[@id='TG_Register.G_PIName.Q_FirstName.FirstName']";
	public static final String lastNameTxt="//*[@id='TG_Register.G_PIName.Q_LastName.LastName']";
	public static final String InitailNameTxt="//*[@id='TG_Register.G_PIName.Q_MiddleInitial.Initial']";



	public String getAccountPage(){
		return driver.findElement(By.xpath(accountText)).getText();
	}
	/*
	 * Partially filled
	 */
	public void fillForm(){
		driver.findElement(By.xpath(firatNameTxt)).sendKeys("Deepali");
		driver.findElement(By.xpath(InitailNameTxt)).sendKeys("A");
		driver.findElement(By.xpath(lastNameTxt)).sendKeys("Tarange");
	}

}
