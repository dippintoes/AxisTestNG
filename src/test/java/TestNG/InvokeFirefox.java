package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerClass.class)
public class InvokeFirefox {
	@Test
	public void Firefox() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\AXIS_TRAINING\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		System.out.println("InvokeEdge");
		
	}

}
