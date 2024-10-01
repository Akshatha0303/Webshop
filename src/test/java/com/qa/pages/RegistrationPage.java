package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;


public class RegistrationPage extends BaseClass {
	

	public  RegistrationPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
@FindBy(xpath="//a[@class='ico-register']")
WebElement registerButton;

@FindBy(xpath="//input[@id='gender-male']")
WebElement Gender_Male;

@FindBy(xpath="//input[@id='gender-female']")
WebElement Gender_Female;

@FindBy(xpath="//input[@id='FirstName']")
WebElement Firstname;

@FindBy(xpath="//input[@id='LastName']")
WebElement Lastname;

@FindBy(xpath="//input[@id='Email']")
WebElement Email;

@FindBy(xpath="//input[@id='Password']")
WebElement Password;

@FindBy(xpath="//input[@id='ConfirmPassword']")
WebElement ConfirmPassword;

@FindBy(xpath="//input[@id='register-button']")
WebElement ConfirmRegister;

@FindBy(xpath="//a[@class='account])")
WebElement account;





public void registerUser(String First, String last, String Mail) throws InterruptedException
{
	
	registerButton.click();
	
	Firstname.sendKeys(First);
	
	Lastname.sendKeys(last);
	
	Email.sendKeys(Mail);

	Gender_Male.click();

}

public void userPassword(String Pwd,String ConfirmPwd) throws InterruptedException
{
	Password.sendKeys(Pwd);
	
	ConfirmPassword.sendKeys(ConfirmPwd);
	
}

public void register() throws InterruptedException
{
	
	ConfirmRegister.click();
}

/*public String user()
{
	String acc=account.getText();
	return acc;
}*/
}