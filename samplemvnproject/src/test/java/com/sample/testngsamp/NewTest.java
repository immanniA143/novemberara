package com.sample.testngsamp;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;

public class NewTest 
{
	
  @Test(dataProvider = "dp")
  public void f(Object[] a ) 
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
	  Object[][] data=new Object[2][2];
	  data[0][0]=10;
	  data[0][1]=20;
	  data[1][0]=30;
	  data[1][1]=40;
	  
	return data;
   
  }
}
