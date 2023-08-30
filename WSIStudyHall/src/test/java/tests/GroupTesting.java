package tests;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTesting {
	@BeforeGroups("testOne")
	public void beforeGroups() {
		System.out.println("beforeGroups method executed before testOne group");
	}

	@Test(groups = { "testOne" })
	public void testMethod1() {
		System.out.println("Inside Method one");
	}

	@Test(groups = { "testOne" })
	public void testMethod2() {
		System.out.println("Inside Method two");
	}

	@Test()
	public void demo() {
		System.out.println("Test");
	}
}
