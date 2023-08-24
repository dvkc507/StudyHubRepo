package tests;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationTest {
	@BeforeTest
	public void Before() {
		System.out.println("Before Test");
		Reporter.log("Inside Before Test");
	}

	@AfterTest
	public void reportTest() {
		System.out.println("After Test");
		Reporter.log("Inside After Test");
	}

	@BeforeMethod
	public void BeforeM() {
		System.out.println("Before Method");
		Reporter.log("Before Method");
	}

	@AfterMethod
	public void AfterM() {
		System.out.println("After Method");
		Reporter.log("After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

	@BeforeGroups("IT Department")
	public void beforeGroups() {
		System.out.println("Before group for Test3");
	}
}
