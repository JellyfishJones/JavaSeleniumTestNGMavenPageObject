package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.SearchPage;
import setup.FirefoxSetup;

public class SearchTest extends FirefoxSetup {

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
	public void ffDuckDuckGoSearchTest()  {
		System.out.println("FF: goto duckduckgo.com > enter search data > click search > click image button > click video button...");
		searchPage.duckduckgoSearch("Test123");
		searchPage.searchImageButton();
		searchPage.searchVideoButton();
	}

}

