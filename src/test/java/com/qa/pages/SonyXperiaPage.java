package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SonyXperiaPage {
    WebDriver driver;
    public SonyXperiaPage(WebDriver rdriver) {
    	this.driver = rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    //Testbox for quantity of the product
    @FindBy(xpath="//*[@id=\"qty\"]")
    WebElement txtQuantity;
    public WebElement getQuantityTxt() {
    	return txtQuantity;
    }
    
    //Add to cart button
    @FindBy(xpath="//*[@id=\"product_addtocart_form\"]/div[4]/div/div/div[2]/button")
    WebElement btnSonyXperiaAddToCart;
    public WebElement getSonyXperiaAddToCartBtn() {
    	return btnSonyXperiaAddToCart;
    }
    
    //Add to wishlist button
    @FindBy(xpath="//*[@id=\"product_addtocart_form\"]/div[4]/div/ul[1]/li[1]/a")
    WebElement btnSonyXperiaAddToWishlist;
    public WebElement getSonyXperiaAddToWishlistBtn() {
    	return btnSonyXperiaAddToWishlist;
    }
    
    //Add to compare button
    @FindBy(xpath="//*[@id=\"product_addtocart_form\"]/div[4]/div/ul[1]/li[2]/a")
    WebElement btnSonyXperiaAddToCompare;
    public WebElement getSonyXperiaAddToCompareBtn() {
    	return btnSonyXperiaAddToCompare;
    }
    
}
