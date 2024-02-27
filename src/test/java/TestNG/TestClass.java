package TestNG;


import org.openqa.selenium.WebDriver;	
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;
	@Test
	public void TestingClass()
	{	
		System.out.println("TestClass");
		driver.close();
	}
}
