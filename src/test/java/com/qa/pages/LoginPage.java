package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		
		 @FindBy(xpath="//a[normalize-space()='Log in']")
		WebElement LoginButton;
		 
		 @FindBy(xpath="//input[@id='Email']")
		 WebElement userID;
		 
		 @FindBy(xpath="//input[@id='Password']")
		 WebElement password;
		 
		 @FindBy(xpath="//input[@class='button-1 login-button']")
		 WebElement logincontinue;
		 
		 @FindBy(xpath="//a[@class='account']")
		 WebElement account;
		 
		 public void logincredentials(String user, String pass)
		 {
			 LoginButton.click();
			 userID.sendKeys(user);
			 password.sendKeys(pass);
		 }
		 
		 public void logIn() {
			 logincontinue.click();
			 
		 }
		 
		public String accountverify()
		{
			String acc=account.getText();
					return acc;
		}
	}


