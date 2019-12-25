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

public class Practice1 {
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir"); 
	public static Properties p;
	public static void init() throws Exception {
		p=new Properties();
		FileInputStream fis=new FileInputStream(projectPath+"\\data.properties");
		p.load(fis);
		
	}
	public static void launch(String browser) {
		if(p.getProperty(browser).equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"\\BrowserDrivers\\chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			option.addArguments("user-data-dir=C:\\\\Users\\\\aravi\\\\AppData\\\\Local\\\\Google\\\\Chrome\\\\User Data\\\\Profile 2");
			option.addArguments("--disable-notifications");
			driver=new ChromeDriver(option);
			
		}else if(p.getProperty(browser).equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\BrowserDrivers\\geckodriver.exe");
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile=p.getProfile("aravind");
			profile.setPreference("dom.webnotifications.enable", false);
			FirefoxOptions option=new FirefoxOptions();
			option.setProfile(profile);
			driver=new FirefoxDriver();
		}
		
	}
	public static void uRL(String url) {
		driver.get(p.getProperty(url));
		
	}

}
