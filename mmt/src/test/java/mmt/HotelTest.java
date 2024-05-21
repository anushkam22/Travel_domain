package mmt;

import org.testng.annotations.Test;

import BaseUtility.copy.BaseTest;
import ObjectRepository.HotelsPage;

public class HotelTest extends BaseTest {


	@Test
	public void buy() throws Throwable {

	HotelsPage hp = new HotelsPage(driver);
	hp.searchHotels(wlib, driver);
	}
	
	@Test
	public void book() throws Throwable {

	HotelsPage hp = new HotelsPage(driver);
	hp.searchhotel(wlib, driver);
	}
      
}
