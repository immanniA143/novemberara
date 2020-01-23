package com.project.SuiteA;

import org.testng.annotations.Test;

import com.project.Baseclass.BaseTest;
import com.project.Utilities.DataUtils;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class LoginTest extends BaseTest
{
	
  @Test(dataProvider = "getData")
  
  public void loginTest( Hashtable<String, String> data)
  {
	  System.out.println("i am login method");
	  System.out.println(data.get("Browser"));
	  
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
