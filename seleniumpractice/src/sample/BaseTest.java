package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseTest {
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir");
	public static Properties p;
	public static void init() throws Exception {
		FileInputStream fis=new FileInputStream(projectPath+"//data.properties");
		p=new Properties();
		p.load(fis);
	}
	public static void launch(String browser) {
		if(p.getProperty(browser).equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"//BrouserDrivers\\chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\aravi\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2");
			option.addArguments("--disable-notifications");
			driver=new ChromeDriver(option);
		}else if(p.getProperty(browser).equals("firefox")) {
			
			  ProfilesIni p=new ProfilesIni(); 
			  FirefoxProfile profile=p.getProfile("aravind"); 
			  profile.setPreference("dom.webnotifications.enabled", false);
			  FirefoxOptions option=new FirefoxOptions();
			  option.setProfile(profile) ;
			
			System.setProperty("webdriver.gecko.driver", projectPath+"//BrouserDrivers\\geckodriver.exe");
			driver=new FirefoxDriver(option);
		}
	}
	public static void navigateToURL(String url) {
		driver.get(p.getProperty(url));
	}

}
