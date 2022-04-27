package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class EdgeSetupPage {

	protected WebDriver driver;
	String url = "https://www.duckduckgo.com/";

	@BeforeSuite
	public void edgeSetup() {
		System.setProperty("webdriver.edge.driver", "C://Users//DB0101//Desktop//Automation//msedgedriver.exe");
		driver = new EdgeDriver();
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