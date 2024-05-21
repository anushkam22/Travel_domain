package mmt;

import org.testng.annotations.Test;

import BaseUtility.copy.BaseTest;
import ObjectRepository.Cabs;
import ObjectRepository.Trains;

public class TrainsTest extends BaseTest {

	@Test
	public void train() throws Throwable
	{
		Trains c=  new Trains(driver);
		c.trainbook(wlib, driver);
	}
}
