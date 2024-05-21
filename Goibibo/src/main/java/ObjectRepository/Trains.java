package ObjectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ShopperStack.generic.WebDriverUtility.WebDriverUtils;

public class Trains extends BaseClass{

	public Trains(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	@FindBy(xpath = "//p[text()='Enter Source Name']")
	private WebElement e;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement text;

	public WebElement getE() {
		return e;
	}

	public WebElement getText() {
		return text;
	}
	
	
	@FindBy(xpath = "//p[text()='YPR']/ancestor::li[@class='styles_FswAutoCompItem__RE1dP']")
	private WebElement Station;
	
	@FindBy(xpath = "//p[text()='Enter Destination Name']")
	private WebElement to;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement textTo;
	
	@FindBy(xpath = "//p[text()='Departure']")
	private WebElement dep;
	
	@FindBy(xpath = "//p[text()='June 2024']/ancestor::div[@class='styles_calMnth__calCntWrp__d_zvI']/descendant::p[text()='1']")
	private WebElement date;
	
	@FindBy(xpath = "//span[text()='SEARCH TRAINS']")
	private WebElement search;
	
	@FindBy(xpath = "//span[text()='Udupi Railway Station']/ancestor::div[@class='styles_FswAutoCompItemLeft__9o4o_']")
	private WebElement toLoc;
	
	@FindBy(xpath = "//p[text()='Smvb Mrdw Exp']/ancestor::div[@class='TrainCard_trnCrd__wb4xP styles.trnCrd__ODT']/descendant::p[text()='GNWL 3']")
	private WebElement trainset;

	public WebElement getTrainset() {
		return trainset;
	}

	public WebElement getStation() {
		return Station;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getTextTo() {
		return textTo;
	}

	public WebElement getToLoc() {
		return toLoc;
	}
	
	
	public WebElement getDep() {
		return dep;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSearch() {
		return search;
	}

	public void trainbook(WebDriverUtils wlib,WebDriver driver) throws Throwable
	{
		getE().click();
		getText().sendKeys("ben");
		getStation().click();
		getTo().click();
		getTextTo().sendKeys("ud");
		getToLoc().click();
		getDep().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		getDate().click();
		getSearch().click();
		getTrainset().click();
	}
}
