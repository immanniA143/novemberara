package com.project.Driver;

import java.util.Hashtable;
import java.util.Properties;

import com.project.Utilities.ExcelAPI;

public class DriverScript 
{
	public static Properties env,envProp;

	public Properties getEnv() 
	{
		return env;
	}

	public  void setEnv(Properties env) 
	{
		DriverScript.env = env;
	}

	public Properties getEnvProp() 
	{
		return envProp;
	}

	public void setEnvProp(Properties envProp) 
	{
		DriverScript.envProp = envProp;
	}
	
	public void executesKeywords(String testName, ExcelAPI xls, Hashtable<String, String> testData) 
	{
		int rows = xls.getRowCount("KeyWords");
		System.out.println("Rows:  "+rows);
		
		for(int rNum=1;rNum<rows;rNum++) 
		{
			
			String tcId = xls.getCellData("KeyWords", "TCID", rNum);
			if(tcId.equals(testName)) 
			{
				String keyWord=xls.getCellData("KeyWords", "Keyword", rNum);
				String objectKey = xls.getCellData("KeyWords", "Object", rNum);
				String dataKey = xls.getCellData("KeyWords", "Data", rNum);
				
				String data = testData.get(dataKey);
				
				System.out.println(tcId +"......."+keyWord+"......."+env.getProperty(objectKey)+"......"+data+"......");
								
			}
						
		}
		
	}
	

}
