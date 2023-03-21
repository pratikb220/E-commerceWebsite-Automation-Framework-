package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishlistPage {
    WebDriver driver;
    public MyWishlistPage(WebDriver rdriver) {
    	this.driver = rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    //Quantity of product for my wishlist page
    @FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/table/tbody/tr/td[3]/div/div/input")
    WebElement txtQuantityWishlist;
    public WebElement getQuantityWishlistTxt() {
    	return txtQuantityWishlist;
    }
    
    //Add to cart button
    @FindBy(xpath="//*[@id=\"item_66006\"]/td[5]/div/button")
    WebElement btnAddToCart;
    public WebElement getAddToCartBtn() {
    	return btnAddToCart;
    }
    
    //Edit button for wishlist
    @FindBy(xpath="//*[@id=\"item_66006\"]/td[5]/p/a")
    WebElement btnEditWishlist;
    public WebElement getEditWishlistBtn() {
    	return btnEditWishlist;
    }
    
    //Delete button for wishlist product
    @FindBy(xpath="//*[@id=\"item_66006\"]/td[6]/a")
    WebElement btnDeleteItem;
    public WebElement getDeleteItemBtn() {
    	return btnDeleteItem;
    }
    
    //Update Wishlist button
    @FindBy(xpath="//*[@id=\"wishlist-view-form\"]/div/div/button[3]")
    WebElement btnUpdateWishlist;
    public WebElement getUpdateWishlistBtn() {
    	return btnUpdateWishlist;
    }
    
    //Add all products to cart button
    @FindBy(xpath="//*[@id=\"wishlist-view-form\"]/div/div/button[2]")
    WebElement btnAddAllProducts;
    public WebElement getAddAllProductsBtn() {
    	return btnAddAllProducts;
    }
    
    //Share wishlist button
    @FindBy(xpath="//*[@id=\"wishlist-view-form\"]/div/div/button[1]")
    WebElement btnShareWishlist;
    public WebElement getShareWishlistBtn() {
    	return btnShareWishlist;
    }
    
    //go back button
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[2]/p/a")
    WebElement btnGoBack;
    public WebElement getGoBackBtn() {
    	return btnGoBack;
    }
}
