package com.project.samplemvnproject;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FbBase {
	
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir");
	public static Properties p,or;
	public static Date dt=new Date();
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
		
	public static ExtentReports report=ExtentManager.getInstance();
	public static ExtentTest test;
	public static void init() throws Exception {
		 p=new Properties();
		 FileInputStream fis=new FileInputStream(projectPath+"\\data.properties");
		 p.load(fis);
		 FileInputStream fis1=new FileInputStream(projectPath+"\\Or.properties");
		or=new Properties();
		or.load(fis1);
		PropertyConfigurator.configure(projectPath+"\\log4j.properties");
		FileInputStream fis2=new FileInputStream("C:\\Users\\aravi\\OneDrive\\Desktop\\fb_ids.xlsx");
		wb=new XSSFWorkbook(fis2);
	}
	
	public static void launch(String browser) {
		
		if(p.getProperty(browser).equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\aravi\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2");
			option.addArguments("--disable-notifications");
			driver=new ChromeDriver(option);
		}else if(p.getProperty(browser).equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver.exe");
			FirefoxOptions option=new FirefoxOptions();
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile=p.getProfile("aravind");
			profile.setPreference("dom.webnotifications.enabled", false);
			option.setProfile(profile);
			driver=new FirefoxDriver(option);
		}
		driver.manage().window().maximize();
		
	}

	public static void navigateToUrl(String url) {
		driver.get(p.getProperty(url));
		
	}
	
	public static WebElement getElement(String locatorKey) {
		WebElement element=null;
		if(locatorKey.endsWith("_id")) {
			element=driver.findElement(By.id(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name")) {
			element=driver.findElement(By.name(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_xpath")) {
			element=driver.findElement(By.xpath(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_linktext")) {
			element=driver.findElement(By.linkText(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_plinktext")) {
			element=driver.findElement(By.partialLinkText(or.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_css")) {
			element=driver.findElement(By.cssSelector(or.getProperty(locatorKey)));
		}
		return element;
	}
	public static void selectItem(String locatorKey, String itemToSelect) {
		getElement(locatorKey).sendKeys(or.getProperty(itemToSelect));
	}

	public static void type(String locatorKey, String value) {
		getElement(locatorKey).sendKeys(or.getProperty(value));
	}
	public static void click(String locatorKey) {
		getElement(locatorKey).click();
	}
	public static void fbLogOut(String navigatorlocatorKey,String logoutlacatorKey) throws InterruptedException {
		getElement(navigatorlocatorKey).click();
		Thread.sleep(5000);
		getElement(logoutlacatorKey).click();
	}

	public static void fbLogIn(String useridLoctor,String passLocator,String loginButtonlocator) throws InterruptedException {
		sheet=wb.getSheet("Sheet1");
		for(int i=1;i<=2;i++) {
		row=sheet.getRow(i);
		cell=row.getCell(0);
		String user=null;
		String pass=null;
		int type = cell.getCellType();
		if(type==0) {
		user=NumberToTextConverter.toText(cell.getNumericCellValue());
		}else if(type==1) {
			user=cell.getStringCellValue();
		}
		
		getElement(useridLoctor).sendKeys(user);
		cell=row.getCell(1);
		int type1 = cell.getCellType();
		if(type1==0) {
		pass=NumberToTextConverter.toText(cell.getNumericCellValue());
		}else if(type1==1) {
			pass=cell.getStringCellValue();
		}
		
		getElement(passLocator).sendKeys(pass);
		getElement(loginButtonlocator).click();
		fbLogOut("outnavigator_id","logoutbutton_xpath");
		}
		
	}

}

