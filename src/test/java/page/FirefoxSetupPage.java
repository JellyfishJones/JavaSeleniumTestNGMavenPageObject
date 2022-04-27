package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class FirefoxSetupPage {

	protected WebDriver driver;
	String url = "https://www.duckduckgo.com/";

	@BeforeSuite
	public void firefoxSetup() {
		System.setProperty("webdriver.gecko.driver", "C://Users//DB0101//Desktop//Automation//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {
		driver.close();
	}
}