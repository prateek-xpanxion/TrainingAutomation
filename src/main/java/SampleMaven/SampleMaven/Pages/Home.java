package SampleMaven.SampleMaven.Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
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
	/*
	 * Switch frame code for learning
	 * 
	 */
	public void learningMethods() {
		Alert aa=driver.switchTo().alert();
		aa.accept();
		aa.dismiss();

		List<WebElement>frames=	driver.findElements(By.tagName("iframe"));

		for(WebElement ele:frames) {


			driver.switchTo().frame(ele.getText());

		}
		driver.switchTo().defaultContent();

	}

	/*
	 * windows switch code
	 */
	public void LearningWindows() {
		String parentWindow=driver.getWindowHandle();
		//operation performed like click button
		Set<String>windows=driver.getWindowHandles();
		for(String ss:windows) {
			if(!ss.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(ss);
				//perform operation here for that window
				driver.close();
			}

		}
		driver.switchTo().window(parentWindow);
	}
}