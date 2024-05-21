package mmt;

import org.testng.annotations.Test;

import BaseUtility.copy.BaseTest;
import ObjectRepository.Cabs;
import ObjectRepository.HomePage;

public class CabsTest extends BaseTest {

	@Test
	public void bookCab() throws Throwable {
		HomePage hp = new HomePage(driver);

		hp.getCabs().click();
		Cabs c = new Cabs(driver);
		c.bookCab(wlib, driver);
	}

}
