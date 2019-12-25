import sample.BaseTest;

public class FirefoxLaunch extends BaseTest{
	public static void main(String[] args) throws Exception {
		init();
		launch("chromebrowser");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		navigateToURL("axisbankurl");
		/*
		 * String title=driver.getTitle(); System.out.println(title); String url =
		 * driver.getCurrentUrl(); System.out.println(url);
		 */
	}
}
