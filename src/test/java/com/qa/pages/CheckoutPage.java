package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;
    public CheckoutPage(WebDriver rdriver) {
    	this.driver = rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    //Billing Information
    //First name
    @FindBy(xpath="//*[@id=\"billing:firstname\"]")
    WebElement txtFirstName;
    public WebElement getFirstNameTxt() {
    	return txtFirstName;
    }
    
    //Middle name
    @FindBy(xpath="//*[@id=\"billing:middlename\"]")
    WebElement txtMiddleName;
    public WebElement getMiddleNameTxt() {
    	return txtMiddleName;
    }
    
    //Last name
    @FindBy(xpath="//*[@id=\"billing:lastname\"]")
    WebElement btnLastName;
    public WebElement getLastNameBtn() {
    	return btnLastName;
    }
    
    //Address
    @FindBy(xpath="//*[@id=\"billing:street1\"]")
    WebElement txtAddress;
    public WebElement getAddressTxt() {
    	return txtAddress;
    }
    
    //City
    @FindBy(xpath="//*[@id=\"billing:city\"]")
    WebElement txtCity;
    public WebElement getCityTxt() {
    	return txtCity;
    }
    
    //State or province
    @FindBy(xpath="//*[@id=\"billing:region_id\"]")
    WebElement selState;
    public WebElement getStateSel() {
    	return selState;
    }
    
    //Zip
    @FindBy(xpath="//*[@id=\"billing:postcode\"]")
    WebElement txtZip;
    public WebElement getZipTxt() {
    	return txtZip;
    }
    
    //Country
    @FindBy(xpath="//*[@id=\"billing:country_id\"]")
    WebElement txtCountry;
    public WebElement getCountryTxt() {
    	return txtCountry;
    }
    
    //Telephone
    @FindBy(xpath="//*[@id=\"billing:telephone\"]")
    WebElement txtTelephone;
    public WebElement getTelephoneTxt() {
    	return txtTelephone;
    }
    
    //Continue
    @FindBy(xpath="//*[@id=\"billing-buttons-container\"]/button")
    WebElement btnContinue;
    public WebElement getContinueBtn() {
    	return btnContinue;
    }
    
    //Continue button for shipping method
    @FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/button")
    WebElement btnContinueShipp;
    public WebElement getContinueShippBtn() {
    	return btnContinueShipp;
    }
    
    //Payment information
    //Checkbox for credit card
    @FindBy(xpath="//*[@id=\"p_method_ccsave\"]")
    WebElement cbCreditCard;
    public WebElement getCreditCardCb() {
    	return cbCreditCard;
    }
    
    //Checkbox for check/money order
    @FindBy(xpath="//*[@id=\"p_method_checkmo\"]")
    WebElement cbMoneyOrder;
    public WebElement getMoneyOrderCb() {
    	return cbMoneyOrder;
    }
    
    //Continue button for payment information
    @FindBy(xpath="//*[@id=\"payment-buttons-container\"]/button")
    WebElement btnContinuePayment;
    public WebElement getContinuePaymentBtn() {
    	return btnContinuePayment;
    }
    
    //Order review 
    @FindBy(xpath="//*[@id=\"review-buttons-container\"]/button")
    WebElement btnPlaceOrder;
    public WebElement getPlaceOrderBtn() {
    	return btnPlaceOrder;
    }
}

