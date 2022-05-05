package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.SearchPage;
import setup.ChromeSetup;

public class SearchTest extends ChromeSetup {

	SearchPage searchPage;

	@BeforeMethod
	public void setup() {
		initialization();
		searchPage = new SearchPage(driver);
	}

	private void initialization() {
	}

	
	@Test
	//FF: launch duckduckgo > do search > click Image button > click Video button > close browser
	public void ffDuckDuckGoSearchTest() throws InterruptedException {
		System.out.println("FF: Start search > click button tests...");
		searchPage.duckduckgoSearch("Test123");
		Thread.sleep(5000);
		searchPage.searchImageButton();
		searchPage.searchVideoButton();
	}

}
