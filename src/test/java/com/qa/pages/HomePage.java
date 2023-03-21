package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Mobile Page button
	@FindBy(xpath = "//*[@id=\"nav\"]/ol/li[1]/a")
	WebElement btnMobile;
	public WebElement getMobileBtn() {
		return btnMobile;
	}
	
	//TV Page button
	@FindBy(xpath = "//*[@id=\"nav\"]/ol/li[2]/a")
	WebElement btnTv;
	public WebElement getTvBtn() {
		return btnTv;
	}

    //My Account button
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[3]/div/div[4]/ul/li[1]/a")
	WebElement btnMyAccount;
	public WebElement getMyAccountBtn() {
		return btnMyAccount;
	}
	
	//Orders and returns
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[3]/div/div[4]/ul/li[2]/a")
	WebElement btnOrdersReturns;
	public WebElement getOrdersReturnsBtn() {
		return btnOrdersReturns;
	}
}
