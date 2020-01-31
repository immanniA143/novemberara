package com.project.SuiteA;

import org.testng.annotations.Test;

import com.project.Baseclass.BaseTest;
import com.project.Utilities.DataUtils;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;

	public class LoginTest extends BaseTest
{
	
  @Test(dataProvider = "getData")
  
  	public void loginTest( Hashtable<String, String> data)
  {
	  System.out.println("i am login method");
	  System.out.println(data.get("Browser"));
	  
	  if(data.get("RunMode").equals("N")) 
	  {
		  throw new SkipException("RunMode is set to No");
		  
	  }
	  ds.executesKeywords(testName,xls,data);
	  
  }

  @DataProvider
  	public Object[][] getData() 
  {
	  System.out.println("i am data provider");
	  sheetName="Data";
	  //String testName="LoginTest";
	return DataUtils.getTestData(xls, sheetName, testName);
    
  }
}
