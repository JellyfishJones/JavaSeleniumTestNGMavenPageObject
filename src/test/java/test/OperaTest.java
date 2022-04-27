package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.OperaSetupPage;

public class OperaTest extends OperaSetupPage {
 
@Test
  public void operaTest() {
		driver.findElement(By.id("search_form_input_homepage")).sendKeys("Test123!");	
  }
}
