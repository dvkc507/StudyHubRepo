package tests;

import org.testng.annotations.Test;

public class AnnotationsExtendsClass extends AnnotationTest{
	

	@Test(priority = -1)
	public void test1() {
		System.out.println("Test 1");
	}

	public void test2() {
		System.out.println("Test 2");
		System.out.println("This test will not get executed");

	}

	@Test(priority = 0, groups= {"IT Department"})
	public void test3() {
		System.out.println("Test 3");
	}

}
