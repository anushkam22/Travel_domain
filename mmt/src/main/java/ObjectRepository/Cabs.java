package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ShopperStack.generic.WebDriverUtility.WebDriverUtils;

public class Cabs extends BaseClass {

	public Cabs(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "downshift-1-input")
	private WebElement from;

	@FindBy(xpath = "//p[text()='Bangalore, Karnataka, India']/ancestor::div[@class='AutoSuggeststyles__KeyBoardSelectedCard-sc-1xb3zd-8 fJKcqs']")
	private WebElement locFrom;

	@FindBy(id = "downshift-2-input")
	private WebElement to;

	@FindBy(id = "downshift-2-item-0")
	private WebElement toLoc;

	@FindBy(xpath = "//span[@class='HomeSearchWidgetstyles__DateTxt-sc-1rvppov-7 kUWFbN']/ancestor::div[@class='HomeSearchWidgetstyles__PickupDate-sc-1rvppov-6 iCkPml']")
	private WebElement date;

	@FindBy(xpath = "//span[text()='31']/ancestor::li")
	private WebElement dateFixed;

	@FindBy(xpath = "//span[@class='HomeSearchWidgetstyles__DateTxt-sc-1rvppov-7 kUWFbN']/ancestor::div[@class='HomeSearchWidgetstyles__PickupTime-sc-1rvppov-8 chQRDW']")
	private WebElement pickUpTime;

	@FindBy(xpath = "//section[@class='TimeDropdownstyles__TimeDropdown-sc-ycd1i1-0 BHQbN']")
	private WebElement timedd;

	@FindBy(xpath = "//div[@class='HomeSearchWidgetstyles__ButtonWrap-sc-1rvppov-14 iZdFnM']")
	private WebElement searchbtn;

	@FindBy(xpath = "(//h4[text()='Dzire, Etios']/ancestor::div[@class='Listingstyles__ListingCard-sc-1n37j07-0 kuHnZt']/descendant::button[@name='SELECT'])[1]")
	private WebElement selectbtn;

	public WebElement getSelectbtn() {
		return selectbtn;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getLocFrom() {
		return locFrom;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getToLoc() {
		return toLoc;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDateFixed() {
		return dateFixed;
	}

	public WebElement getPickUpTime() {
		return pickUpTime;
	}

	public WebElement getTimedd() {
		return timedd;
	}

	// String t=07:30 AM;

	public void bookCab(WebDriverUtils wlib, WebDriver driver) throws InterruptedException {
		wlib.waitForVisibilityOfElement(driver, from);
		getFrom().click();
		getFrom().sendKeys("ben");
		// Thread.sleep(10);
		getLocFrom().click();
		getTo().click();
		getTo().sendKeys("mysur");
		getToLoc().click();
		getDate().click();
		getDateFixed().click();
		// getPickUpTime().click();
		// wlib.selectByText(timedd, "07:30 AM");
		getSearchbtn().click();
		wlib.waitForVisibilityOfElement(driver, selectbtn);
		// wlib.jsscrolltillele(driver, selectbtn);
		getSelectbtn().click();
	}

}
