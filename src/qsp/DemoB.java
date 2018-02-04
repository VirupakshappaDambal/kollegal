package qsp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DemoB {

	public static void main(String[] args) throws Exception {
	//	URL r=new URL("http://localhost:4444//wd/hub");
	//	DesiredCapabilities d=new DesiredCapabilities();
	//	d.setBrowserName("chrome");
	//	WebDriver driver=new RemoteWebDriver(r,d);
	//	driver.quit();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.close();

	}

}
