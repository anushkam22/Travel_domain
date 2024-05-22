package com.goibibo.generic.ObjectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.goibibo.generic.WebDriverUtility.WebDriverUtils;

public class HotelsPage extends BaseClass {

	public HotelsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//h4[text()='International']")
	private WebElement radiobtn;

	@FindBy(xpath = "//span[@data-testid='date_29_4_2024']")
	private WebElement checkin;

	@FindBy(xpath = "//span[@data-testid='date_5_6_2024']")
	private WebElement checkout;

	@FindBy(xpath = "//input[@data-testid='home-autosuggest-input']")
	private WebElement dest;

	@FindBy(xpath = "//img[@alt='https://cdn1.goibibo.com/voy_ing/t_g/New_dWeb_Homepage_Singapore-1581426530.jpg']/ancestor::ul[@id='downshift-1-menu']")
	private WebElement destpic;

	@FindBy(xpath = "//button[@data-testid='searchHotelBtn']")
	private WebElement searchbtn;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getDest() {
		return dest;
	}

	public WebElement getDestpic() {
		return destpic;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	@FindBy(xpath = "//span[text()='Couple-friendly Stays']/ancestor::div[@class=\"CheckBoxListstyles__TextCenteredDiv-sc-mib0do-1 iRQgJB\"]")
	private WebElement couplecheckoboc;

	public WebElement getCouplecheckoboc() {
		return couplecheckoboc;
	}

	public WebElement getCancellationCheckbox() {
		return cancellationCheckbox;
	}

	@FindBy(xpath = "//span[text()='Free Cancellation Available']/ancestor::div[@class='CheckBoxListstyles__TextCenteredDiv-sc-mib0do-1 iRQgJB']")
	private WebElement cancellationCheckbox;

	@FindBy(xpath = "//span[text()='Upto ₹9999']/ancestor::div[@class='CheckBoxListstyles__TextCenteredDiv-sc-mib0do-1 iRQgJB']")
	private WebElement price;

	public WebElement getPrice() {
		return price;
	}

	@FindBy(xpath = "//p[@class='sc-bvgOGf SLfCB']")
	private WebElement cross;

	@FindBy(xpath = "//span[@aria-hidden='true']")
	private WebElement e;

	public WebElement getE() {
		return e;
	}

	@FindBy(xpath = "//ul[@id='downshift-1-menu']")
	private WebElement ba;

	@FindBy(xpath = "//div[@class='HotelCardstyles__HeadingInfoWrapperDiv-sc-1s80tyk-14 knjEer']/ancestor::div[@class='infinite-scroll-component ']")
	private WebElement hotelName;

	public WebElement getHotelName() {
		return hotelName;
	}

	@FindBy(xpath = "//h4[@class='SearchBlockUIstyles__CheckInDateWrapDiv-sc-fity7j-15 gqjMMP']/ancestor::div[@data-testid='openCheckinCalendar']")
	private WebElement checkinarea;

	@FindBy(xpath = "//h4[@class='SearchBlockUIstyles__CheckInDateWrapDiv-sc-fity7j-15 gqjMMP']/ancestor::div[@data-testid='openCheckoutCalendar']")
	private WebElement checkoutarea;

	@FindBy(xpath = "//a[@href='https://www.goibibo.com/hotels-international/hotels-in-krabi-ct/']/ancestor::ul[@class='TopDestinationsUIstyles__SuggestedCardList-sc-fymb7k-3 ccpyfd']")
	private WebElement countryimg;

	public WebElement getCountryimg() {
		return countryimg;
	}

	public WebElement getBa() {
		return ba;
	}

	public WebElement getCheckinarea() {
		return checkinarea;
	}

	public WebElement getCheckoutarea() {
		return checkoutarea;
	}

	public void searchHotels(WebDriverUtils wlib, WebDriver driver) throws Throwable {

		getCross().click();
		getRadiobtn().click();
		getDest().click();
		getDest().sendKeys("Bali");
		getBa().click();

		getCheckinarea().click();
		getCheckin().click();
		getCheckoutarea().click();
		getCheckout().click();
		// Thread.sleep(20);
		getSearchbtn().click();
		getCancellationCheckbox().click();
		getCouplecheckoboc().click();
		getPrice().click();
		getHotelName().click();

	}

	@FindBy(xpath = "//h4[text()='Krabi']")
	private WebElement e2;

	@FindBy(xpath = "//h4[text()='Holiday Style Ao Nang Beach Resort']/ancestor::div[@class='HotelCardstyles__WrapperSectionMetaDiv-sc-1s80tyk-5 gHRnjK']")
	private WebElement hotel;

	@FindBy(xpath = "//input[@id='search-widget-checkin-input']/ancestor::div[@class='dwebCommonstyles__FlexItem-sc-112ty3f-4 bQXyzU']")
	private WebElement checkinp;

	public WebElement getCheckindk() {
		return checkindk;
	}

	public WebElement getCheckouk() {
		return checkouk;
	}

	@FindBy(xpath = "//span[@data-testid='date_1_5_2024']")
	private WebElement checkind;

	@FindBy(xpath = "//span[@data-testid='date_2_5_2024']")
	private WebElement checko;

	public WebElement getChecko() {
		return checko;
	}

	@FindBy(xpath = "//input[@id='search-widget-checkin-input']")
	private WebElement checkindk;

	@FindBy(xpath = "//label[text()='CHECKOUT']/ancestor::div[@class='SearchWidgetUIstyles__CheckinCheckoutWrapper-sc-1pb2jm7-3 fDXMRs']/descendant::input[@type='text']")
	private WebElement checkouk;

	@FindBy(xpath = "//button[text()='Update Search']")
	private WebElement updateSearch;

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getCheckinp() {
		return checkinp;
	}

	public WebElement getCheckind() {
		return checkind;
	}

	public WebElement getUpdateSearch() {
		return updateSearch;
	}

	public WebElement getE2() {
		return e2;
	}

	public WebElement getCross() {
		return cross;
	}

	public void searchhotel(WebDriverUtils wlib, WebDriver driver)

	{
		getCross().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement e = getCountryimg();
		getE2().click();
		getCheckind().click();
		getChecko().click();
		getE().click();
		getCancellationCheckbox().click();
		getCouplecheckoboc().click();
		getUpdateSearch().click();
		getHotel().click();
	}

}
