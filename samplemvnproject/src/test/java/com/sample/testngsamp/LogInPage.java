package com.sample.testngsamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	@FindBy(linkText="Sign in")public WebElement signIn;
	@FindBy(id="email")public WebElement customerId;
	@FindBy(id="passwd")public WebElement password;
	@FindBy(id="SubmitLogin")public WebElement submitlogin;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")public WebElement actualValue;
	
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void logIn() {
		signIn.click();
		customerId.sendKeys("aravindimmanni333@gmail.com");
		password.sendKeys("password");
		submitlogin.click();
	}
	public String verify() {
		return actualValue.getText();
	}

}
