package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.ChromeSetupPage;

public class ChromeTest extends ChromeSetupPage {
 
@Test
  public void chromeTest() {
		driver.findElement(By.id("search_form_input_homepage")).sendKeys("Test123!");	
  }
}
