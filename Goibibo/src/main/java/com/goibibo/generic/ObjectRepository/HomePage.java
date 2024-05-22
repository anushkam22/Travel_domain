package com.goibibo.generic.ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.goibibo.generic.WebDriverUtility.WebDriverUtils;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[text()='Trains']")
	private WebElement trains;

	@FindBy(xpath = "//a[@href='/cars/']/ancestor::ul[@class='sc-1f95z5i-0 lNqfU']")
	private WebElement cabs;

	@FindBy(xpath = "//span[text()='Hotels']/ancestor::li[@class='sc-1f95z5i-1 hiUlsg']")
	private WebElement hotels;

	

	@FindBy(xpath = "//a[@href='/bus/']/ancestor::ul[@class='sc-1f95z5i-0 lNqfU']")
	private WebElement bus;



	public WebElement getTrains() {
		return trains;
	}



	public WebElement getCabs() {
		return cabs;
	}



	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(xpath = "//span[@class='logSprite icClose']")
	private WebElement e;



	public WebElement getBus() {
		return bus;
	}

	@FindBy(xpath = "//p[@class='sc-jlwm9r-1 ewETUe']")
	private WebElement cross;
	
	public WebElement getE() {
		return e;
	}

	public WebElement getCross() {
		return cross;
	}


	public void login() {
		getE().click();
		getCross().click();
	}

	
}
