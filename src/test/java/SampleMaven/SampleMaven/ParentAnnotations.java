package SampleMaven.SampleMaven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ParentAnnotations {
  
  
  @BeforeSuite
  public void show1() {
	  System.out.println("I am in before parent Show 1");
  }
  @BeforeTest
  public void show2() {
	  System.out.println("I am in before parent Show 2");
  }
  @BeforeClass
  public void show3() {
	  System.out.println("I am in before parent Show 3");
  }
  @BeforeMethod
  public void show4() {
	  System.out.println("I am in before parent Show4");
  }
  @AfterMethod
  public void show5() {
	  System.out.println("I am in after parent Show 5");
  }
  @AfterClass
  public void show6() {
	  System.out.println("I am in after parent Show 6");
  }
  @AfterTest
  public void show7() {
	  System.out.println("I am in after parent Show 7");
  }
  @AfterSuite
  public void show8() {
	  System.out.println("I am in after parent Show 8");
  }
}
