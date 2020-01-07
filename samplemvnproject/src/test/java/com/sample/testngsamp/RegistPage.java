package com.sample.testngsamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.samplemvnproject.BaseTest;

public class RegistPage extends BaseTest {
	
	public RegistPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Sign in")public WebElement signIn;
	@FindBy(id="email_create")public WebElement custoEmail;
	@FindBy(id="SubmitCreate")public WebElement createButton;
	@FindBy(id="id_gender1")public WebElement selectGenger;
	@FindBy(id="customer_firstname")public WebElement firstName;
	@FindBy(id="customer_lastname")public WebElement lastName;
	@FindBy(id="passwd")public WebElement password;
	@FindBy(id="days")public WebElement dobDay;
	@FindBy(id="months")public WebElement dobMonth;
	@FindBy(id="years")public WebElement dobYear;
	@FindBy(id="address1")public WebElement addressLine1;
	@FindBy(id="city")public WebElement cityLoc;
	@FindBy(id="id_state")public WebElement stateLoc;
	@FindBy(id="postcode")public WebElement pinCodeLoc;
	@FindBy(id="id_country")public WebElement countryLoc;
	@FindBy(id="phone_mobile")public WebElement phoneNum;
	@FindBy(id="alias")public WebElement alternateAddress;
	@FindBy(id="submitAccount")public WebElement submitButton;
	@FindBy(xpath="//a[@class='logout']")public WebElement signOut;
	
	public void registrationPage()
	{
		signIn.click();
		//Thread.sleep(2000);
		waitForElement(custoEmail,30);
		custoEmail.sendKeys(or.getProperty("firstname")+or.getProperty("lastname")+randomNumber()+or.getProperty("domain"));
		createButton.click();
		//Thread.sleep(4000);
		waitForElement(selectGenger,30);
		selectGenger.click();
		firstName.sendKeys("dhdffdfds");
		lastName.sendKeys("bvhfgfd");
		password.sendKeys("password");
		//Select s=new Select(dobDay);
		//s.selectByIndex(1);
		selectDOB(dobDay,2);
		selectDOB(dobMonth,5);
		selectDOB(dobYear,15);
		addressLine1.sendKeys("hfbhsfgsfjydtsjkhfhstfhftfgyrtwhfgy465jftwufgf");
		cityLoc.sendKeys("hyderabad");
		stateLoc.sendKeys("telangana");
		pinCodeLoc.sendKeys("50005");
		countryLoc.sendKeys("india");
		phoneNum.sendKeys("1234567890");
		alternateAddress.sendKeys("bnvfhggdw154484154");
		submitButton.click();
		signOut.click();
	}
		
	public String verify(WebDriver driver)
	{
		return driver.getTitle();
	}

}
