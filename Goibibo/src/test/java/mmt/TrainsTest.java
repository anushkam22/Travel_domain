package mmt;

import org.testng.annotations.Test;

import BaseUtility.copy.BaseTest;
import ObjectRepository.Cabs;
import ObjectRepository.HomePage;
import ObjectRepository.Trains;

public class TrainsTest extends BaseTest {

	@Test
	public void train() throws Throwable
	{
		HomePage hp= new HomePage(driver);
		
		hp.getTrains().click();
		Trains c=  new Trains(driver);
		c.trainbook(wlib, driver);
	}
}
