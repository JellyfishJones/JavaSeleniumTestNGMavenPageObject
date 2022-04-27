package page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ChromeSetupPage {

	protected WebDriver driver;
	String url = "https://www.duckduckgo.com/";

	@BeforeSuite
	public void chromeSetUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://Users//DB0101//Desktop//Automation//chromedriver.exe");
		driver = new ChromeDriver();
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