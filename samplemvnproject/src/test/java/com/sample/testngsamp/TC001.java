package com.sample.testngsamp;

import org.testng.annotations.Test;

import com.project.samplemvnproject.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TC001 extends BaseTest {
  @Test 
  public void amazon() {
	  System.out.println("i am amazon test");
  }
  @BeforeTest 
  public void startProcess() throws Exception {
		  test=report.startTest("TC_001"); 
			
			init();
			test.log(LogStatus.INFO, "initializing the properties files.....");
			launch("chromebrowser");
			test.log(LogStatus.PASS, "launched the browser :- "+p.getProperty("chromebrowser"));
			navigateToUrl("amazonurl");
			test.log(LogStatus.PASS, "navigating to the URL :-"+p.getProperty("amazonurl"));
  }

  @AfterTest
  public void endProcess() {
	  System.out.println("i am the end process");
	  report.endTest(test);
	  report.flush();
	  closebrowser();
  }

  

}
