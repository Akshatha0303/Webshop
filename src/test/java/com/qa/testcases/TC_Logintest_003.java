package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.LoginPage;

public class TC_Logintest_003 extends BaseClass {
	public LoginPage lp;

	@Test(priority=5)
	public void test1()
	{
lp=new LoginPage(driver);
lp.logincredentials("subbiye1@gmail.com","Testgts@123");

}
	@Test(priority=6)
	public void test2()
	{
		lp=new LoginPage(driver);
		lp.logIn();
	}
	
	@Test(priority=7)
	public void test3()
	{
		lp=new LoginPage(driver);
		String actualuserID=lp.accountverify ();
		System.out.println("actual user:"+ actualuserID);
		
		String expectuserID="subbiye1@gmail.com";
		System.out.println(" expect user:"+ expectuserID);
		
		Assert.assertEquals(actualuserID, expectuserID);
		
	}
	
}