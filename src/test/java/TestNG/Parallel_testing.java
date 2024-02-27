package TestNG;

import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//<test thread-count="2" name="Test" parallel="methods">
public class Parallel_testing {
	//can also group classes by changing method to classes in testng.xml
	@Test			
	public void chrome() {
			
				System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.selenium.dev/");
				System.out.println("InvokeChrome");
			
		}
	
	@Test
	public void Edge() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\AXIS_TRAINING\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		System.out.println("InvokeFirefox");
		
	}

}
