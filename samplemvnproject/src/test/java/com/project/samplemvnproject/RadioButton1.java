package com.project.samplemvnproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class RadioButton1 extends  BaseTest
{	
	@BeforeMethod
	@Parameters("browser")
	  public void beforeMethod(String bType) throws Exception 
	  {
		test=report.startTest("RadioButton1");
		
		init();
		test.log(LogStatus.INFO, "initializing the properties files.....");
		
		launch(bType);
		test.log(LogStatus.PASS, "Laucned the browser :- " + p.getProperty("chromebrowser"));
		
		navigateToUrl("googleurl");
		test.log(LogStatus.PASS, "Navigated to Url :- " + p.getProperty("radiourl"));
	  }
	
	
	@Test
	public void checkboxTest()
	{
		System.out.println("jbhfkjahdjbfjsbfsfbjh");
		/*
		 * WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		 * List<WebElement> rbutton=radio.findElements(By.name("group1")); for(int
		 * i=0;i<rbutton.size();i++) {
		 * System.out.println(rbutton.get(i).getAttribute("value")+ "----" +
		 * rbutton.get(i).getAttribute("checked")); }
		 */	}
 

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }
	
}
