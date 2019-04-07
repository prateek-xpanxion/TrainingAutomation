package SampleMaven.SampleMaven;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ChildAnnotationsTest extends ParentAnnotations {
  @Test(enabled=false)
  public void chileTest() {
	  
	  System.out.println("I am in child test");
  }
  @BeforeSuite
  public void show9() {
	  System.out.println("I am in before child Show 9");
  }
  @BeforeTest
  public void show10() {
	  System.out.println("I am in before child Show 10");
  }
  @BeforeClass
  public void show11() {
	  System.out.println("I am in before child Show 11");
  }
  @BeforeMethod
  public void show12() {
	  System.out.println("I am in before child Show 12");
  }
  @AfterMethod
  public void show13() {
	  System.out.println("I am in after child Show 13");
  }
  @AfterClass
  public void show14() {
	  System.out.println("I am in  after child Show 14");
  }
  @AfterTest
  public void show15() {
	  System.out.println("I am in after child Show 15");
  }
  @AfterSuite
  public void show16() {
	  System.out.println("I am in after child Show 16");
  }
 
  
  @Test
  public void chileTest2() {
	  Reporter.log("starting method");
	  System.out.println("I am in child test 2");
	  SoftAssert ss=new SoftAssert();
	  ss.assertTrue(true, "purposily false");
	  ss.assertEquals("Prateek".toLowerCase(), "prateek","mismatched");
	  
	  ss.assertEquals("Prateek".toUpperCase(), "PRATEEK","mismatched");
	 // result.getMethod().getMethodName()
	  ss.assertAll();
	  
	  
	  
  }
  
  @Test( dependsOnMethods="chileTest2")
  public void chileTest3() {
	  
	  System.out.println("I am in child test 3");
  }
}

