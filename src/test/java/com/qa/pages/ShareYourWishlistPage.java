package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShareYourWishlistPage {
    WebDriver driver;
    public ShareYourWishlistPage(WebDriver rdriver) {
    	this.driver = rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    //Text for email addresses to send wishlists
    @FindBy(xpath="//*[@id=\"email_address\"]")
    WebElement txtEmailToSend;
    public WebElement getEmailToSendTxt() {
    	return txtEmailToSend;
    }
    
    //Text for message
    @FindBy(xpath="//*[@id=\"message\"]")
    WebElement txtMessageToSend;
    public WebElement getMessageToSendTxt() {
    	return txtMessageToSend;
    }
    
    //Share Wishlist button
    @FindBy(xpath="//*[@id=\"form-validate\"]/div[2]/button")
    WebElement btnShareWishlist;
    public WebElement getShareWishlistBtn() {
    	return btnShareWishlist;
    }
    
    //go back button
    @FindBy(xpath="//*[@id=\"form-validate\"]/div[2]/p[2]/a")
    WebElement btnGoBack;
    public WebElement getGoBackBtn() {
    	return btnGoBack;
    }
    
}
