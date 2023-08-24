package tests;

import org.testng.annotations.Test;

public class AnnotationsExtendsClass2 extends AnnotationTest{
	
	@Test(priority = 1)
	public void test4() {
		System.out.println("Test 4");
	}

	@Test(priority = 2)
	public void test5() {
		System.out.println("Test 5");
	}

}
