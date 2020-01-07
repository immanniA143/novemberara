package com.project.samplemvnproject;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TC001 extends BaseTest {
  @Test
  public void amazon() {
	  System.out.println("i am amazon test");
  }
  @BeforeMethod
  @Parameters("browser")
  public void startProcess(String bType) throws Exception {
		  test=report.startTest("TC_001"); 
			
			init();
			test.log(LogStatus.INFO, "initializing the properties files.....");
			launch(bType);
			test.log(LogStatus.PASS, "launched the browser :- "+p.getProperty("chromebrowser"));
			navigateToUrl("amazonurl");
			test.log(LogStatus.PASS, "navigating to the URL :-"+p.getProperty("amazonurl"));
  }

  @AfterMethod
  public void endProcess() {
	  System.out.println("i am the end process");
	  report.endTest(test);
	  report.flush();
	  driver.quit();
  }
  

}
