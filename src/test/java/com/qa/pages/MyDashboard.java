package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyDashboard {
    WebDriver driver;
    public MyDashboard(WebDriver rdriver) {
    	this.driver = rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    //Account Dashboard Button
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[1]/a")
    WebElement btnAccDashboard;
    public WebElement getAccDashboardBtn() {
    	return btnAccDashboard;
    }
    
    //Account information button
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[2]/a")
    WebElement btnAccInfo;
    public WebElement getAccInfoBtn() {
    	return btnAccInfo;
    }
    
    //My wishlist button
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[8]/a")
    WebElement btnMyWishlist;
    public WebElement getMyWishlistBtn() {
    	return btnMyWishlist;
    }
    
    //My orders button
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div[2]/ul/li[4]/a")
    WebElement btnMyOrders;
    public WebElement getMyOrdersBtn() {
    	return btnMyOrders;
    }
}
