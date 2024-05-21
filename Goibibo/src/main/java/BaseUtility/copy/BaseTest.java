package BaseUtility.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ShopperStack.generic.WebDriverUtility.WebDriverUtils;

import DBUtility.copy.DataBaseUtils;
import FileUtility.ExcelUtils;
import FileUtility.FileUtils;
import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;
import WebDriverUtility.JavaUtils;



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

	@BeforeClass()
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

//	@BeforeMethod()
//	public void loginIntoSS() throws Throwable {
//
//		HomePage hp = new HomePage(driver);
//		hp.login();
//		}

//	@AfterMethod()
//	public void logoutSS() {
//		HomePage hp = new HomePage(driver);
//		hp.myacc(wlib, driver);
//		hp.logout();
//
//	}
//
//	@AfterClass()
//	public void closeBrowser() {
//		driver.quit();
//	}

//	@AfterSuite(groups = "ST")
//	public void ConfigAs() throws Throwable {
//		dlib.closeConnection();
//		// report.flush();
//	}

}
