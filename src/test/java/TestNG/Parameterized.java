package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {
	@Test
	@Parameters("browser")
	public void parameterizedTest(String browser) {
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.selenium.dev/");
				System.out.println("InvokeChrome");
			}
			
			else {
				System.setProperty("webdriver.gecko.driver", "D:\\AXIS_TRAINING\\geckodriver-v0.34.0-win32\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.selenium.dev/");
				System.out.println("InvokeFirefox");
			}
		}
}
