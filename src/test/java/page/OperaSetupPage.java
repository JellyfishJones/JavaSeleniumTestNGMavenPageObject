package page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class OperaSetupPage {

	protected WebDriver driver;
	String url = "https://www.duckduckgo.com/";

	@BeforeSuite
	public void operaSetup() {
		System.setProperty("webdriver.opera.driver","C://Users//DB0101//Desktop//Automation//operadriver.exe");
		driver = new OperaDriver();
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