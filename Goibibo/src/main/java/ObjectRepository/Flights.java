package ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ShopperStack.generic.WebDriverUtility.WebDriverUtils;

public class Flights extends BaseClass {

	public Flights(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//p[text()='Pune Airport']/ancestor::div[@class='sc-12foipm-29 gEpyDY']")
	private WebElement pf;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement From;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement to;

	@FindBy(xpath = "//p[text()='Bengaluru International Airport']/ancestor::div[@class='sc-12foipm-29 gEpyDY']")
	private WebElement ben;

	public WebElement getPf() {
		return pf;
	}

	public WebElement getFrom() {
		return From;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getBen() {
		return ben;
	}

	
	@FindBy(xpath = "//p[text()='One-way']")
	private WebElement e1;
	@FindBy(xpath = "//p[text()='Enter city or airport']/ancestor::div[@class='sc-12foipm-22 kGtxGm']")
	private WebElement f;
	
	@FindBy(xpath = "//p[text()='Enter city or airport']/ancestor::div[@class='sc-12foipm-22 OmQvV']")
	private WebElement tol;
	
//	@FindBy()
//	private WebElement e;
//	@FindBy()
//	private WebElement e;
//	@FindBy()
//	private WebElement e;
//	@FindBy()
//	private WebElement e;

	public WebElement getTol() {
		return tol;
	}

	public WebElement getF() {
		return f;
	}

	public WebElement getE1() {
		return e1;
	}

	
	
	
	@FindBy(xpath = "//span[text()='Departure']")
	private WebElement depDate;
	
	@FindBy(xpath = "//div[text()='June 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='2']")
	private WebElement seldatedep;
	
	@FindBy(xpath = "//span[text()='Return']")
	private WebElement returnim;
	
	@FindBy(xpath = "//div[text()='June 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='5']")
	private WebElement returndate;
	
	@FindBy(xpath = "//span[text()='SEARCH FLIGHTS']")
	private WebElement search;


	public WebElement getDepDate() {
		return depDate;
	}

	public WebElement getSeldatedep() {
		return seldatedep;
	}

	public WebElement getReturnim() {
		return returnim;
	}

	public WebElement getReturndate() {
		return returndate;
	}

	public WebElement getSearch() {
		return search;
	}

	public void serachFlight(WebDriverUtils wlib, WebDriver driver) throws InterruptedException {
	
		getE1().click();
////		wlib.waitForVisibilityOfElement(driver, f);
////		wlib.moveToElement(driver, getF());
		getF().click();
		getFrom().click();
		getFrom().sendKeys("pun", Keys.ENTER);
		getPf().click();
		getTol().click();
		getTo().sendKeys("ben", Keys.ENTER);
		getBen().click();
		getDepDate().click();
		getSeldatedep().click();
		getReturnim().click();
		getReturndate().click();
		wlib.waitForVisibilityOfElement(driver, search);
		getSearch().click();
	}

}
