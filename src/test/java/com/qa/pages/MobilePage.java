package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {
    WebDriver driver;
	
	public MobilePage(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Options for IPhone
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/a")
    WebElement btnIhpone;
	public WebElement getIphoneBtn() {
		return btnIhpone;
	}
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button")
    WebElement btnIhponeAddToCart;
	public WebElement getIphoneAddToCartBtn() {
		return btnIhponeAddToCart;
	}
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[1]/a")
    WebElement btnIhponeAddToWishlist;
	public WebElement getIphoneAddToWishlistBtn() {
		return btnIhponeAddToWishlist;
	}
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")
    WebElement btnIhponeAddToCompare;
	public WebElement getIphoneAddToCompareBtn() {
		return btnIhponeAddToCompare;
	}
	
	//Options for Samsung Galaxy
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/a")
    WebElement btnSamsung;
	public WebElement getSamsungBtn() {
		return btnSamsung;
	}
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/button")
    WebElement btnSamsungAddToCart;
	public WebElement getSamsungAddToCartBtn() {
		return btnSamsungAddToCart;
	}
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[1]/a")
    WebElement btnSamsungAddToWishlist;
	public WebElement getSamsungAddToWishlistBtn() {
		return btnSamsungAddToWishlist;
	}
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")
    WebElement btnSamsungAddToCompare;
	public WebElement getSamsungAddToCompareBtn() {
		return btnSamsungAddToCompare;
	}
	
	//Options for Sony Xperia
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/a")
    WebElement btnSony;
	public WebElement getSonyBtn() {
		return btnSony;
	}
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/button")
    WebElement btnSonyAddToCart;
	public WebElement getSonyAddToCartBtn() {
		return btnSonyAddToCart;
	}
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[1]/a")
    WebElement btnSonyAddToWishlist;
	public WebElement getSonyAddToWishlistBtn() {
		return btnSonyAddToWishlist;
	}
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/div[3]/ul/li[2]/a")
    WebElement btnSonyAddToCompare;
	public WebElement getSonyAddToCompareBtn() {
		return btnSonyAddToCompare;
	}
	
	//If products are added to compare
	@FindBy(partialLinkText="Compare")
	WebElement btnComapreProduct;
	public WebElement getCompareBtn() {
		return btnComapreProduct;
	}
	
	//Clear all button
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[3]/div[1]/div[2]/div/an")
	WebElement btnClearCompare;
	public WebElement getClearCompareBtn() {
		return btnClearCompare;
	}
	
}
