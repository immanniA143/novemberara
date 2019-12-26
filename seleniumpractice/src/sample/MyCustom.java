package sample;

public class MyCustom extends BaseTest{
	public static void main(String[] args) throws Exception {
		init();
		launch("chromebrowser");
		navigateToURL("facebookurl");
		
		launch("firefoxbrowser");
		navigateToURL("amazonurl");
	}
}
