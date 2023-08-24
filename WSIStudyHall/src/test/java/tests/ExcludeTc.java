package tests;

import org.testng.annotations.Test;

public class ExcludeTc {
	
	@Test(enabled=false)
	public void test1() {
		System.out.println("Excluded test");
	}

	@Test()
	public void test2() {
		System.out.println("Included test");
	}

	@Test()
	public void test3() {
		System.out.println("Test excluded from testNG.xml");
	}
}
