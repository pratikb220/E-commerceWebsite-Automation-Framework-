package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyOrdersPage {
    WebDriver driver;
    public MyOrdersPage(WebDriver rdriver) {
    	this.driver = rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    //view order button for first order in the list
    @FindBy(xpath="//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/span/a[1]")
    WebElement btnViewOrder;
    public WebElement getViewOrderBtn() {
    	return btnViewOrder;
    }
    
    //reorder button
    @FindBy(xpath="//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/span/a[2]")
    WebElement btnReorder;
    public WebElement getReorderBtn() {
    	return btnReorder;
    }
    
    // Back button
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[4]/p/a")
    WebElement btnBack;
    public WebElement getBackBtn() {
    	return btnBack;
    }
}
