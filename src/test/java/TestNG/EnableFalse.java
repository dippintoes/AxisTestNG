package TestNG;

import org.testng.annotations.Test;

public class EnableFalse {
	@Test(enabled = false)
	public void TestCase1() {
		System.out.println("First test case");
	}
	
	@Test(priority=2)
	public void TestCase2() {
		System.out.println("Second test case");
	}
	
	@Test(priority=1)
	public void TestCase3() {
		System.out.println("Third test case");
	}
	
}
