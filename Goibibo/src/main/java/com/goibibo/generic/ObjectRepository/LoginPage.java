package com.goibibo.generic.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(id="pass")
	private WebElement Password;
	
	@FindBy(name="send")
	private WebElement loginbtn;

	public WebElement getEmail() {
		return Email;
	}

	
	public WebElement getPassword() {
		return Password;
	}

	

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void login(String un, String pass)
	{
		getEmail().sendKeys(un);
		getPassword().sendKeys(pass);
		loginbtn.click();
	}
	
	

	

}
