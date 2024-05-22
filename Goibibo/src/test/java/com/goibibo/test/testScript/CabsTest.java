package com.goibibo.test.testScript;

import org.testng.annotations.Test;

import com.goibibo.generic.BaseUtility.BaseTest;
import com.goibibo.generic.ObjectRepository.CabsPage;
import com.goibibo.generic.ObjectRepository.HomePage;

public class CabsTest extends BaseTest {

	@Test(groups = "ST")
	public void bookCab() throws Throwable {
		HomePage hp = new HomePage(driver);

		hp.getCabs().click();
		CabsPage c = new CabsPage(driver);
		c.bookCab(wlib, driver);
	}

}
