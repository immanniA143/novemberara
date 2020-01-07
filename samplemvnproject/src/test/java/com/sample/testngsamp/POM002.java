package com.sample.testngsamp;

import org.testng.annotations.Test;

import com.project.samplemvnproject.BaseTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class POM002 extends BaseTest{
	RegistPage regPage;
  @Test
  public void f() throws InterruptedException {
	  regPage=new RegistPage();
	  regPage.registrationPage();
	  Assert.assertEquals(regPage.verify(driver), "Login - My Store");
	  
  }
  @BeforeTest
  @Parameters("browser")
  public void beforeTest(String bType) throws Exception {
	  init();
	  launch(bType);
	  navigateToUrl("automationpracticeurl");
  }

  @AfterTest
  public void afterTest() {
	 //takesScreenShot();
	 driver.quit();
  }

}
