package ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.ShopperStack.generic.WebDriverUtility.WebDriverUtils;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[@href='https://www.makemytrip.com/hotels/']/ancestor::ul[@class='makeFlex font12 headerIconsGap']")
	private WebElement hotels;

	@FindBy(xpath = "//a[@href='https://www.makemytrip.com/homestays/']/ancestor::ul[@class='makeFlex font12 headerIconsGap']")
	private WebElement homestay;

	@FindBy(xpath = "//input[@placeholder='Enter Mobile Number']")
	private WebElement gg;

	@FindBy(id = "identifierId")
	private WebElement email;

	@FindBy(xpath = "//button[@data-cy='continueBtn']")
	private WebElement con;

	@FindBy(xpath = "//span[@data-cy='closeModal']")
	private WebElement des;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCon() {
		return con;
	}

	public WebElement getDes() {
		return des;
	}

	// button[@data-cy="continueBtn"]
	public WebElement getGg() {
		return gg;
	}

//	https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Faccounts.google.com%2Fgsi%2Fselect%3Fclient_id%3D365487944636-q943oq1rje9ugcbscagg2vre5om9maj0.apps.googleusercontent.com%26auto_select%3Dtrue%26ux_mode%3Dpopup%26ui_mode%3Dcard%26as%3DRlNDIRG47ytX1%2F9jKZ6S7A%26channel_id%3Db2e40707cedc83dea7af9c0ef130dbb040a8b1d69439faedd4cd22202dded124%26origin%3Dhttps%3A%2F%2Fwww.makemytrip.com&faa=1&ifkv=AaSxoQwhdzuxjV0NHWdigC3WJq-YpdyIx16BBlIsTHVkBE-AhoQQXRxWh9Nn7VaZRaJM-VU1HLSXRg&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1290953528%3A1716112546308937&ddm=0
//		//span[text()='Next']
	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getHomestay() {
		return homestay;
	}

}
