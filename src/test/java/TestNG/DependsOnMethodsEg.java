package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethodsEg {
	@Test(dependsOnMethods = "TestCase2")
	public void TestCase1() {
		System.out.println("First test case");
	}
	
	@Test(enabled = false)
	public void TestCase2() {
		System.out.println("Second test case");
	}
	
	@Test
	public void TestCase3() {
		System.out.println("Third test case");
	}
}
