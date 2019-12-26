package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriversamp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravi\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
	}

}
