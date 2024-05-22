package com.goibibo.test.testScript;

import org.testng.annotations.Test;

import com.goibibo.generic.BaseUtility.BaseTest;
import com.goibibo.generic.ObjectRepository.CabsPage;
import com.goibibo.generic.ObjectRepository.HomePage;
import com.goibibo.generic.ObjectRepository.TrainsPage;

public class TrainsTest extends BaseTest {

	@Test(groups = "ST")
	public void train() throws Throwable
	{
		HomePage hp= new HomePage(driver);
		
		hp.getTrains().click();
		TrainsPage c=  new TrainsPage(driver);
		c.trainbook(wlib, driver);
	}
}
