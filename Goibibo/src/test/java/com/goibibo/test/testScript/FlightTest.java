package com.goibibo.test.testScript;

import org.testng.annotations.Test;

import com.goibibo.generic.BaseUtility.BaseTest;
import com.goibibo.generic.ObjectRepository.FlightsPage;

public class FlightTest extends BaseTest {
	
	@Test
	public void buy() throws Throwable {

	FlightsPage hp = new FlightsPage(driver);
	hp.serachFlight(wlib, driver);
	}
      

}
