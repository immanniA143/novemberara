package com.project.samplemvnproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LinksTesting1 extends BaseTest
{

	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String bType) throws Exception
	{
		test=report.startTest("LinksTesting1");
		
		init();
		test.log(LogStatus.INFO, "initializing the properties files.....");
		
		launch(bType);
		test.log(LogStatus.PASS, "Laucned the browser :- " + p.getProperty("chromebrowser"));
		
		navigateToUrl("googleurl");
		test.log(LogStatus.PASS, "Navigated to Url :- " + p.getProperty("googleurl"));
	}
	
	
	@Test
	public void linktesting1()
	 {
		
		  String expval="Google Images";
		  driver.findElement(By.linkText("Images")).click();
		  Reporter.log("Clicked on Image Link"); String actval=driver.getTitle();
		 
		  Assert.assertEquals(actval, expval);
		
	 }
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
