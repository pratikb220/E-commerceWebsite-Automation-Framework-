package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOrderPage {
    WebDriver driver;
    public ViewOrderPage(WebDriver rdriver) {
    	this.driver = rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    //Reorder button
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/a[1]")
    WebElement btnReorder;
    public WebElement getReorderBtn() {
    	return btnReorder;
    }
    
    //Print order button
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/a[2]")
    WebElement btnPrintOrder;
    public WebElement getPrintOrderBtn() {
    	return btnPrintOrder;
    }
    
    //Back to my orders option
    @FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[4]/div/p/a")
    WebElement btnBack;
    public WebElement getBackBtn() {
    	return btnBack;
    }
}
