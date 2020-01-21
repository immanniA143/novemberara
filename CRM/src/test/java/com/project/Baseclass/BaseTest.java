package com.project.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest 
{
	
	public static FileInputStream fis;
	public static Properties env,envProp;
	public static String projectPath=System.getProperty("user.dir");
	public static String envi;
	

	public static void init() {
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
		
	}
}
