package mmt;

import org.testng.annotations.Test;

import BaseUtility.copy.BaseTest;
import ObjectRepository.HomePage;
import ObjectRepository.HotelsPage;

public class HotelTest extends BaseTest {

	@Test
	public void buy() throws Throwable {
//		HomePage hp = new HomePage(driver);
//
//		hp.getHotels().click();
		HotelsPage h = new HotelsPage(driver);
		h.searchHotels(wlib, driver);
	}

	@Test
	public void book() throws Throwable {
//		HomePage hp = new HomePage(driver);
//
//		hp.getHotels().click();
		HotelsPage hp1 = new HotelsPage(driver);
		hp1.searchhotel(wlib, driver);
	}

}
