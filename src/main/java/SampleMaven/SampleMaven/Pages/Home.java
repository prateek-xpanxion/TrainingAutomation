package SampleMaven.SampleMaven.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import SampleMaven.SampleMaven.SeleniumPractice.testSuite.BaseTest;

public class Home extends BaseTest {
	
	public static final String btnReturn="//*[@id='Return']";
	public static final String btnOneWay="//*[@id='oneWay_trigger']";
	public static final String txtReturn="//*[@id='txtEndDate']";
	
	public static final String ddlSuffix="//*[@id='TG_Register.G_PIName.Q_Suffix.Suffix']";
	
	
	public Boolean isReturnSelected() {
		return driver.findElement(By.xpath(btnReturn)).isSelected();
	}
	
	public Boolean isTxtReturnenabled() {
		return driver.findElement(By.xpath(txtReturn)).isEnabled();
		
	}
	
	public void selectsuffix(String suffix) {
		Select ss= new Select(driver.findElement(By.xpath(ddlSuffix)));
		ss.selectByVisibleText(suffix);
		List<WebElement>ll=ss.getOptions();
		//ss.isMultiple()
		
		for(WebElement ele:ll) {
			
			if(ele.getText().equals("India")) {
				ele.click();
				break;
			}
			System.out.println(ele.getText());
		}
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i).getText());
		}
		
	}

}
