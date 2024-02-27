package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//STCM(Suite level, test level, class level, method level) priority Setting
public class AnnotationsEG {
	@Test
	public void testCase1() {
		System.out.println("Test case 1 is executed.");
	}
	@Test
	public void testCase2() {
		System.out.println("Test case 2 is executed.");
	}
	@Test
	public void testCase3() {
		System.out.println("Test case 3 is executed.");
	}
	@Test
	public void testCase4() {
		System.out.println("Test case 4 is executed.");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Open browser");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("close browser");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Open db connection");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("close db connection");
	}
	
}
