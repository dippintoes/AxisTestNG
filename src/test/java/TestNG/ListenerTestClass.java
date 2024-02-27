package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerClass.class)

public class ListenerTestClass {
	@Test
	public void Chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		System.out.println("InvokeChrome");
		driver.close();
	}
}
