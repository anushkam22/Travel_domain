package mmt;

import org.testng.annotations.Test;

import BaseUtility.copy.BaseTest;
import ObjectRepository.Flights;

public class FlightTest extends BaseTest {
	
	@Test
	public void buy() throws Throwable {

	Flights hp = new Flights(driver);
	hp.serachFlight(wlib, driver);
	}
      

}
