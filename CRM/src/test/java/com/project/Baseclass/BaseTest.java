package com.project.Baseclass;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

import com.project.Driver.DriverScript;
import com.project.Utilities.ExcelAPI;

public class BaseTest 
{
	
	public static FileInputStream fis;
	public static ExcelAPI xls;
	public Properties env,envProp;
	public static String projectPath=System.getProperty("user.dir");
	public DriverScript ds;
	public static String envi;
	public static String sheetName,testName;
	
	
@BeforeTest
	public void init() throws Exception 
{
	System.out.println("i am before test");
		try {
			
			fis=new FileInputStream(projectPath+"//src//resource//java//Environment.properties");
			env=new Properties();
			env.load(fis);
			envi = env.getProperty("env");
			System.out.println(envi);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try 
		{
			fis=new FileInputStream(projectPath+"//src//resource//java//"+envi+".properties");
			envProp=new Properties();
			envProp.load(fis);
			System.out.println(envProp.getProperty("fburl"));
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		testName=this.getClass().getSimpleName();
		System.out.println(testName);
		
		String[] pack = this.getClass().getPackage().getName().split("\\.");
		String suiteName = pack[pack.length-1];
		xls=new ExcelAPI(envProp.getProperty(suiteName+"_xls"));
		
		//initializing DriverScript
		
		ds=new DriverScript();
		ds.setEnv(env);
		ds.setEnvProp(envProp);
		
		
		
	}
}
