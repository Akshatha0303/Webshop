package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.pages.HomePage;

public class TC_links_004 extends BaseClass{
	
	@Test
	public void test5() {
	
	HomePage hp=new HomePage(driver);
	hp.verifyLinks();
	
	int expectlinks=96;
	System.out.println("expected links:"+expectlinks);
	int actuallinks=hp.linksCount();
	System.out.println("Actual links:"+actuallinks);
	Assert.assertEquals(expectlinks, actuallinks);
	
	
	}
	
	@Test
	public void test3()
	{

		HomePage hp=new HomePage(driver);
		int display=hp.linksDisplay();
		System.out.println("the display links count:"+display);
		
	}
	
}
