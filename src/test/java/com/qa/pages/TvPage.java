package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TvPage {
    WebDriver driver;
    public TvPage(WebDriver rdriver) {
    	this.driver = rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    //LG LCD button
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/h2/a")
    WebElement btnLgLcd;
    public WebElement getLgLcdBtn() {
    	return btnLgLcd;
    }
    
    //Samsung LCD button
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/h2/a")
    WebElement btnSamsungLcd;
    public WebElement getSamsungLcdBtn() {
    	return btnSamsungLcd;
    }
    
    //Add to cart for LG LCD
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/button")
    WebElement btnAddToCartLg;
    public WebElement getAddToCartLgBtn() {
    	return btnAddToCartLg;
    }
    
    //Add to cart button for samsung lcd
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/div[3]/button")
    WebElement btnAddToCartSamsung;
    public WebElement getAddToCartSamsungBtn() {
    	return btnSamsungLcd;
    }
    
    //Add to wishlist for lg lcd
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[1]/a")
    WebElement btnWishlistLg;
    public WebElement getWishlistLgBtn() {
    	return btnWishlistLg;
    }
    
    //add to wishlist for samsung lcd
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/div[3]/ul/li[1]/a")
    WebElement btnWishlistSamsung;
    public WebElement getWishlistSamsungBtn() {
    	return btnWishlistSamsung;
    }
    
    //add to compare for lg lcd
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/ul/li[2]/a")
    WebElement btnCompareLg;
    public WebElement getCompareLgBtn() {
    	return btnCompareLg;
    }
    
    //add to compare for samsung lcd
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[2]/div/div[3]/ul/li[2]/a")
    WebElement btnCompareSamsung;
    public WebElement getCompareSamsungBtn() {
    	return btnCompareSamsung;
    }
}
