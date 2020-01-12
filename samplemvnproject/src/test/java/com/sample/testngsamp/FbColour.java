package com.sample.testngsamp;


import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.w3c.dom.css.CSSValue;

import com.project.samplemvnproject.BaseTest;

public class FbColour extends BaseTest {
	
	@BeforeTest
	@Parameters("browser")
	public void beforeTest (String bType) throws Exception {
		init();
		launch(bType);
		navigateToUrl("facebookurl");
	}
	@Test
	public void colourOfButton() {
		String expColor="#1c1e21";
		String colour = getElement("fbuser_id").getCssValue("color");
		System.out.println(colour);
		String hexColour=Color.fromString(colour).asHex();
		System.out.println(hexColour);
		Assert.assertEquals(hexColour, expColor);
		
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	

}
