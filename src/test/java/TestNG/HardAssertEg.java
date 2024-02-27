package TestNG;

import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEg {
	
	@Test
	public void testAssert() throws InterruptedException {
		//too important that it aborts the execution
		
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(200);
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeH";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				
		Thread.sleep(2000);
		
		driver.close();
	}
}
