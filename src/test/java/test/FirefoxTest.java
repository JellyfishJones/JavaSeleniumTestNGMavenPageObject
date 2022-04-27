package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.FirefoxSetupPage;

public class FirefoxTest extends FirefoxSetupPage {

	@Test
	public void firefoxTest() {
		driver.findElement(By.id("search_form_input_homepage")).sendKeys("Test123!");
	}
}
