package com.goibibo.generic.BaseUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.goibbo.generic.dbutility.DataBaseUtils;
import com.goibibo.generic.FileUtility.ExcelUtils;
import com.goibibo.generic.FileUtility.FileUtils;
import com.goibibo.generic.ObjectRepository.HomePage;
import com.goibibo.generic.WebDriverUtility.JavaUtils;
import com.goibibo.generic.WebDriverUtility.WebDriverUtils;



public class BaseTest {


	public WebDriver driver = null;
	public FileUtils flib = new FileUtils();
	public ExcelUtils elib = new ExcelUtils();
	public JavaUtils jlib = new JavaUtils();
	public WebDriverUtils wlib = new WebDriverUtils();
	public DataBaseUtils dlib = new DataBaseUtils();
	public static WebDriver sdriver = null;

//	@BeforeSuite(groups = "ST")
//	public void configBS() throws Throwable {
//		dlib.getConnection(null, null, null);
//
//	}

	@BeforeClass(alwaysRun= true)
	public void launchBrowser() throws Throwable {

		String browser = flib.getDataFromPropertyFile("browser");
		String url = flib.getDataFromPropertyFile("url");
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		sdriver = driver;
		wlib.maximizeWindow(driver);
		wlib.waitforPageToLoad(driver);
		driver.get(url);
	}

	@BeforeMethod(alwaysRun= true)
	public void loginIntoSS() throws Throwable {

		HomePage hp = new HomePage(driver);
		hp.login();
		}

//	@AfterMethod(alwaysRun= true)
//	public void logoutSS() {
//		HomePage hp = new HomePage(driver);
//		hp.myacc(wlib, driver);
//		hp.logout();
//
//	}
//
	@AfterClass(alwaysRun= true)
	public void closeBrowser() {
		driver.quit();
	}

	@AfterSuite(alwaysRun= true)
	public void ConfigAs() throws Throwable {
		//dlib.closeConnection();
		//report.flush();
	}

}
