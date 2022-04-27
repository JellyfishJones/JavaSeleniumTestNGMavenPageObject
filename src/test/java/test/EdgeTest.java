package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.EdgeSetupPage;

public class EdgeTest extends EdgeSetupPage {
	
  @Test
  public void edgeTest() {
	  driver.findElement(By.id("search_form_input_homepage")).sendKeys("Test123!");	
  }

}
