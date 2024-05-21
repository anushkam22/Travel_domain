package mmt;

import org.testng.annotations.Test;

import BaseUtility.copy.BaseTest;
import ObjectRepository.Cabs;

public class CabsTest extends BaseTest{
	
	@Test
	public void bookCab() throws Throwable
	{
		Cabs c=  new Cabs(driver);
		c.bookCab(wlib, driver);
	}

}
