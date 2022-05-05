package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	@FindBy(id = "search_form_input_homepage")
	WebElement searchfield;

	@FindBy(id = "search_button_homepage")
	WebElement searchButton;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[2]/div[1]/div/ul[1]/li[2]/a")
	WebElement imageButton;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[2]/div[1]/div/ul[1]/li[3]/a")
	WebElement videoButton;

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void duckduckgoSearch(String testsearch) {
		searchfield.sendKeys(testsearch);
		searchButton.click();
	}

	public void searchImageButton() {
		imageButton.click();
	}

	public void searchVideoButton() {
		videoButton.click();
	}
}

