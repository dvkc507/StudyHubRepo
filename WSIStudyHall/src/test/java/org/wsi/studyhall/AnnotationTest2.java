package org.wsi.studyhall;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AnnotationTest2 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite in Seperate class");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite in seperate class");
	}

}
