package com.sample.testngsamp;

import org.testng.annotations.Test;

import com.project.samplemvnproject.BaseTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class POM001 extends BaseTest{
	LogInPage logInPage;
  @Test
  public void f() {
	  logInPage=new LogInPage(driver);
	  logInPage.logIn();
	  Assert.assertEquals(logInPage.verify(), "Authentication failed");
	  
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
  }

}
