package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.RegistrationPage;

public class TC_Register_002 extends BaseClass {
	
	
	@Test(priority=3)
	public void test1() throws InterruptedException
	{
		Thread.sleep(2000);
		RegistrationPage rp=new RegistrationPage(driver);
		Thread.sleep(2000);
		rp.registerUser("sidduhi","teche","subbiye1@gmail.com");
		Thread.sleep(2000);
		rp.userPassword("Testgts@123","Testgts@123");
		Thread.sleep(2000);
		rp.register();
	
	
	
		/*Thread.sleep(3000);
	
		String actualuser=rp.user();
		System.out.println("actual user:"+ actualuser);
		
		String expectuser="subbiye1@gmail.com";
		System.out.println(" expect user:"+ expectuser);
		
		Assert.assertEquals(actualuser, expectuser);*/
	}

}
