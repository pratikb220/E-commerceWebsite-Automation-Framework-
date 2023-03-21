package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccountPage {
    WebDriver driver;
    public CreateAnAccountPage(WebDriver rdriver) {
    	this.driver = rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    //Text field for first name
    @FindBy(xpath="//*[@id=\"firstname\"]")
    WebElement txtFirstName;
    public WebElement getFirstNameTxt() {
    	return txtFirstName;
    }
    
    //Text for middle name
    @FindBy(xpath="//*[@id=\"middlename\"]")
    WebElement txtMiddleName;
    public WebElement getMiddleNameTxt() {
    	return txtMiddleName;
    }
    
    //Test for last name
    @FindBy(xpath="//*[@id=\"lastname\"]")
    WebElement txtLastName;
    public WebElement getLastNameTxt() {
    	return txtLastName;
    }
    
    //Text for email Address
    @FindBy(xpath="//*[@id=\"email_address\"]")
    WebElement txtEmailCreate;
    public WebElement getEmailCreateTxt() {
    	return txtEmailCreate;
    }
    
    //Text for password
    @FindBy(xpath="//*[@id=\"password\"]")
    WebElement txtPasswordCreate;
    public WebElement getPasswordCreateTxt() {
    	return txtPasswordCreate;
    }
    
    //Text for confirm password
    @FindBy(xpath="//*[@id=\"confirmation\"]")
    WebElement txtConfirmPassword;
    public WebElement getConfirmPasswordTxt() {
    	return txtConfirmPassword;
    }
    
    //Checkbox to Sign Up for newsletters
    @FindBy(xpath="//*[@id=\"is_subscribed\"]")
    WebElement cbSignUp_Newsletters;
    public WebElement getSignUp_NewslettersCb() {
    	return cbSignUp_Newsletters;
    }
    
    //Register button
    @FindBy(xpath="//*[@id=\"form-validate\"]/div[2]/button")
    WebElement btnRegister;
    public WebElement getRegisterBtn() {
    	return btnRegister;
    }
}
