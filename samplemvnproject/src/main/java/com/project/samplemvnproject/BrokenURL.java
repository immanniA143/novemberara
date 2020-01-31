package com.project.samplemvnproject;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;



public class BrokenURL {
	
	public static ChromeDriver driver;
	 @Test
	  public void brokenLinks() 
	  {
		 System.setProperty("webdriver.chrome.driver", "E:\\aravind\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		  driver.get("http://newtours.demoaut.com");
		  
		  List<WebElement> links= driver.findElements(By.tagName("a"));
		  System.out.println("Total Lonks : "+links.size());
		  
		  for(int i=0;i<links.size();i++) {
			  
			  String url=links.get(i).getAttribute("href");
			  verifyLinkActive(url);
		  }
		  
	  }
	  public static void verifyLinkActive(String linkUrl) {
		  
		  
		  try {
			  URL url=new URL(linkUrl);
			  HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
			  httpURLConnect.setConnectTimeout(3000);
			  httpURLConnect.connect();
			  
			  if(httpURLConnect.getResponseCode()==200) {
				  
				  System.out.println(linkUrl+"  -  "+httpURLConnect.getResponseMessage());
			  }
			  if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				  System.out.println(linkUrl+"  -  "+httpURLConnect.getResponseMessage() +"  -  "+HttpURLConnection.HTTP_NOT_FOUND);
				  driver.get(linkUrl);
				  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				  FileHandler.copy(source, new File(System.getProperty("user.dir")+"//Drivers//aravind.png"));
				  
			  }
		  }
		  catch(MalformedURLException e) {
			  e.printStackTrace();
		  }
		  catch(IOException e) {
			  e.printStackTrace();
		  }
	  }


}
